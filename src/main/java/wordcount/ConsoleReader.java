package wordcount;

import java.util.Objects;
import java.util.Scanner;

public class ConsoleReader implements ConsoleReadable {
    private Scanner scanner;

    public ConsoleReader(Scanner scanner) {
        if (Objects.nonNull(scanner)) {
            this.scanner = scanner;
        }
    }

    public String read() {
        return scanner.nextLine();
    }
}
