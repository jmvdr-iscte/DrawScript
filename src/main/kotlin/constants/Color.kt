package constants

import expressions.Expression

data class Color (
    val rValue: Expression,
    val gValue: Expression?,
    val bValue: Expression?,
): Constant {
}