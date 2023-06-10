import constants.Constant
import errors.DuplicateConstant
import errors.InvalidColorParameter
import errors.WrongReference
import expressions.*
import instructions.Declaration
import instructions.Instruction
import instructions.Line
import properties.Background
import properties.Dimension
import properties.Property
import types.Color

data class Script(
    val constants: List<Constant>,
    val properties: List<Property>,
    val instructions: List<Instruction>,
) {

    fun validate(): Boolean {
        val existingIdentities = mutableSetOf<String>()
        for (constant in constants) {
            if (existingIdentities.contains(constant.identity)) {
                throw DuplicateConstant("Duplicate constant found ${constant.identity}", null)
            } else {
                existingIdentities.add(constant.identity)
            }
            when (constant.value) {
                is Color -> {
                    val rValue = calculateColor(constant.value.rValue)
                    val gValue = calculateColor(constant.value.gValue)
                    val bValue = calculateColor(constant.value.bValue)

                    if ((rValue!! > 255) || (rValue < 0)) {
                        throw InvalidColorParameter("Invalid color parameter found $rValue", null)
                    }
                    if (gValue != null && ((gValue > 255) || (gValue < 0))) {
                        throw InvalidColorParameter("Invalid color parameter found $gValue", null)
                    }
                    if (bValue != null && ((bValue > 255) || (bValue < 0))) {
                        throw InvalidColorParameter("Invalid color parameter found $bValue", null)
                    }
                }
            }
        }
        val backgroundCount = properties.filterIsInstance<Background>().size
        if (backgroundCount > 1) {
            throw DuplicateConstant("Only one instance of Background is allowed.", null)
        }

        val dimensionCount = properties.filterIsInstance<Dimension>().size
        if (dimensionCount > 1) {
            throw DuplicateConstant("Only one instance of Dimension is allowed.", null)
        }
      
        for (instruction in instructions) {
            when (instruction) {
                is Declaration -> {
                    when (instruction) {
                        is Line -> {
                            val rValue = calculateColor(instruction.color.rValue)
                            val gValue = calculateColor(instruction.color.gValue)
                            val bValue = calculateColor(instruction.color.bValue)

                            if ((rValue!! > 255) || (rValue < 0)) {
                                throw InvalidColorParameter("Invalid color parameter found $rValue", null)
                            }
                            if (gValue != null && ((gValue > 255) || (gValue < 0))) {
                                throw InvalidColorParameter("Invalid color parameter found $gValue", null)
                            }
                            if (bValue != null && ((bValue > 255) || (bValue < 0))) {
                                throw InvalidColorParameter("Invalid color parameter found $bValue", null)
                            }
                        }
                    }
                }
            }
        }

        return true
    }

    private fun calculateColor(expression: Expression?): Int? {
        return when (expression) {
            is Literal -> expression.value

            else -> return null
        }
    }
}