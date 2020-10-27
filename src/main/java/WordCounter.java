import java.util.List;

public class WordCounter {
    Integer count(final List<String> words, final WordFilter wordFilter) {
        return (int) words.stream()
                .filter(wordFilter::matches)
                .count();
    }
}
