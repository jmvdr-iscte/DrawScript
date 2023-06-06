package instructions

import expressions.Expression
import types.Color
import types.Type

open class Declaration(
    open val identity: String,
):Instruction

class color(
    override val identity: String,
    val color: String
): Declaration(identity) {
    override fun toString(): String {
        return "color(identity: $identity, color: $color)"
    }
}

class line(
    override val identity: String,
    val color: Color,
): Declaration(identity) {
    override fun toString(): String {
        return "line(color: $color)"
    }
}
