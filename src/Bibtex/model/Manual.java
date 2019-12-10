package Bibtex.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Manual extends Entry {
    public Map<String, String> fieldMap = new HashMap<>();

    private static String name = "MANUAL";

//    public String author;
//    public String organization;
//    public String address;
//    public String edition;
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
