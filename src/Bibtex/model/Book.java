package Bibtex.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Book extends Entry {

    public Map<String, String> fieldMap = new HashMap<>();

//    private static String name = "ARTICLE";

    public Book() {
        super.name = "ARTICLE";
    }

    @Override
    public List<String> getRequiredFields() {
        return Arrays.asList("author", "title", "publisher", "year");
    }

    @Override
    public List<String> getOptionalFields() {
        return Arrays.asList("volume", "series", "address", "edition", "month", "note", "key");
    }
}
