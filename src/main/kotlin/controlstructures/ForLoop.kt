package controlstructures

import SequenceIterator
import expressions.Variable
import instructions.Instruction
import types.Interval

data class ForLoop(
    val initialCharacter: Variable,
    val interval: Interval,
    val sequence: List<Instruction>,
) : ControlStructure
