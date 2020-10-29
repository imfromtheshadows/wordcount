package wordcount;

import java.util.List;

public class WordCounter implements Counter {
    @Override
    public Integer count(final List<String> words) {
        return words.size();
    }
}
