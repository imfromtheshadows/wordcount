package wordcount;

import org.junit.jupiter.api.Test;
import wordcount.ConsoleWriter;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ConsoleWriterTest {

    @Test
    void writes_text_to_console() {
        ByteArrayOutputStream outSpy = new ByteArrayOutputStream();
        ConsoleWriter writer = new ConsoleWriter(new PrintStream(outSpy));
        final String expected = "expected output";

        writer.writeToConsole(expected);

        assertEquals(expected, outSpy.toString());
    }
}
