package Bibtex.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Booklet extends Entry {
    public Map<String, String> fieldMap = new HashMap<>();

   // private static String name = "BOOKLET";

    public Booklet() {
        super.name = "BOOKLET";
    }
    @Override
    public List<String> getRequiredFields() {
        return Arrays.asList("title");
    }

    @Override
    public List<String> getOptionalFields() {
        return Arrays.asList("author", "howpublished", "address", "month", "year", "note", "key");
    }
}
