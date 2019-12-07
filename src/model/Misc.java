package model;

import java.util.List;

public class Misc implements IEntry {

    public String author;
    public String title;
    public String howpublished;
    public String month;
    public String year;
    public String note;
    public String key;

    public void hasAllField() {
    }

    @Override
    public List<String> getRequiredFields() {
        return null;
    }

    @Override
    public List<String> getOptionalFields() {
        return null;
    }
}
