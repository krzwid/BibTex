package Bibtex.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Booklet extends Entry {
    public Map<String, String> fieldMap = new HashMap<>();

    private static String name = "BOOKLET";

//    public String author;
//    public String howpublished;
//    public String address;
//    public String month;
//    public String year;
//    public String note;
//    public String key;


    @Override
    public List<String> getRequiredFields() {
        return Arrays.asList("title");
    }

    @Override
    public List<String> getOptionalFields() {
        return null;
    }
}
