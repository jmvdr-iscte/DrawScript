import constants.Constant
import controlstructures.IfElse
import expressions.BinaryExpression
import expressions.Literal
import expressions.Operator
import expressions.Variable
import instructions.*
import properties.Background
import properties.Dimension
import types.Color
import types.Integer
import types.Localization
import types.Type
import java.awt.Graphics
import java.awt.Graphics2D
import javax.swing.JComponent
import javax.swing.JFrame

fun main() {
    val script = Script(
        listOf(
            Constant("N", types.Integer(Literal(100))),
            Constant("R", types.Integer(Literal(80))),
            Constant("Red", Color(Literal(255), null, null)),
            Constant("White", Color(Literal(255), Literal(255), Literal(255))),
            Constant("Green", Color(Literal(0), Literal(255), Literal(0)))




        ),
        listOf(
            Background("Red"),
            Dimension(
                Variable("R"),
                BinaryExpression(Variable("N"), Operator.PLUS, Variable("R"))
            )

        ),
        listOf(
            IfElse(
                BinaryExpression(Literal(3), Operator.EQUAL, Literal(3)),
                listOf(
                    Square(
                        Localization(
                            Literal(200),
                            Literal(200)
                        ),
                        Literal(200)
                    ),
                    Square(
                        Localization(
                            Literal(200),
                            Literal(500)
                        ),
                        Literal(200)
                    )
                ), listOf(
                    Rectangle(
                        Localization(
                            Literal(100),
                            Literal(100)
                        ),
                        Literal(200),
                        Literal(100)
                    )
                )
            ),
            FigureColor("Green"),
            Ellipse(
                Localization(
                    Literal(500),
                    Literal(500)
                ),
                Literal(200),
                Literal(100)
            ),
            FigureColor("Green"),
            Circle(
                Localization(
                    Literal(800),
                    Literal(500)
                ),
                Literal(300)
            ),

            Circle(
                Localization(
                    Literal(800),
                    Literal(50)
                ),
                Literal(300)
            ),
        )
    )

    val interpreter = Interpreter(script)
    interpreter.run()

}



