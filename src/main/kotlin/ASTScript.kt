import constants.Constant
import expressions.*
import instructions.Declaration
import instructions.Instruction
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import properties.Background
import properties.Dimension
import properties.Property
import types.Color
import types.Integer
import types.Text
import types.Type

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
    return if (dimension() != null) {
        val dimension = dimension()
        val width = dimension.expression(0).toAst()
        val height = dimension.expression(1).toAst()

        Dimension(propid.text, width, height)
    } else {
        Background(propid.text, Color(background().expression().toAst(), null, null))
    }
}

fun DrawScriptParser.InstructionListContext.toAst(): List<Instruction> {
    return when (this.instructionList()) {
        null -> listOf(this.instruction().toAst())
        else -> instructionList().toAst() + listOf(this.instruction().toAst())
    }
}

fun DrawScriptParser.InstructionContext.toAst(): Instruction {
    if (declaration().expression() != null) {
        val identity = declaration().id.text
        val value = declaration().expression().toAst()
        return Declaration(identity, Text(value))
    }
    val identity = declaration().id.text
    val rValue = declaration().r()
    val gValue = declaration().g()
    val bValue = declaration().b()
    return Declaration(
        identity,
        Color(Literal(parseColor(rValue.text)), Literal(parseColor(gValue.text)), Literal(parseColor(bValue.text))))
}

fun main() {
    val input =
        "N: 8\n" + "SIDE: 40\n" + "MARGIN: 5\n" + "BLACK: |0|\n" + "WHITE: |255|\n" + "GRAY: |128|\n" + "---\n" + "dimension: N*SIDE + MARGIN*2 ~ N*SIDE + MARGIN*2\n" + "background: GRAY\n" + "---\n" + "color BLACK\n" + "line |9|89|8|"
    val lexer = DrawScriptLexer(CharStreams.fromString(input))
    val parser = DrawScriptParser(CommonTokenStream(lexer))
    val script = parser.script()
    println(script.toAst())
}
