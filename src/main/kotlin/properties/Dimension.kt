package properties

import expressions.Expression

data class Dimension(
    val width:Expression,
    val height: Expression
){
    fun getWidth(): Expression{
        return width
    }

    fun getHeight(): Expression{
        return height
    }
}
