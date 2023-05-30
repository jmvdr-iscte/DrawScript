import constants.Constant
import expressions.Expression
import expressions.Literal
import instructions.Instruction
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import properties.Property
import types.Color
import types.Integer
import types.Type

fun DrawScriptParser.ScriptContext.toAst(): Script {
    return Script(this.constantList().toAst(), null, null)
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
    if (N() != null) {
        return Integer(Literal(N().text.toInt()))
    } else if (r() != null && g() != null && b() != null) {
        val rValue = r().COLOR()
        val gValue = g().COLOR()
        val bValue = b().COLOR()
        return Color(
            Literal(parseColor(rValue.text)),
            Literal(parseColor(gValue.text)),
            Literal(parseColor(bValue.text))
        )
    } else if (r() != null && g() != null) {
        val rValue = r().COLOR()
        val gValue = g().COLOR()
        return Color(Literal(parseColor(rValue.text)),Literal(parseColor(gValue.text)), Literal(0))
    }
    val rValue = r().COLOR()
    return Color(Literal(parseColor(rValue.text)), Literal(0), Literal(0))
}

/*
fun DrawScriptParser.ExpressionContext.toAst(): Expression {

}


fun DrawScriptParser.PropertyListContext.toAst(): List<Property> {
    return when (this.propertyList()) {
        null -> listOf(this.property().toAst())
        else -> propertyList().toAst() + listOf(this.property().toAst())
    }
}

fun DrawScriptParser.InstructionListContext.toAst(): List<Instruction> {
    return when (this.instructionList()) {
        null -> listOf(this.instruction().toAst())
        else -> instructionList().toAst() + listOf(this.instruction().toAst())
    }
}
*/

fun main() {
    val input = "N: 8\n" +
            "SIDE: 40\n" +
            "MARGIN: 5\n" +
            "BLACK: |0|9|\n" +
            "WHITE: |255|\n" +
            "GRAY: |128|\n"
    val lexer = DrawScriptLexer(CharStreams.fromString(input))
    val parser = DrawScriptParser(CommonTokenStream(lexer))
    val script = parser.script()
    println(script.toAst())
}
