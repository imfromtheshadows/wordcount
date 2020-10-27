import java.util.Objects;
import java.util.Scanner;

public class ConsoleReader {
    private Scanner scanner;

    public ConsoleReader(Scanner scanner) {
        if (Objects.nonNull(scanner)) {
            this.scanner = scanner;
        }
    }

    public String readLine() {
        return scanner.nextLine();
    }
}
