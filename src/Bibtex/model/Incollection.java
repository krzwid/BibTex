package Bibtex.model;

import java.util.Arrays;
import java.util.List;

public class Incollection implements IEntry {

    public String author;
    public String title;
    public String booktitle;
    public String publisher;
    public String year;

    public String editor;
    public String volume;
    public String series;
    public String type;
    public String chapter;
    public String pages;
    public String address;
    public String edition;
    public String month;
    public String note;
    public String key;

    public boolean hasAllField() {
        if (author == null || title == null || booktitle == null || publisher == null || year == null) {
            System.out.println("Brak wymaganych pól");
            return false;
        }
        return true;
    }

    @Override
    public List<String> getRequiredFields() {
        return Arrays.asList("author", "title", "booktitle", "publisher", "year");
    }

    @Override
    public List<String> getOptionalFields() {
        return null;
    }
}
