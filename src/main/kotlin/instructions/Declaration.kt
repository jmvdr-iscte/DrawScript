package instructions

import types.Color
import types.Type

open class Declaration(

):Instruction

class FigureColor(
    val color: Type,
): Declaration() {
    override fun toString(): String {
        return "figureColor(color: $color)"
    }
}

class Line(
    val color: Type,
): Declaration() {
    override fun toString(): String {
        return "line(color: $color)"
    }
}

class Fill(
    val color: Type,
): Declaration() {
    override fun toString(): String {
        return "fill(color: $color)"

    }
}
