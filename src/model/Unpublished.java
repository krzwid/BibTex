package model;

import java.util.List;

public class Unpublished implements IEntry {

    public String author;
    public String title;
    public String note;

    public String month;
    public String year;
    public String key;


    public void hasAllField() {
        if (author == null || title == null || note == null) {
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
