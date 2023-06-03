package properties

import expressions.Expression

data class Dimension(
    val width:Expression,
    val height: Expression
):Property
