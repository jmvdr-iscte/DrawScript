package instructions

import types.Color

open class Declaration(
    open val identity: String,
):Instruction

class FigureColor(
    override val identity: String,
    val color: String
): Declaration(identity) {
    override fun toString(): String {
        return "color(identity: $identity, color: $color)"
    }
}

class Line(
    override val identity: String,
    val color: Color,
): Declaration(identity) {
    override fun toString(): String {
        return "line(color: $color)"
    }
}
