package instructions

import types.Localization
import expressions.Expression

open class Figure(
    val localization: Localization
):Instruction
    class Rectangle(
        localization: Localization,
        var width: Expression,
        var height: Expression
    ) : Figure(localization){
        fun getRectangle(){
        }
    }