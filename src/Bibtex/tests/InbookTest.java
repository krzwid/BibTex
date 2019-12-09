package Bibtex.tests;

import Bibtex.model.Inbook;

import static org.junit.jupiter.api.Assertions.*;

class InbookTest {

    @org.junit.jupiter.api.Test
    void hasAllField() {
        Inbook inbook = new Inbook();
        inbook.author = "Kowalski";
        inbook.title = "xyz";
        inbook.chapter = "first";
        inbook.publisher = "qaz";
        inbook.year = "2008";
        assertEquals(true, inbook.hasAllField());

        Inbook inbook2 = new Inbook();
        //inbook2.author = "Kowalski";
        inbook2.title = "xyz";
        inbook2.chapter = "first";
        inbook2.publisher = "qaz";
        inbook2.year = "2008";
        assertEquals(false, inbook2.hasAllField());
    }
}