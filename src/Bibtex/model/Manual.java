package Bibtex.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Manual extends Entry {
    public Map<String, String> fieldMap = new HashMap<>();

    public Manual() {
        super.name = "MANUAL";
    }

    @Override
    public List<String> getRequiredFields() {
        return Arrays.asList("title");
    }

    @Override
    public List<String> getOptionalFields() {
        return Arrays.asList("author", "organization", "address", "edition", "month", "year", "note", "key");
    }
}
