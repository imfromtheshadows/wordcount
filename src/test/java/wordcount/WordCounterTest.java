package wordcount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import wordcount.WordCounter;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordCounterTest {

    private WordCounter sut;

    @BeforeEach
    void setUp() {
        sut = new WordCounter();
    }

    @Test
    void count() {
        Integer actual = sut.count(Arrays.asList("I", "am", "writing"));

        assertEquals(3, actual);
    }
}
