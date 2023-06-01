package types

import expressions.Expression

data class Interval(
    val lowerLimit: Expression,
    val higherLimit: Expression
)