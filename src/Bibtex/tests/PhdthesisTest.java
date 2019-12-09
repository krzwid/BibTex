package Bibtex.tests;

import Bibtex.model.Phdthesis;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhdthesisTest {

    @Test
    void hasAllField() {
        Phdthesis phdthesis = new Phdthesis();
        phdthesis.author = "Kowalski";
        phdthesis.title = "xyz";
        phdthesis.school = "first";
        phdthesis.year = "2008";
        assertEquals(true, phdthesis.hasAllField());

        Phdthesis phdthesis2 = new Phdthesis();
        phdthesis2.author = "Kowalski";
        phdthesis2.title = "xyz";
        //phdthesis2.school = "first";
        phdthesis2.year = "2008";
        assertEquals(false, phdthesis2.hasAllField());
    }
}