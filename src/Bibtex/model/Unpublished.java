package Bibtex.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Unpublished extends Entry {

    public Map<String, String> fieldMap = new HashMap<>();

    private static String name = "UNPUBLISHED";


//    public String month;
//    public String year;
//    public String key;


    @Override
    public List<String> getRequiredFields() {
        return Arrays.asList("author", "title", "note");
    }

    @Override
    public List<String> getOptionalFields() {
        return null;
    }
}
