import java.util.List;
import java.util.Scanner;

public class Main {
    public static String MY_PATTERN = "\\b[^\\d\\W]?[a-zA-Z]+\\b";

    public static void main(String[] args) {
        ConsoleWriter writer = new ConsoleWriter(System.out);
        writer.writeToConsole("Enter text: ");

        ConsoleReader consoleReader = new ConsoleReader(new Scanner(System.in));
        String input = consoleReader.readLine();

        Splitter wordSplitter = new WordSplitter();
        List<String> words = wordSplitter.split(input);

        WordFilter wordFilter = new WordFilter(MY_PATTERN);

        WordCounter wordCounter = new WordCounter();
        writer.writeToConsole(String.format("Number of words: %d", wordCounter.count(words, wordFilter)));
    }
}
