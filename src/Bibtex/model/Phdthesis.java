package Bibtex.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @see Entry
 */
public class Phdthesis extends Entry {

    public Map<String, String> fieldMap = new HashMap<>();

    public Phdthesis() {
        super.name = "PHDTHESIS";
    }

    @Override
    public List<String> getRequiredFields() {
        return Arrays.asList("author", "title", "school", "year");
    }

    @Override
    public List<String> getOptionalFields() {
        return Arrays.asList("type", "address", "month", "note", "key");
    }
}
