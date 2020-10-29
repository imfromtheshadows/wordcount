package wordcount;

import java.util.List;

public interface Filter {
    List<String> filter(final List<String> strings);
}
