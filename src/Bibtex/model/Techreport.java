package Bibtex.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Techreport extends Entry {
    public Map<String, String> fieldMap = new HashMap<>();
    private static String name = "TECHREPORT";

//    public String editor;
//    public String volume;
//    public String series;
//    public String address;
//    public String month;
//    public String organization;
//    public String publisher;
//    public String note;
//    public String key;


    @Override
    public List<String> getRequiredFields() {
        return Arrays.asList("author", "title", "institution", "year");
    }

    @Override
    public List<String> getOptionalFields() {
        return null;
    }
}
