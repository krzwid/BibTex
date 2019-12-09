package Bibtex.model;

import java.util.Arrays;
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

    public boolean hasAllField() {
        if (title == null) {
            System.out.println("Brak wymaganych pól");
            return false;
        }
        return true;
    }

    @Override
    public List<String> getRequiredFields() {
        return Arrays.asList("title");
    }

    @Override
    public List<String> getOptionalFields() {
        return null;
    }
}
