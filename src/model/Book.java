package model;

import java.util.Arrays;
import java.util.List;

public class Book implements IEntry {

    public String author;
    public String title;
    public String publisher;
    public String year;

    public String volume;
    public String series;
    public String address;
    public String edition;
    public String month;
    public String note;
    public String key;

    public void hasAllField() {
        if (author == null || title == null || publisher == null || year == null) {
            System.out.println("Brak wymaganych pól");
        }
    }

    @Override
    public List<String> getRequiredFields() {
        return Arrays.asList(new String[]{"", ""});
    }

    @Override
    public List<String> getOptionalFields() {
        return null;
    }
}
