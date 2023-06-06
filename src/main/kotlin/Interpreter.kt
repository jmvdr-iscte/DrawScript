import expressions.*
import instructions.Declaration
import instructions.Figure
import instructions.Square
import properties.Background
import properties.Dimension
import types.Color
import java.awt.Graphics
import javax.swing.JComponent
import javax.swing.JFrame

data class Interpreter(
    val script: Script
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
/*
        for (instruction in script.instructions!!) {
            when (instruction) {
                is Declaration -> {
                    when (instruction.value) {
                        is types.Integer -> {
                            memory[instruction.identity] = calculateExpression(instruction.value.N, memory)
                        }

                        is Color -> {
                            val colorValue = calculateColorValue(instruction.value, memory)
                            memory[instruction.identity] = colorValue
                        }
                    }
                }

                is Figure -> {
                    when(instruction){
                        is Square -> {
                            val localization = instruction.localization
                            //save the localization and the side length on the memory
                            memory["localizationX"] = calculateExpression(localization.xValue, memory)
                            memory["localizationY"] = calculateExpression(localization.yValue, memory)
                            memory["sideLength"] = calculateExpression(instruction.sideLength, memory)


                            //save




                            // Draw a square with the given parameters
                        }

                    }
                    // Handle figure instructions
                }
            }
        }
        */

                // Create an instance of DrawScriptSkeleton and set the background color if available
                val drawScriptSkeleton = DrawScriptSkeleton()
                val backgroundColorValue = memory["background"]
                if (backgroundColorValue != null) {
                    val backgroundColor = retrieveColorFromMemory("background",memory)
                    drawScriptSkeleton.customBackground = backgroundColor
                    print(backgroundColor)
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

class DrawScriptSkeleton: JComponent() {
    var customBackground: java.awt.Color? = null
    /*var squareColor: java.awt.Color? = null
    var squareX: Int = 0
    var squareY: Int = 0
    var squareSize: Int = 0*/


    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)

        // Set the custom background color if available
        customBackground?.let {
            g.color = it
            g.fillRect(0, 0, width, height)
        }

        // Perform other custom painting operations
    }

}


