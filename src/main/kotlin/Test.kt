import constants.Constant
import controlstructures.ForLoop
import controlstructures.IfElse
import expressions.BinaryExpression
import expressions.Literal
import expressions.Operator
import expressions.Variable
import instructions.*
import properties.Background
import properties.Dimension
import types.*
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

            ForLoop(
                Variable("a"), Interval(Literal(0), Literal(5)), listOf(
                    FigureColor("Green"),
                    Ellipse(

                        Localization(
                            BinaryExpression(Literal(50), Operator.TIMES, Variable("a")),
                            Literal(50)
                        ),
                        Literal(20),
                        Literal(15)
                    ),
                )
            ),

            Line(
                Color(
                    Literal(0),
                    Literal(0),
                    Literal(255)
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



