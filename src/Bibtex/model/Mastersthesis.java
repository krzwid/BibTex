package Bibtex.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mastersthesis extends Entry {
    public Map<String, String> fieldMap = new HashMap<>();

    private static String name = "MASTERSTHESIS";

//    public String type;
//    public String address;
//    public String month;
//    public String note;
//    public String key;


    @Override
    public List<String> getRequiredFields() {
        return Arrays.asList("author", "title", "school", "year");
    }

    @Override
    public List<String> getOptionalFields() {
        return null;
    }
}
