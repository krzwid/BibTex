package Bibtex.tests;

import Bibtex.model.Booklet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookletTest {
    @org.junit.jupiter.api.Test
    void hasAllField() {
        Booklet booklet = new Booklet();
        booklet.title = "xyz";
        assertEquals(true, booklet.hasAllField());

        Booklet booklet2 = new Booklet();
        //booklet2.title = "xyz";
        assertEquals(false, booklet2.hasAllField());
    }
}