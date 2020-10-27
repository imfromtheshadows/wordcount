import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WordFilterTest {
    private WordFilter sut;

    @BeforeEach
    void setUp() {
        sut = new WordFilter(Main.MY_PATTERN);
    }

    @ParameterizedTest
    @CsvSource({
            "I",
            "humpty"
    })
    void matches_words(final String word) {
        assertTrue(sut.matches(word));
    }

    @ParameterizedTest
    @CsvSource({
            "I8",
            "4m",
            "humpty-dumpty"
    })
    void skips_words(final String word) {
        assertFalse(sut.matches(word));
    }
}
