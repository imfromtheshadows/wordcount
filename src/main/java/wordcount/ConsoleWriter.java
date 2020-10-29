package wordcount;

import java.io.PrintStream;
import java.util.Objects;

public class ConsoleWriter {

    private PrintStream printStream;

    public ConsoleWriter(final PrintStream out) {
        if (Objects.nonNull(out)) {
            this.printStream = out;
        }
    }

    public void writeToConsole(final String text) {
        printStream.print(text);
    }
}
