package Bibtex.tests;

import Bibtex.model.Inproceedings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InproceedingsTest {

    @Test
    void hasAllField() {
        Inproceedings inproceedings = new Inproceedings();
        inproceedings.author = "Kowalski";
        inproceedings.title = "xyz";
        inproceedings.booktitle = "first";
        inproceedings.year = "2008";
        assertEquals(true, inproceedings.hasAllField());

        Inproceedings inproceedings2 = new Inproceedings();
        inproceedings2.author = "Kowalski";
        inproceedings2.title = "xyz";
        //inproceedings2.booktitle = "first";
        inproceedings2.year = "2008";
        assertEquals(false, inproceedings2.hasAllField());
    }
}