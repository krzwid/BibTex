package Bibtex.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @see Entry
 */
public class Inproceedings extends Entry {

    public Map<String, String> fieldMap = new HashMap<>();

    public Inproceedings() {
        super.name = "INPROCEEDINGS";
    }
    @Override
    public List<String> getRequiredFields() {
        return Arrays.asList("author", "title", "booktitle", "year");
    }

    @Override
    public List<String> getOptionalFields() {
        return Arrays.asList("editor", "volume", "series", "pages", "address", "month", "organization", "publisher", "note", "key");
    }
}
