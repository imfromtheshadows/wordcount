import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordCounterTest {

    private WordCounter sut;
    private WordFilter wordFilter;
    public static final String PATTERN = "\\b[^\\d\\W]?[a-zA-Z]+\\b";

    @BeforeEach
    void setUp() {
        wordFilter = new WordFilter(PATTERN);
        sut = new WordCounter();
    }

    @Test
    void count() {
        Integer actual = sut.count(Arrays.asList("I", "am", "writing"), wordFilter);

        assertEquals(3, actual);
    }
}
