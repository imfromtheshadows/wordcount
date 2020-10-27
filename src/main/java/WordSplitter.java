import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordSplitter implements Splitter {
    @Override
    public List<String> split(String line) {
        if (line.isEmpty()) {
            return Collections.emptyList();
        }
        return Arrays.asList(line.split(" "));
    }
}
