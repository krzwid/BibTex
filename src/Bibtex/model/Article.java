package Bibtex.model;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicStampedReference;

public class Article extends Entry {

    public Map<String, String> fieldMap = new HashMap<>();

//    private static String name = "ARTICLE";

    public Article() {
        super.name = "ARTICLE";
    }

    @Override
    public List<String> getRequiredFields() {
        return Arrays.asList("author", "title", "journal", "year");
    }

    @Override
    public List<String> getOptionalFields() {
        return Arrays.asList("volume", "number", "pages", "month", "note", "key");
    }
}
