package instructions

import types.Localization
import expressions.Expression

open class Figure(

) : Instruction

class Rectangle(
    val localization: Localization,
    var width: Expression,
    var height: Expression
) : Figure() {
    override fun toString(): String {
        return "Square(localization: $localization, width: $width, height: $height)"
    }
}


class Square(
    val localization: Localization,
    var sideLength: Expression
) : Figure() {
    override fun toString(): String {
        return "Square(localization: $localization, side: $sideLength)"
    }
}

class Ellipse(
    val localization: Localization,
    var horizontalRadius: Expression,
    var verticalRadius: Expression
) : Figure()

class Circle(
    val localization: Localization,
    var radius: Expression
) : Figure()


