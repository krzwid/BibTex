package Bibtex.model;
import java.util.Arrays;
import java.util.List;

public class Article implements IEntry {

    public String author;
    public String title;
    public String journal;
    public String year;

    public String volume;
    public String number;
    public String pages;
    public String month;
    public String note;
    public String key;

    public boolean hasAllField() {
        if (author == null || title == null || journal == null || year == null) {
            System.out.println("Brak wymaganych pól");
            return false;
        }
        return true;
    }

    @Override
    public List<String> getRequiredFields() {
        return Arrays.asList("author", "title", "journal", "year");
    }

    @Override
    public List<String> getOptionalFields() {
        return null;
    }
}
