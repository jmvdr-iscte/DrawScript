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
            return Color(Literal(parseColor(rValue.text)), Literal(0), Literal(0))
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
    //return if (dimension() != null) {
    val dimension = dimension()
    val width = dimension.expression(0).toAst()
    val height = dimension.expression(1).toAst()

    return Dimension(//propid.text,
        width, height
    )
    // } else {
    //   Background( Color(background().expression().toAst(), null, null))
    //   }

}

fun DrawScriptParser.InstructionListContext.toAst(): List<Instruction> {
    return when (this.instructionList()) {
        null -> listOf(this.instruction().toAst())
        else -> instructionList().toAst() + listOf(this.instruction().toAst())
    }
}

fun DrawScriptParser.InstructionContext.toAst(): Instruction {
    return when {
        declaration() != null && declaration().expression() != null -> {
            val identity = declaration().id.text
            val value = declaration().expression().toAst()
            Declaration(identity, Text(value))
        }

        declaration() != null && declaration().r() != null && declaration().g() != null && declaration().b() != null -> {
            val identity = declaration().id.text
            val rValue = declaration().r()
            val gValue = declaration().g()
            val bValue = declaration().b()
            Declaration(
                identity,
                Color(
                    Literal(parseColor(rValue.text)),
                    Literal(parseColor(gValue.text)),
                    Literal(parseColor(bValue.text))
                )
            )
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

fun DrawScriptParser.FigureContext.toAst(): Figure {
    return when {
        figureshape() != null && figureshape().square() != null -> {
            val localizationX = expression(0).toAst()
            val localizationY = expression(1).toAst()
            val squareSide = figureshape().square().expression().toAst()
            Square(Localization(localizationX, localizationY), squareSide)
        }

        figureshape() != null && figureshape().rectangle() != null -> {
            val localizationX = expression(0).toAst()
            val localizationY = expression(1).toAst()
            val rectangleWidth = figureshape().rectangle().expression(0).toAst()
            val rectangleHeight = figureshape().rectangle().expression(1).toAst()
            Rectangle(Localization(localizationX, localizationY), rectangleWidth, rectangleHeight)
        }

        else -> {
            throw IllegalArgumentException("Invalid Figure")
        }
    }
}

fun DrawScriptParser.ControlStructureContext.toAst(): Instruction {
    return when {
        ifStatement() != null -> {
            val ifStatement = ifStatement()
            val guard = ifStatement.expression().toAst()
            val instructions = ifStatement.instructionList().toAst()
            IfElse(guard, instructions)
        }

        forLoop() != null -> {
            val forLoop = forLoop()
            val loopVariable = forLoop.PROPERTYID().text
            val lowerLimit = forLoop.interval().expression(0).toAst()
            val higherLimit = forLoop.interval().expression(1).toAst()
            val sequence = forLoop.instructionList().toAst()
            ForLoop(Variable(loopVariable), Interval(lowerLimit, higherLimit), sequence, null)
        }

        else -> {
            throw IllegalArgumentException("Invalid Control Structure")
        }
    }
}

fun main() {
    val input = "N: 8\n" +
            "SIDE: 40\n" +
            "MARGIN: 5\n" +
            "BLACK: |0|\n" +
            "WHITE: |255|\n" +
            "GRAY: |128|\n" +
            "---\n" +
            "dimension: N*SIDE + MARGIN*2 ~ N*SIDE + MARGIN*2\n" +
            "background: GRAY\n" +
            "---\n" +
            "color BLACK\n" +
            "for l in [0,N[\n" +
            "  for c in [0,N[\n" +
            "    if (l + c) % 2 = 0\n" +
            "      fill WHITE\n" +
            "    \n" +
            "      fill BLACK\n" +
            "    _\n" +
            "    square c * SIDE + MARGIN,l * SIDE + MARGIN SIDE\n" +
            "  _\n" +
            "_\n" +
            "line 0|0|255|\n" +
            "rectangle MARGIN,MARGIN N*SIDE ~ N*SIDE\n"

    val lexer = DrawScriptLexer(CharStreams.fromString(input))
    val parser = DrawScriptParser(CommonTokenStream(lexer))
    val script = parser.script()
    println(script.toAst())
}