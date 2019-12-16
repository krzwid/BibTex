package Bibtex.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Incollection extends Entry {

    public Map<String, String> fieldMap = new HashMap<>();

    // private static String name = "INCOLLECTION";

    public Incollection() {
        super.name = "INCOLLECTION";
    }

    @Override
    public List<String> getRequiredFields() {
        return Arrays.asList("author", "title", "booktitle", "publisher", "year");
    }

    @Override
    public List<String> getOptionalFields() {
//        volume lub number
        return Arrays.asList("editor", "volume", "series", "type", "chapter", "pages", "address", "edition", "month", "note", "key");
    }
}
