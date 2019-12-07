package model;

import java.util.List;

public class Booklet implements IEntry {

    public String title;

    public String author;
    public String howpublished;
    public String address;
    public String month;
    public String year;
    public String note;
    public String key;

    public void hasAllField() {
        if (title == null) {
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
