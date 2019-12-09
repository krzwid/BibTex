package Bibtex.model;

import java.util.Arrays;
import java.util.List;

public class Misc implements IEntry {

    public String author;
    public String title;
    public String howpublished;
    public String month;
    public String year;
    public String note;
    public String key;

    public boolean hasAllField() {
        return true;
    }

    @Override
    public List<String> getRequiredFields() {
        return Arrays.asList("");
    }

    @Override
    public List<String> getOptionalFields() {
        return null;
    }
}
