package model;

import java.util.List;

public class Inbook implements IEntry {

    public String author;
    public String title;
    public String chapter;
    public String publisher;
    public String year;

    public String volume;
    public String number;
    public String series;
    public String type;
    public String address;
    public String edition;
    public String month;
    public String note;
    public String key;

    public void hasAllField() {
        if (author == null || title == null || chapter == null || publisher == null || year == null) {
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
