import constants.Constant
import expressions.BinaryExpression
import expressions.Literal
import expressions.Operator
import expressions.Variable
import properties.Background
import properties.Dimension
import types.Color
import types.Integer
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
            Constant("Black", Color(Literal(255), null, null)),
            Constant("White", Color(Literal(255), Literal(255), Literal(255)))

        ),
        listOf(
            Background("Black"),
            Dimension(
                Variable("R"),
                BinaryExpression(Variable("N"), Operator.PLUS, Variable("R"))
            )
        ),
        null
    )

    val interpreter = Interpreter(script)
    interpreter.run()

}



