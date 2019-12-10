package Bibtex.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Entry {
    protected String name;

    public Map<String, String> fieldMap = new HashMap<>();

    abstract List<String> getRequiredFields();
    abstract List<String> getOptionalFields();

    public String getName() {
        return name;
    }
}
