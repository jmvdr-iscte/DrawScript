package instructions

import types.Color

open class Declaration(

):Instruction

class FigureColor(
    val color: String
): Declaration() {
    override fun toString(): String {
        return "figureColor(color: $color)"
    }
}

class Line(
    val color: Color,
): Declaration() {
    override fun toString(): String {
        return "line(color: $color)"
    }
}

class Fill(
    val color: String
): Declaration() {
    override fun toString(): String {
        return "fill(color: $color)"

    }
}
