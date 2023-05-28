package constants

import expressions.Expression

data class Integer(
    val N: Expression
){
    fun getN():Expression{
        return N
    }
}
