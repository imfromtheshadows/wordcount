import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordSplitterTest {

    @ParameterizedTest
    @CsvSource({
            "one, 1",
            "two words, 2"})
    void split_by_space(final String input, final Integer expected) {
        final WordSplitter wordSplitter = new WordSplitter();
        List<String> actual = wordSplitter.split(input);

        assertEquals(expected, actual.size());
    }
}
