import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter text: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Splitter wordSplitter = new WordSplitter();
        wordSplitter.split(input);
    }
}
