import constants.Constant
import controlstructures.ForLoop
import controlstructures.IfElse
import expressions.*
import instructions.*
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import properties.Background
import properties.Dimension
import properties.Property
import types.*

fun DrawScriptParser.ScriptContext.toAst(): Script {
    return Script(this.constantList().toAst(), this.propertyList().toAst(), this.instructionList().toAst())
}

fun DrawScriptParser.ConstantListContext.toAst(): List<Constant> {
    return when (this.constantList()) {
        null -> listOf(this.constant().toAst())
        else -> constantList().toAst() + listOf(this.constant().toAst())
    }
}

fun DrawScriptParser.ConstantContext.toAst(): Constant {
    val identity = constid.text
    val value = constval.toAst()
    return Constant(identity, value)
}

fun parseColor(colorInput: String): Int {
    val cleanedInput = colorInput.replace("|", "")
    return cleanedInput.toInt()
}

fun DrawScriptParser.ValueContext.toAst(): Type {
    when {
        N() != null -> {
            return Integer(Literal(N().text.toInt()))
        }

        r() != null && g() != null && b() != null -> {
            val rValue = r().COLOR()
            val gValue = g().COLOR()
            val bValue = b().COLOR()
            return Color(
                Literal(parseColor(rValue.text)), Literal(parseColor(gValue.text)), Literal(parseColor(bValue.text))
            )
        }

        r() != null && g() != null -> {
            val rValue = r().COLOR()
            val gValue = g().COLOR()
            return Color(Literal(parseColor(rValue.text)), Literal(parseColor(gValue.text)), Literal(0))
        }

        else -> {
            val rValue = r().COLOR()
            return Color(
                Literal(parseColor(rValue.text)),
                Literal(parseColor(rValue.text)),
                Literal(parseColor(rValue.text))
            )
        }
    }
}


fun DrawScriptParser.ExpressionContext.toAst(): Expression {
    return when {
        ID() != null -> Variable(ID().text)
        N() != null -> Literal(N().text.toInt())
        PROPERTYID() != null -> Variable(PROPERTYID().text)
        PLUS() != null -> {
            val left = expression(0).toAst()
            val right = expression(1).toAst()
            BinaryExpression(left, Operator.PLUS, right)
        }

        MINUS() != null -> {
            val left = expression(0).toAst()
            val right = expression(1).toAst()
            BinaryExpression(left, Operator.MINUS, right)
        }

        DIVIDE() != null -> {
            val left = expression(0).toAst()
            val right = expression(1).toAst()
            BinaryExpression(left, Operator.DIVIDE, right)
        }

        TIMES() != null -> {
            val left = expression(0).toAst()
            val right = expression(1).toAst()
            BinaryExpression(left, Operator.TIMES, right)
        }

        MOD() != null -> {
            val left = expression(0).toAst()
            val right = expression(1).toAst()
            BinaryExpression(left, Operator.MOD, right)
        }

        EQUALS() != null -> {
            val left = expression(0).toAst()
            val right = expression(1).toAst()
            BinaryExpression(left, Operator.EQUAL, right)
        }

        else -> {
            throw IllegalArgumentException("Invalid Operator")
        }
    }
}


fun DrawScriptParser.PropertyListContext.toAst(): List<Property> {
    return when (this.propertyList()) {
        null -> listOf(this.property().toAst())
        else -> propertyList().toAst() + listOf(this.property().toAst())
    }
}

fun DrawScriptParser.PropertyContext.toAst(): Property {
    return when (propid.text) {
        "dimension" -> {
            val dimension = dimension()
            val width = dimension.expression(0).toAst()
            val height = dimension.expression(1).toAst()
            Dimension(
                width, height
            )
        }

        "background" -> {
            Background(Text(PROPERTYID().text))
        }

        else -> throw Exception("Property not found: $propid")
    }
}

fun DrawScriptParser.InstructionListContext.toAst(): List<Instruction> {
    return when (this.instructionList()) {
        null -> listOf(this.instruction().toAst())
        else -> instructionList().toAst() + listOf(this.instruction().toAst())
    }
}

