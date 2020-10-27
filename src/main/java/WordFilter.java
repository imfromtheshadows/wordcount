import java.util.regex.Pattern;

public class WordFilter {
    private final String pattern;

    public WordFilter(final String pattern) {
        this.pattern = pattern;
    }

    public boolean matches(final String word) {
        return Pattern.matches(pattern, word);
    }
}
