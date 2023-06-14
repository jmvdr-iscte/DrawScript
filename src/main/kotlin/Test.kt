import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream


fun main() {

    val inputColorfulSquare = "N: 10\n" +
            "SIDE: 40\n" +
            "MARGIN: 5\n" +
            "RED: |255|0|0|\n" +
            "GREEN: |0|255|0|\n" +
            "BLUE: |0|0|255|\n" +
            "---\n" +
            "for l in [0,N[\n" +
            "  for c in [0,N[\n" +
            "    if (l + c) % 3 = 1\n" +
            "      fill GREEN\n" +
            "    else\n" +
            "      fill BLUE\n" +
            "    _\n" +
            "   \n" +
            "    circle c * SIDE + MARGIN,l * SIDE + MARGIN SIDE\n" +
            "_\n" +
            "_\n" +
            "line|0|0|0|\n"

    val inputMagicSquare= "N: 7\n" +
            "SIDE: 30\n" +
            "MARGIN: 10\n" +
            "RED: |255|0|0|\n" +
            "BLUE: |0|0|255|\n" +
            "WHITE: |255|255|255|\n" +
            "---\n" +
            "dimension: N*SIDE + MARGIN*2 ~ N*SIDE + MARGIN*2\n" +
            "background: WHITE\n" +
            "---\n" +
            "for l in [0,N[\n" +
            "  for c in [0,N[\n" +
            "    if l % 2 = 0\n" +
            "      if c % 2 = 0\n" +
            "        color RED\n" +
            "      else\n" +
            "        fill BLUE\n" +
            "      _\n" +
            "    else\n" +
            "      if c % 2 = 0\n" +
            "        fill BLUE\n" +
            "      else\n" +
            "        fill RED\n" +
            "      _\n" +
            "    _\n" +
            "    rectangle c*SIDE + MARGIN, l*SIDE + MARGIN SIDE ~ SIDE\n" +
            "  _\n" +
            "_\n" +
            "line|0|0|0|\n"

    val input = "N: 8\n" +
            "SIDE: 40\n" +
            "MARGIN: 5\n" +
            "BLACK: |0|\n" +
            "WHITE: |255|\n" +
            "GRAY: |128|\n" +
            "---\n" +
            "dimension: N*SIDE + MARGIN*2 ~ N*SIDE + MARGIN*2\n" +
            "background: GRAY\n" +
            "---\n" +
            "color BLACK\n" +
            "rectangle MARGIN,MARGIN N*SIDE ~ N*SIDE\n" +
            "for l in [0,N[\n" +
            "  for c in [0,N[\n" +
            "    if (l + c) % 2 = 0\n" +
            "      fill WHITE\n" +
            "    else\n" +
            "      fill BLACK\n" +
            "    _\n" +
            "    square c * SIDE + MARGIN,l * SIDE + MARGIN SIDE\n" +
            "  _\n" +
            "_\n" +
            "line |0|0|255|\n"

    val lexer = DrawScriptLexer(CharStreams.fromString(inputMagicSquare))
    val parser = DrawScriptParser(CommonTokenStream(lexer))
    val script = parser.script()
    val interpreter = Interpreter(script.toAst())
    interpreter.run()
}