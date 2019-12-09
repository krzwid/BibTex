package Bibtex.model;

import java.util.Arrays;
import java.util.List;

public class Unpublished implements IEntry {

    public String author;
    public String title;
    public String note;

    public String month;
    public String year;
    public String key;


    public boolean hasAllField() {
        if (author == null || title == null || note == null) {
            System.out.println("Brak wymaganych pól");
            return false;
        }
        return true;
    }

    @Override
    public List<String> getRequiredFields() {
        return Arrays.asList("author", "title", "note");
    }

    @Override
    public List<String> getOptionalFields() {
        return null;
    }
}
