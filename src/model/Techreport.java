package model;

import java.util.List;

public class Techreport implements IEntry {

    public String author;
    public String title;
    public String institution;
    public String year;

    public String editor;
    public String volume;
    public String series;
    public String address;
    public String month;
    public String organization;
    public String publisher;
    public String note;
    public String key;

    public void hasAllField() {
        if (author == null || title == null || institution == null || year == null) {
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
