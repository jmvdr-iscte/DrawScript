import constants.Constant
import instructions.Instruction
import properties.Property

data class Script(
    val constants: List<Constant>,
    val properties: List<Property>,
    val instructions: List<Instruction>,
) {

}
