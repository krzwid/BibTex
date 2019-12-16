package Bibtex.tests;

import Bibtex.Factory;
import Bibtex.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryTest {

    @Test
    void createEntry() {
        String article = "ARTICLE";
        assertTrue(Factory.createEntry(article) instanceof Article);

        String book = "BOOK";
        assertTrue(Factory.createEntry(book) instanceof Book);

        String booklet = "BOOKLET";
        assertTrue(Factory.createEntry(booklet) instanceof Booklet);

        String inbook = "INBOOK";
        assertTrue(Factory.createEntry(inbook) instanceof Inbook);

        String incollection = "INCOLLECTION";
        assertTrue(Factory.createEntry(incollection) instanceof Incollection);

        String inproceedings = "INPROCEEDINGS";
        assertTrue(Factory.createEntry(inproceedings) instanceof Inproceedings);

        String manual = "MANUAL";
        assertTrue(Factory.createEntry(manual) instanceof Manual);

        String mastersthesis = "MASTERSTHESIS";
        assertTrue(Factory.createEntry(mastersthesis) instanceof Mastersthesis);

        String misc = "MISC";
        assertTrue(Factory.createEntry(misc) instanceof Misc);

        String phdthesis = "PHDTHESIS";
        assertTrue(Factory.createEntry(phdthesis) instanceof Phdthesis);

        String techreport = "TECHREPORT";
        assertTrue(Factory.createEntry(techreport) instanceof Techreport);

        String unpublished = "UNPUBLISHED";
        assertTrue(Factory.createEntry(unpublished) instanceof Unpublished);
    }
}