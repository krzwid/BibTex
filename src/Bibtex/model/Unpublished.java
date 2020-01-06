package Bibtex.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @see Entry
 */
public class Unpublished extends Entry {

    public Map<String, String> fieldMap = new HashMap<>();

    public Unpublished() {
        super.name = "UNPUBLISHED";
    }

    @Override
    public List<String> getRequiredFields() {
        return Arrays.asList("author", "title", "note");
    }

    @Override
    public List<String> getOptionalFields() {
        return Arrays.asList("month", "year", "key");
    }
}
