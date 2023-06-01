import instructions.Instruction
import java.text.FieldPosition

data class SequenceIterator(
    val instructions: List<Instruction>,
    var current: Int = 0,
    val top: SequenceStack?
) {
    fun hasNext(): Boolean {
        return current < instructions.size
    }

    fun next(): Instruction {
        return instructions[current++]
    }
}