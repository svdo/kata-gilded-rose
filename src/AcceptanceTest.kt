import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.PrintStream

internal class AcceptanceTest {

    @Test
    fun thirtyDays() {
        val lines = File("ThirtyDays.txt").readLines()

        val originalOut = System.out

        val baos = ByteArrayOutputStream()
        System.setOut(PrintStream(baos))

        main(emptyArray())

        System.out.flush()
        System.setOut(originalOut)

        val mainOut = baos.toString()
        val outputLines = mainOut.split("\n")
        for (i in 0 until minOf(lines.size, outputLines.size)) {
            assertEquals(lines[i], outputLines[i])
        }
    }
}