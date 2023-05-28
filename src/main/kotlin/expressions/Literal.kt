package expressions

data class Literal(
  val value: Int
) : Expression {
    override fun toString(): String {
        return value.toString()
    }
}
