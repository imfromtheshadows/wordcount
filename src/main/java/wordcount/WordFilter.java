package wordcount;

import java.util.List;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.toList;

public class WordFilter implements Filter {
    private final Pattern pattern;

    public WordFilter(final Pattern pattern) {
        this.pattern = pattern;
    }

    public List<String> filter(final List<String> words) {
        return words.stream()
                .filter((it) -> pattern.matcher(it).matches())
                .collect(toList());
    }
}
