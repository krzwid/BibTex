package Bibtex.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Techreport extends Entry {
    public Map<String, String> fieldMap = new HashMap<>();

    public Techreport() {
        super.name = "TECHREPORT";
    }


    @Override
    public List<String> getRequiredFields() {
        return Arrays.asList("author", "title", "institution", "year");
    }

    @Override
    public List<String> getOptionalFields() {
        //volume lub number
        return Arrays.asList("editor", "volume" , "series", "address", "month", "organization", "publisher", "note", "key");
    }
}
