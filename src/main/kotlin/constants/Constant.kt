package constants

import types.Type

data class Constant(
    val identity: String,
    val value: Type
){
    fun getId(): String{
        return identity
    }
}
