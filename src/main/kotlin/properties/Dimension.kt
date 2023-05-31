package properties

import expressions.Expression

data class Dimension(
    val identification: String,
    val width:Expression,
    val height: Expression
):Property


