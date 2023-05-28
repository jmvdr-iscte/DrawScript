package expressions

data class BinaryExpression(
    val left: Expression,
    val operator: Operator,
    val right: Expression
) : Expression {

    override fun toString(): String {
        return "${left} $operator ${right}"
    }

}
