package constants

import constants.Constants
import expressions.Expression

data class Color (
    val rValue: Expression,
    val gValue: Expression,
    val bValue: Expression,
): Constants {
}