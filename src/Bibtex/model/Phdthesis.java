package Bibtex.model;

import java.util.Arrays;
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

    public boolean hasAllField() {
        if (author == null || title == null || school == null || year == null) {
            System.out.println("Brak wymaganych pól");
            return false;
        }
        return true;
    }

    @Override
    public List<String> getRequiredFields() {
        return Arrays.asList("author", "title", "school", "year");
    }

    @Override
    public List<String> getOptionalFields() {
        return null;
    }
}
