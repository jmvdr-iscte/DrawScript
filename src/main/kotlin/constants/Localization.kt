package constants

import expressions.Expression

data class Localization (
    val xValue: Expression,
    val yValue: Expression

): Constants{

    fun getY(): Expression {
        return yValue
    }
    fun getX(): Expression {
        return xValue
    }
}