package Bibtex.model;

import java.util.Arrays;
import java.util.List;

public class Phdthesis extends Entry {
    private static String name = "PHDTHESIS";

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
