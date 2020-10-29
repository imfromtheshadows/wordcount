package wordcount;

import java.util.List;

public interface Splitter {
    List<String> split(final String line);
}
