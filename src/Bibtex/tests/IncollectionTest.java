package Bibtex.tests;

import Bibtex.model.Inbook;
import Bibtex.model.Incollection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncollectionTest {

    @Test
    void hasAllField() {
        Incollection incollection = new Incollection();
        incollection.author = "Kowalski";
        incollection.title = "xyz";
        incollection.booktitle = "first";
        incollection.publisher = "qaz";
        incollection.year = "2008";
        assertEquals(true, incollection.hasAllField());

        Incollection incollection2 = new Incollection();
        //incollection2.author = "Kowalski";
        incollection2.title = "xyz";
        incollection2.booktitle = "first";
        incollection2.publisher = "qaz";
        incollection2.year = "2008";
        assertEquals(false, incollection2.hasAllField());
    }
}