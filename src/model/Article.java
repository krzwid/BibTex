package model;

import java.util.List;

public class Article implements IEntry {

    public String author;
    public String title;
    public String journal;
    public String year;

    public String volume;
    public String number;
    public String pages;
    public String month;
    public String note;
    public String key;

    public void hasAllField() {
        if (author == null || title == null || journal == null || year == null) {
            System.out.println("Brak wymaganych pól");
        }
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
