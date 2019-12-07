package model;

import java.util.List;

public class Phdthesis implements IEntry {

    public String author;
    public String title;
    public String school;
    public String year;

    public String type;
    public String address;
    public String month;
    public String note;
    public String key;

    public void hasAllField() {
        if (author == null || title == null || school == null || year == null) {
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
