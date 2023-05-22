package constants

import constants.Constants
import expressions.Expression

data class Dimension (
    val width: Expression,
    val height:  Expression
): Constants {
}