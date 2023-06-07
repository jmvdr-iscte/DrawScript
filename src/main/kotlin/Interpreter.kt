import controlstructures.ControlStructure
import controlstructures.ForLoop
import controlstructures.IfElse
import expressions.*
import instructions.*
import properties.Background
import properties.Dimension
import types.Color
import java.awt.Graphics
import javax.swing.JComponent
import javax.swing.JFrame

data class Interpreter(
    val script: Script,
) {

    fun run() {
        val memory = mutableMapOf<String, Int>()
        for (constant in script.constants) {
            when (constant.value) {
                is types.Integer -> {
                    memory[constant.identity] = calculateExpression(constant.value.N, memory)
                }

                is Color -> {
                    val colorValue = calculateColorValue(constant.value, memory)
                    memory[constant.identity] = colorValue
                }
            }
        }
        for (property in script.properties) {
            when (property) {
                is Background -> {
                    val colorValue = memory[property.color]
                    if (colorValue != null) {
                        memory["background"] = colorValue
                    } else {
                        // Handle case when color value is not found in memory
                        // You can throw an exception or handle it according to your requirements
                    }
                }

                is Dimension -> {
                    val width = calculateExpression(property.width, memory)
                    val height = calculateExpression(property.height, memory)
                    memory["dimension_width"] = width
                    memory["dimension_height"] = height
                }
            }
        }
        executeInstructions(script.instructions, memory)
        setupWindow(memory)
    }

    private fun executeInstructions(instructions: List<Instruction>, memory: MutableMap<String, Int>) {
        for (instruction in instructions) {
            when (instruction) {
                is Declaration -> {
                    when (instruction) {
                        is FigureColor -> {
                            val colorValue = memory[instruction.color]
                            if (colorValue != null) {
                                memory[instruction.identity] = colorValue
                            }
                        }

                        is Line -> {
                            val colorValue = calculateColorValue(instruction.color, memory)
                            if (colorValue != null) {
                                memory[instruction.identity] = colorValue
                            }
                        }
                        // Handle other types of declarations if needed
                    }
                }

                is Figure -> {
                    when (instruction) {
                        is Square -> {
                            val localization = instruction.localization
                            // Save the localization and the side length in the memory
                            memory["localizationXsquare"] = calculateExpression(localization.xValue, memory)
                            memory["localizationYsquare"] = calculateExpression(localization.yValue, memory)
                            memory["sideLengthSquare"] = calculateExpression(instruction.sideLength, memory)
                        }

                        is Rectangle -> {
                            val localization = instruction.localization
                            // Save the localization and the side length in the memory
                            memory["localizationXrectangle"] = calculateExpression(localization.xValue, memory)
                            memory["localizationYrectangle"] = calculateExpression(localization.yValue, memory)
                            memory["widthRectangle"] = calculateExpression(instruction.width, memory)
                            memory["heightRectangle"] = calculateExpression(instruction.height, memory)
                        }

                        is Ellipse -> {
                            val localization = instruction.localization
                            // Save the localization and the side length in the memory
                            memory["localizationXellipse"] = calculateExpression(localization.xValue, memory)
                            memory["localizationYellipse"] = calculateExpression(localization.yValue, memory)
                            memory["horizontalRadius"] = calculateExpression(instruction.horizontalRadius, memory)
                            memory["verticalRadius"] = calculateExpression(instruction.verticalRadius, memory)
                        }

                        is Circle -> {
                            val localization = instruction.localization
                            // Save the localization and the side length in the memory
                            memory["localizationXcircle"] = calculateExpression(localization.xValue, memory)
                            memory["localizationYcircle"] = calculateExpression(localization.yValue, memory)
                            memory["radius"] = calculateExpression(instruction.radius, memory)
                        }
                        // Handle other types of figures if needed
                    }
                }

                is ControlStructure -> {
                    when (instruction) {
                        is IfElse -> {
                            val guardResult = calculateExpression(instruction.guard, memory)
                            val sequenceToExecute =
                                if (guardResult == 0) instruction.sequence else instruction.alternative
                            sequenceToExecute?.let { sequence ->
                                executeInstructions(sequence, memory)
                            }
                        }
                        // Handle other types of control structures if needed
                    }
                }
                // Handle other types of instructions if needed
            }
        }
    }

    // Create an instance of DrawScriptSkeleton and set the background color if available
    private fun setupWindow(memory: MutableMap<String, Int>) {
        val drawScriptSkeleton = DrawScriptSkeleton()
        val backgroundColorValue = memory["background"]

        //val colorFigures = memory[memory.keys.lastOrNull()]
        val localizationXsquare = memory["localizationXsquare"]
        val localizationYsquare = memory["localizationYsquare"]
        val sideLengthSquare = memory["sideLengthSquare"]
        val widthRectangle = memory["widthRectangle"]
        val heightRectangle = memory["heightRectangle"]
        val localizationXrectangle = memory["localizationXrectangle"]
        val localizationYrectangle = memory["localizationYrectangle"]
        val localizationXellipse = memory["localizationXellipse"]
        val localizationYellipse = memory["localizationYellipse"]
        val horizontalRadius = memory["horizontalRadius"]
        val verticalRadius = memory["verticalRadius"]
        val localizationXcircle = memory["localizationXcircle"]
        val localizationYcircle = memory["localizationYcircle"]
        val radius = memory["radius"]

        /* if (colorFigures != null) {
             drawScriptSkeleton.colorFigures = retrieveColorFromMemory(memory.keys.lastOrNull()!!,memory)
         }*/

        if (backgroundColorValue != null) {
            val backgroundColor = retrieveColorFromMemory("background", memory)
            drawScriptSkeleton.customBackground = backgroundColor

        }



        if (localizationXsquare != null && localizationYsquare != null) {
            drawScriptSkeleton.localizationXsquare = localizationXsquare
            drawScriptSkeleton.localizationYsquare = localizationYsquare

        }


        if (sideLengthSquare != null) {
            drawScriptSkeleton.sideLengthSquare = sideLengthSquare

        }

        if (widthRectangle != null && heightRectangle != null) {
            drawScriptSkeleton.widthRectangle = widthRectangle
            drawScriptSkeleton.heightRectangle = heightRectangle

        }

        if (localizationXrectangle != null && localizationYrectangle != null) {
            drawScriptSkeleton.localizationXrectangle = localizationXrectangle
            drawScriptSkeleton.localizationYrectangle = localizationYrectangle

        }

        if (localizationXellipse != null && localizationYellipse != null) {
            drawScriptSkeleton.localizationXellipse = localizationXellipse
            drawScriptSkeleton.localizationYellipse = localizationYellipse

        }

        if (horizontalRadius != null && verticalRadius != null) {
            drawScriptSkeleton.horizontalRadius = horizontalRadius
            drawScriptSkeleton.verticalRadius = verticalRadius

        }

        if (localizationXcircle != null && localizationYcircle != null) {
            drawScriptSkeleton.localizationXcircle = localizationXcircle
            drawScriptSkeleton.localizationYcircle = localizationYcircle

        }

        if (radius != null) {
            drawScriptSkeleton.radius = radius
        }


        // Perform other actions with the memory values if needed

        // Display the DrawScriptSkeleton component
        val frame = JFrame("DrawScript")
        frame.contentPane.add(drawScriptSkeleton)
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.setSize(memory["dimension_width"] ?: 800, memory["dimension_height"] ?: 600)

        frame.isVisible = true


    }


    private fun calculateColorValue(color: Color, memory: MutableMap<String, Int>): Int {
        val rValue = calculateExpression(color.rValue, memory)
        val gValue = color.gValue?.let { calculateExpression(it, memory) } ?: 0
        val bValue = color.bValue?.let { calculateExpression(it, memory) } ?: 0

        // Perform any necessary calculations to convert color components to an integer value
        return (rValue and 0xFF) shl 16 or ((gValue and 0xFF) shl 8) or (bValue and 0xFF)
    }

    private fun calculateExpression(expression: Expression, memory: MutableMap<String, Int>): Int {
        print(memory)
        return when (expression) {
            is Variable -> memory[expression.valId]!!
            is Literal -> expression.value
            is BinaryExpression -> {
                val left = calculateExpression(expression.left, memory)
                val right = calculateExpression(expression.right, memory)
                when (expression.operator) {
                    Operator.PLUS -> left + right
                    Operator.MINUS -> left - right
                    Operator.TIMES -> left * right
                    Operator.DIVIDE -> left / right
                    Operator.EQUAL -> {
                        if (left == right) {
                            0
                        } else {
                            1
                        }

                    }

                    Operator.MORE -> {
                        if (left > right) {
                            0
                        } else {
                            1
                        }
                    }

                    Operator.LESS -> {
                        if (left < right) {
                            0
                        } else {
                            1
                        }
                    }

                    Operator.MOD -> {
                        if (left < right) {
                            0
                        } else {
                            1
                        }
                    }
                }
            }

            else -> 0
        }
    }


    private fun retrieveColorFromMemory(key: String, memory: MutableMap<String, Int>): java.awt.Color {
        val colorValue = memory[key] ?: throw IllegalArgumentException("Color value not found in memory")

        // Extract the individual RGB components from the color value using bit shifting and masking
        val rValue = (colorValue shr 16) and 0xFF
        val gValue = (colorValue shr 8) and 0xFF
        val bValue = colorValue and 0xFF

        // Create a Color object with the extracted RGB values
        return java.awt.Color(rValue, gValue, bValue)
    }
}

