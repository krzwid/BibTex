package Bibtex.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Misc extends Entry {

    public Map<String, String> fieldMap = new HashMap<>();

    private static String name = "MISC";

//    public String author;
//    public String title;
//    public String howpublished;
//    public String month;
//    public String year;
//    public String note;
//    public String key;



    @Override
    public List<String> getRequiredFields() {
        return Arrays.asList("");
    }

    @Override
    public List<String> getOptionalFields() {
        return null;
    }
}
