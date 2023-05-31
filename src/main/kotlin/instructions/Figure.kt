package instructions

import types.Localization
import expressions.Expression

open class Figure(

) : Instruction

class Rectangle(
    localization: Localization,
    var width: Expression,
    var height: Expression
) : Figure()

class Square(
    localization: Localization,
    var sideLength: Expression
) : Figure()


class Ellipse(
    localization: Localization,
    var horizontalRadius: Expression,
    var verticalRadius: Expression
) : Figure()

class Circle(
    localization: Localization,
    var radius: Expression
) : Figure()