class DrawScriptSkeleton : JComponent() {
    var customBackground: java.awt.Color? = null
    var colorFigures: java.awt.Color? = java.awt.Color(0, 0, 0)
    var localizationXsquare: Int? = 0
    var localizationYsquare: Int? = 0
    var sideLengthSquare: Int? = 0
    var widthRectangle: Int? = 0
    var heightRectangle: Int? = 0
    var localizationXrectangle: Int? = 0
    var localizationYrectangle: Int? = 0
    var localizationXellipse: Int? = 0
    var localizationYellipse: Int? = 0
    var horizontalRadius: Int? = 0
    var verticalRadius: Int? = 0
    var localizationXcircle: Int? = 0
    var localizationYcircle: Int? = 0
    var radius: Int? = 0


    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)

        // Set the custom background color if available
        customBackground?.let {
            g.color = it
            g.fillRect(0, 0, width, height)
        }

        colorFigures?.let {
            g.color = it
            g.fillRect(localizationXsquare!!, localizationYsquare!!, sideLengthSquare!!, sideLengthSquare!!)
            g.fillRect(localizationXrectangle!!, localizationYrectangle!!, widthRectangle!!, heightRectangle!!)
            g.fillOval(localizationXellipse!!, localizationYellipse!!, horizontalRadius!!, verticalRadius!!)
            g.fillOval(localizationXcircle!!, localizationYcircle!!, radius!!, radius!!)
        }


        // Perform other custom painting operations
    }

}


