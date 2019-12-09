package Bibtex.tests;

import Bibtex.model.Mastersthesis;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MastersthesisTest {

    @Test
    void hasAllField() {
        Mastersthesis mastersthesis = new Mastersthesis();
        mastersthesis.author = "Kowalski";
        mastersthesis.title = "xyz";
        mastersthesis.school = "first";
        mastersthesis.year = "2008";
        assertEquals(true, mastersthesis.hasAllField());

        Mastersthesis mastersthesis2 = new Mastersthesis();
        //mastersthesis2.author = "Kowalski";
        mastersthesis2.title = "xyz";
        mastersthesis2.school = "first";
        mastersthesis2.year = "2008";
        assertEquals(false, mastersthesis2.hasAllField());
    }
}