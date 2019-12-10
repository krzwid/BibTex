package Bibtex.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inproceedings extends Entry {

    public Map<String, String> fieldMap = new HashMap<>();

    private static String name = "INPROCEEDINGS";

//    public String editor;
//    public String volume;
//    public String series;
//    public String pages;
//    public String address;
//    public String month;
//    public String organization;
//    public String publisher;
//    public String note;
//    public String key;


    @Override
    public List<String> getRequiredFields() {
        return Arrays.asList("author", "title", "booktitle", "year");
    }

    @Override
    public List<String> getOptionalFields() {
        return null;
    }
}
