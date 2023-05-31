package instructions

import expressions.Expression
import types.Type

data class Declaration(
    val identity: String,
    val value: Type
):Instruction
