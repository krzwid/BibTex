package Bibtex.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inbook extends Entry {

    public Map<String, String> fieldMap = new HashMap<>();

    private static String name = "INBOOK";

//    public String volume;
//    public String number;
//    public String series;
//    public String type;
//    public String address;
//    public String edition;
//    public String month;
//    public String note;
//    public String key;

    @Override
    public List<String> getRequiredFields() {
        return Arrays.asList("author", "title", "chapter", "publisher", "year");
    }

    @Override
    public List<String> getOptionalFields() {
        return null;
    }
}
