package Bibtex.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inbook extends Entry {

    public Map<String, String> fieldMap = new HashMap<>();

    //private static String name = "INBOOK";

    public Inbook() {
        super.name = "INBOOK";
    }

    @Override
    public List<String> getRequiredFields() {
        return Arrays.asList("author", "title", "chapter", "publisher", "year");
    }

    @Override
    public List<String> getOptionalFields() {
        //volume lub number
        return Arrays.asList("volume", "number", "series", "type", "address", "edition", "month", "note", "key");
    }

}
