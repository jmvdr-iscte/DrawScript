package expressions



data class Integer (
     val N :Int
    ): Expression {
    fun getN() : Int{
        return N
    }
override fun toString(): String{
    return "The value is  $N "
}
}
