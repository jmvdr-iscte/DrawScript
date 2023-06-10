import constants.Constant
import controlstructures.ForLoop
import expressions.BinaryExpression
import expressions.Literal
import expressions.Operator
import expressions.Variable
import instructions.*
import properties.Background
import properties.Dimension
import types.*

fun main() {
    val script = Script(
        listOf(
            Constant("N", types.Integer(Literal(600))),
            Constant("R", types.Integer(Literal(1600))),
            Constant("Red", Color(Literal(255), null, null)),
            Constant("White", Color(Literal(255), Literal(255), Literal(255))),
            Constant("Green", Color(Literal(0), Literal(255), Literal(0))),
            Constant("Black", Color(Literal(0), Literal(0), Literal(0)))




        ),
        listOf(
            Background(Text("Red")),
            Dimension(
                Variable("R"),
                BinaryExpression(Variable("N"), Operator.PLUS, Variable("R"))
            )

        ),
        listOf(

            ForLoop(
                Variable("a"), Interval(Literal(0), Literal(5)), listOf(

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

            FigureColor(Color(Literal(0), Literal(100), Literal(0))),
            FigureColor(Color(Literal(0), Literal(255), Literal(0))),
            
            Ellipse(
                Localization(
                    Literal(500),
                    Literal(500)
                ),
                Literal(200),
                Literal(100)
            ),
            Square(
                Localization(
                    Literal(100),
                    Literal(100)
                ),
                Literal(100)
            ),
            Square(
                Localization(
                    Literal(201),
                    Literal(100)
                ),
                Literal(100)
            ),

            Fill(Text("White")),
            Circle(
                Localization(
                    Literal(800),
                    Literal(500)
                ),
                Literal(300)
            ),

            Fill(Text("Black")),

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



