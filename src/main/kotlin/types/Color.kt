package types

import expressions.Expression

data class Color(
    val rValue: Expression,
    val gValue: Expression?,
    val bValue: Expression?,
) : Type {
}