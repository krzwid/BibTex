package Bibtex.tests;
import Bibtex.Parser;
import Bibtex.ParserException;
import Bibtex.model.Entry;
import Bibtex.model.Manual;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import static java.util.Map.entry;
import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    @Test
    void getEntriesFromFile() {
        String fileName = "C:\\Users\\Lenovo\\Desktop\\test.txt";
        List<Entry> iEntries = null;
        try {
            iEntries = Parser.getEntriesFromFile(fileName);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ParserException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Entry manual = new Manual();
        manual.fieldMap = Map.ofEntries(
                entry("title", "On Notions of Information Transfer in Circuits"),
                entry("year","2000"),
                entry("volume","41"),
                entry("number", "7")
        );
        List<Entry> iEntries2 = new ArrayList<>();
        iEntries2.add(manual);
        assertNotEquals(iEntries2, iEntries);
    }
}