fun DrawScriptParser.InstructionContext.toAst(): Instruction {
    return when {
        declaration() != null -> {
            declaration().toAst()
        }

        controlStructure() != null -> {
            controlStructure().toAst()
        }

        figure() != null -> {
            figure().toAst()
        }

        else -> {
            throw IllegalArgumentException("Invalid Instruction")
        }
    }
}

fun DrawScriptParser.DeclarationContext.toAst(): Declaration {
    return when {
        id.text.equals("color") -> {
            FigureColor(Text(decvalue().text))
        }

        id.text.equals("line") -> {
            Line(
                Color(
                    Literal(parseColor(decvalue().r().text)),
                    Literal(parseColor(decvalue().g().text)),
                    Literal(parseColor(decvalue().b().text))
                )
            )
        }

        id.text.equals("fill") -> {
            Fill(Text(decvalue().text))
        }

        else -> throw IllegalArgumentException("Invalid Declaration")
    }
}

fun DrawScriptParser.FigureContext.toAst(): Figure {
    when {
        figureshape() != null && figureshape().singleparameter() != null -> {
            val localizationX = expression(0).toAst()
            val localizationY = expression(1).toAst()
            val figureParameter = figureshape().singleparameter().expression().toAst()
            if (id.text == "square") {
                return Square(Localization(localizationX, localizationY), figureParameter)
            } else if (id.text == "circle") {
                return Circle(Localization(localizationX, localizationY), figureParameter)
            }
        }

        figureshape() != null && figureshape().doubleparameter() != null -> {
            val localizationX = expression(0).toAst()
            val localizationY = expression(1).toAst()
            val leftParameter = figureshape().doubleparameter().expression(0).toAst()
            val rightParameter = figureshape().doubleparameter().expression(1).toAst()
            if (id.text == "rectangle") {
                return Rectangle(Localization(localizationX, localizationY), leftParameter, rightParameter)
            } else if (id.text == "ellipse") {
                return Ellipse(Localization(localizationX, localizationY), leftParameter, rightParameter)
            }
        }
    }

    throw IllegalArgumentException("Invalid Figure")
}


fun DrawScriptParser.ControlStructureContext.toAst(): Instruction {
    when {
        ifStatement() != null -> {
            val ifStmt = ifStatement()
            val guard = ifStmt.expression().toAst()
            val sequence = ifStmt.instructionList(0).toAst()
            val alternative = if (ifStmt.instructionList().size > 1) {
                ifStmt.instructionList(1).toAst()
            } else {
                null
            }
            return IfElse(guard, sequence, alternative)
        }

        forLoop() != null -> {
            val forLoopStmt = forLoop()
            val loopVariable = forLoopStmt.PROPERTYID().text
            val lowerLimit = forLoopStmt.interval().expression(0).toAst()
            val higherLimit = forLoopStmt.interval().expression(1).toAst()
            val sequence = forLoopStmt.instructionList().toAst()
            return ForLoop(Variable(loopVariable), Interval(lowerLimit, higherLimit), sequence)
        }

        else -> {
            throw IllegalArgumentException("Invalid Control Structure")
        }
    }
}


fun main() {
    val input = "N: 8\n" +
            "SIDE: 40\n" +
            "MARGIN: 0\n" +
            "BLACK: |0|\n" +
            "WHITE: |255|\n" +
            "GRAY: |128|\n" +
            "---\n" +
            "dimension: N*SIDE + MARGIN*2 ~ N*SIDE + MARGIN*2\n" +
            "background: GRAY\n" +
            "---\n" +
            "color BLACK\n" +
            "rectangle MARGIN,MARGIN N*SIDE ~ N*SIDE\n" +
            "for l in [0,N[\n" +
            "  for c in [0,N[\n" +
            "    if (l + c) % 2 = 0\n" +
            "      fill WHITE\n" +
            "    else\n" +
            "      fill BLACK\n" +
            "    _\n" +
            "    square c * SIDE + MARGIN,l * SIDE + MARGIN SIDE\n" +
            "  _\n" +
            "_\n" +
            "line |0|0|255|\n"

    val lexer = DrawScriptLexer(CharStreams.fromString(input))
    val parser = DrawScriptParser(CommonTokenStream(lexer))
    val script = parser.script()
    print(script.toAst())
    val interpreter = Interpreter(script.toAst())
    interpreter.run()
}



