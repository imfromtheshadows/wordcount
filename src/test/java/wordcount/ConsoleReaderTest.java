package wordcount;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConsoleReaderTest {

    @Test
    void reads_text_from_console() {
        ByteArrayInputStream outSpy = new ByteArrayInputStream("expected input\n".getBytes());
        ConsoleReader reader = new ConsoleReader(new Scanner(outSpy));
        final String expected = "expected input";

        String actual = reader.read();

        assertEquals(expected, actual);
    }
}
