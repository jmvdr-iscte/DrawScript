package controlstructures

import expressions.Expression
import instructions.Instruction

data class IfElse(
    val guard: Expression,
    val sequence: List<Instruction>,
    val alternative: List<Instruction>?,

    ) : ControlStructure