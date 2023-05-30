package types

import expressions.Expression

data class Localization (
    val xValue: Expression,
    val yValue: Expression

): Type{

    fun getY(): Expression {
        return yValue
    }
    fun getX(): Expression {
        return xValue
    }
}