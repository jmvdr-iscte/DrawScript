import controlstructures.ControlStructure
import controlstructures.ForLoop
import controlstructures.IfElse
import expressions.*
import instructions.*
import properties.Background
import properties.Dimension
import types.Color
import java.awt.Graphics
import java.util.*
import javax.swing.JComponent
import javax.swing.JFrame

data class Interpreter(
    val script: Script,
) {

    fun run() {
        val memory = mutableMapOf<String, Any>()
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

    private fun executeInstructions(instructions: List<Instruction>, memory: MutableMap<String, Any>) {
        for (instruction in instructions) {
            when (instruction) {
                is Declaration -> {
                    when (instruction) {
                        is FigureColor -> {
                            val colorValue = memory[instruction.color]
                            if (colorValue != null) {
                                memory["figureColor"] = colorValue
                            }
                        }

                        is Line -> {
                            val lineColor = calculateColorValue(instruction.color, memory)
                            if (lineColor != null) {
                                memory["lineColor"] = lineColor
                            }
                        }
                        // Handle other types of declarations if needed
                    }
                }

                is Figure -> {
                    when (instruction) {
                        is Square -> {
                            val localization = instruction.localization
                            val figureId = generateUniqueFigureId()
                            val figureMemory = mutableMapOf<String, Any>(
                                "localizationX" to calculateExpression(localization.xValue, memory),
                                "localizationY" to calculateExpression(localization.yValue, memory),
                                "sideLength" to calculateExpression(instruction.sideLength, memory)
                            )
                            memory[figureId] = figureMemory
                        }

                        is Rectangle -> {
                            val localization = instruction.localization
                            val figureId = generateUniqueFigureId()
                            val figureMemory = mutableMapOf<String, Any>(
                                "localizationX" to calculateExpression(localization.xValue, memory),
                                "localizationY" to calculateExpression(localization.yValue, memory),
                                "width" to calculateExpression(instruction.width, memory),
                                "height" to calculateExpression(instruction.height, memory)
                            )

                            memory[figureId] = figureMemory
                        }

                        is Ellipse -> {
                            val localization = instruction.localization
                            val figureId = generateUniqueFigureId()

                            val figureMemory = mutableMapOf<String, Any>(
                                "localizationX" to calculateExpression(localization.xValue, memory),
                                "localizationY" to calculateExpression(localization.yValue, memory),
                                "horizontalRadius" to calculateExpression(instruction.horizontalRadius, memory),
                                "verticalRadius" to calculateExpression(instruction.verticalRadius, memory)
                            )
                            memory[figureId] = figureMemory

                        }

                        is Circle -> {
                            val localization = instruction.localization
                            val figureId = generateUniqueFigureId()
                            val figureMemory = mutableMapOf<String, Any>(
                                "localizationX" to calculateExpression(localization.xValue, memory),
                                "localizationY" to calculateExpression(localization.yValue, memory),
                                "radius" to calculateExpression(instruction.radius, memory)
                            )
                            memory[figureId] = figureMemory
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

                        is ForLoop -> {
                            val initial = calculateExpression(instruction.interval.lowerLimit, memory)
                            val end = calculateExpression(instruction.interval.higherLimit, memory)
                            for (value in initial until end) {

                                memory[instruction.initialCharacter.valId] = value
                                executeInstructions(instruction.sequence, memory)
                            }
                        }
                    }
                }
                // Handle other types of instructions if needed
            }
        }
    }

    private fun generateUniqueFigureId(): String {
        // Generate a unique identifier for each figure instance
        return UUID.randomUUID().toString()
    }

    // Create an instance of DrawScriptSkeleton and set the background color if available
    private fun setupWindow(memory: MutableMap<String, Any>) {
        val drawScriptSkeleton = DrawScriptSkeleton()
        val backgroundColorValue = memory["background"]
        val colorFigures = memory["figureColor"]
        val lineColor = memory["lineColor"]


        if (colorFigures != null) {
            drawScriptSkeleton.colorFigures = retrieveColorFromMemory("figureColor", memory)
        }

        if (lineColor != null) {
            drawScriptSkeleton.lineColor = retrieveColorFromMemory("lineColor", memory)
        }

        if (backgroundColorValue != null) {
            val backgroundColor = retrieveColorFromMemory("background", memory)
            drawScriptSkeleton.customBackground = backgroundColor

        }

        drawScriptSkeleton.memory = memory


        // Perform other actions with the memory values if needed

        // Display the DrawScriptSkeleton component
        val frame = JFrame("DrawScript")
        frame.contentPane.add(drawScriptSkeleton)
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        val dimensionWidth = memory["dimension_width"]?.toString()?.toIntOrNull() ?: 800
        val dimensionHeight = memory["dimension_height"]?.toString()?.toIntOrNull() ?: 600
        frame.setSize(dimensionWidth, dimensionHeight)


        frame.isVisible = true

    }


    private fun calculateColorValue(color: Color, memory: MutableMap<String, Any>): Int {
        val rValue = calculateExpression(color.rValue, memory)
        val gValue = color.gValue?.let { calculateExpression(it, memory) } ?: 0
        val bValue = color.bValue?.let { calculateExpression(it, memory) } ?: 0

        // Perform any necessary calculations to convert color components to an integer value
        return (rValue and 0xFF) shl 16 or ((gValue and 0xFF) shl 8) or (bValue and 0xFF)
    }

    private fun calculateExpression(expression: Expression, memory: MutableMap<String, Any>): Int {
        return when (expression) {
            is Variable -> memory[expression.valId]!! as Int
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


    private fun retrieveColorFromMemory(key: String, memory: MutableMap<String, Any>): java.awt.Color {
        val colorValue: Int = memory[key] as? Int ?: throw IllegalArgumentException("Color value not found in memory")

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
    var memory: MutableMap<String, Any> = mutableMapOf()
    var lineColor: java.awt.Color? = null



    override fun paintComponent(g: Graphics) {

        super.paintComponent(g)

        // Set the custom background color if available
        customBackground?.let {
            g.color = it
            g.fillRect(0, 0, width, height)
        }

        memory.forEach { (figureId, figureData) ->
            val mutableFigureData = figureData as? MutableMap<String, Any>
            mutableFigureData?.let { data ->
                when {
                    "sideLength" in data -> {
                        val x = data["localizationX"] as? Int ?: 0
                        val y = data["localizationY"] as? Int ?: 0
                        val sideLength = data["sideLength"] as? Int ?: 0

                        colorFigures?.let {
                            g.color = it
                            g.fillRect(x, y, sideLength, sideLength)


                            lineColor?.let { lineColor ->
                                g.color = lineColor
                                g.drawRect(x, y, sideLength, sideLength)
                            }
                        }
                    }

                    "width" in data && "height" in data -> {
                        val x = data["localizationX"] as? Int ?: 0
                        val y = data["localizationY"] as? Int ?: 0
                        val width = data["width"] as? Int ?: 0
                        val height = data["height"] as? Int ?: 0

                        colorFigures?.let {
                            g.color = it
                            g.fillRect(x, y, width, height)

                            lineColor?.let { lineColor ->
                                g.color = lineColor
                                g.drawRect(x, y, width, height)
                            }

                        }
                    }

                    "horizontalRadius" in data && "verticalRadius" in data -> {
                        val x = data["localizationX"] as? Int ?: 0
                        val y = data["localizationY"] as? Int ?: 0
                        val horizontalRadius = data["horizontalRadius"] as? Int ?: 0
                        val verticalRadius = data["verticalRadius"] as? Int ?: 0

                        colorFigures?.let {
                            g.color = it
                            g.fillOval(x, y, horizontalRadius, verticalRadius)

                            lineColor?.let { lineColor ->
                                g.color = lineColor
                                g.drawOval(x, y, horizontalRadius, verticalRadius)
                            }
                        }
                    }

                    "radius" in data -> {
                        val x = data["localizationX"] as? Int ?: 0
                        val y = data["localizationY"] as? Int ?: 0
                        val radius = data["radius"] as? Int ?: 0

                        colorFigures?.let {
                            g.color = it
                            g.fillOval(x, y, radius, radius)

                            lineColor?.let { lineColor ->
                                g.color = lineColor
                                g.drawOval(x, y, radius, radius)
                            }
                        }
                    }
                }
            }
        }
    }

}


