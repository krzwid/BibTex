package model;

import java.util.List;

public class Manual implements IEntry {

    public String title;

    public String author;
    public String organization;
    public String address;
    public String edition;
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
