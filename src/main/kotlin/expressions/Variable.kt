package expressions

data class Variable(
    val valId: String
) : Expression {

    override fun toString(): String {
        return valId
    }
}
