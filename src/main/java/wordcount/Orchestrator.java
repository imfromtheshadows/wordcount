package wordcount;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Orchestrator {

    public static Pattern MY_PATTERN = Pattern.compile("\\b[^\\d\\W]?[a-zA-Z]+\\b");

    public void run() {
//        ConsoleWriter writer = new ConsoleWriter(System.out);
//        writer.writeToConsole("Enter text: ");
        System.out.println("Enter text: ");
        ConsoleReadable consoleReader = new ConsoleReader(new Scanner(System.in));
        String input = consoleReader.read();

//        word handler
        Splitter wordSplitter = new WordSplitter();
        List<String> words = wordSplitter.split(input);

        Filter wordFilter = new WordFilter(MY_PATTERN);
        List<String> filtered = wordFilter.filter(words);

        WordCounter wordCounter = new WordCounter();
        Integer count = wordCounter.count(filtered);

        writer.writeToConsole(String.format("Number of words: %d", count));
    }
}
