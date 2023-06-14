import controlstructures.ControlStructure
import controlstructures.ForLoop
import controlstructures.IfElse
import errors.WrongReference
import expressions.*
import instructions.*
import properties.Background
import properties.Dimension
import types.Color
import types.Text
import types.Type
import java.awt.Graphics
import java.util.*
import javax.swing.JComponent
import javax.swing.JFrame

open class Interpreter(
    val script: Script,
) {

    fun run() {
        if (script.validate()) {
            val memory = mutableMapOf<String, Any>()
            for (constant in script.constants) {
                when (constant.value) {
                    is types.Integer -> {
                        memory[constant.identity] = calculateExpression(constant.value.N, memory)
                    }

                    is Color -> {
                        val colorValue = constant.value
                        memory[constant.identity] = colorValue
                    }
                }
            }

            if (script.properties != null) {
                for (property in script.properties) {
                    when (property) {
                        is Background -> {
                            val colorValue = memory[calculateType(property.color)]
                            if (colorValue != null) {
                                memory["background"] = colorValue
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
            }
            executeInstructions(script.instructions, memory)
            setupWindow(memory)
        }
    }
}


private fun calculateType(type: Type): Any {
    return when (type) {

        is Text -> {
            type.textInput
        }

        is Color -> {
            type
        }

        else -> {
            throw WrongReference(" wrong type reference", null)
        }
    }
}

private fun executeInstructions(instructions: List<Instruction>, memory: MutableMap<String, Any>) {
    for (instruction in instructions) {
        when (instruction) {
            is Declaration -> {
                when (instruction) {
                    is FigureColor -> {
                        when (instruction.color) {
                            is Color -> {
                                val colorValue = instruction.color
                                if (colorValue != null) {
                                    memory["figureColor"] = colorValue
                                }
                            }

                            is Text -> {
                                val colorValue = memory[calculateType(instruction.color)]
                                if (colorValue != null) {
                                    memory["figureColor"] = colorValue
                                }
                            }

                            else -> {
                                throw WrongReference("Wrong reference on ${instruction.color}", null)
                            }
                        }

                    }

                    is Line -> {
                        val lineColor = calculateType(instruction.color) as Color
                        memory["lineColor"] = lineColor
                    }


                    is Fill -> {
                        val Id = generateUniqueFigureId()
                        val colorValue = retrieveColorFromMemory(calculateType(instruction.color) as String, memory)
                        memory[Id] = colorValue

                    }
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

                    else -> throw Exception("Invalid figure")
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
        }
    }
}

private fun generateUniqueFigureId(): String {
    return UUID.randomUUID().toString()
}

private fun setupWindow(memory: MutableMap<String, Any>) {
    val drawScriptSkeleton = DrawScriptSkeleton()
    val backgroundColorValue = memory["background"]
    val colorFigures = memory["figureColor"]
    val lineColor = memory["lineColor"]


    if (colorFigures != null) {
        drawScriptSkeleton.colorFigures = retrieveColorFromMemory("figureColor", memory)
        drawScriptSkeleton.colorCopy = retrieveColorFromMemory("figureColor", memory)
    }

    if (lineColor != null) {
        drawScriptSkeleton.lineColor = retrieveColorFromMemory("lineColor", memory)
    }

    if (backgroundColorValue != null) {
        val backgroundColor = retrieveColorFromMemory("background", memory)
        drawScriptSkeleton.customBackground = backgroundColor

    }

    drawScriptSkeleton.memory = memory


    val frame = JFrame("DrawScript")
    frame.contentPane.add(drawScriptSkeleton)
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    val dimensionWidth = memory["dimension_width"]?.toString()?.toIntOrNull() ?: 800
    val dimensionHeight = memory["dimension_height"]?.toString()?.toIntOrNull() ?: 600
    frame.setSize(dimensionWidth, dimensionHeight)
    // for test proposes
    //frame.setSize(dimensionWidth+17, dimensionHeight+40)
    frame.isVisible = true

}

private fun calculateExpression(expression: Any, memory: MutableMap<String, Any>): Int {

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
                Operator.MOD -> {
                    left % right
                }

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

            }
        }

        else -> 0
    }
}


private fun retrieveColorFromMemory(key: String, memory: MutableMap<String, Any>): java.awt.Color {
    val colorValue: Color = memory[key] as? Color ?: throw WrongReference("color $key not found in memory", null)

    val rValue = calculateExpression(colorValue.rValue, memory)
    val gValue = calculateExpression(colorValue.gValue!!, memory)
    val bValue = calculateExpression(colorValue.bValue!!, memory)


    return java.awt.Color(rValue, gValue, bValue)
}


class DrawScriptSkeleton : JComponent() {
    var customBackground: java.awt.Color? = java.awt.Color(255, 0, 0)
    var colorFigures: java.awt.Color? = java.awt.Color(0, 0, 0)
    var memory: MutableMap<String, Any> = mutableMapOf()
    var lineColor: java.awt.Color? = null
    var colorCopy: java.awt.Color? = null


    override fun paintComponent(g: Graphics) {

        super.paintComponent(g)
        customBackground?.let {
            g.color = it
            g.fillRect(0, 0, width, height)
        }

        memory.forEach { (key, value) ->

            when (value) {
                is MutableMap<*, *> -> {
                    val mutableFigureData = value as? MutableMap<*, *>

                    mutableFigureData?.let { data ->
                        when {
                            "sideLength" in data -> {
                                val x = data["localizationX"] as? Int ?: 0
                                val y = data["localizationY"] as? Int ?: 0
                                val sideLength = data["sideLength"] as? Int ?: 0

                                colorFigures?.let {
                                    g.color = it
                                    g.fillRect(x, y, sideLength, sideLength)

                                    colorFigures = colorCopy

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

                                    colorFigures = colorCopy

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

                                    colorFigures = colorCopy

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

                                    colorFigures = colorCopy

                                    lineColor?.let { lineColor ->
                                        g.color = lineColor
                                        g.drawOval(x, y, radius, radius)
                                    }
                                }
                            }

                            else -> {
                                throw IllegalArgumentException("Unknown figure type")
                            }
                        }
                    }


                }

                is java.awt.Color -> {
                    val color = value as? java.awt.Color
                    colorFigures = color

                }
            }

        }
    }
}



