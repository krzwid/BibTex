package Bibtex.tests;

import Bibtex.model.Techreport;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TechreportTest {

    @Test
    void hasAllField() {
        Techreport techreport = new Techreport();
        techreport.author = "Kowalski";
        techreport.title = "xyz";
        techreport.institution = "first";
        techreport.year = "2008";
        assertEquals(true, techreport.hasAllField());

        Techreport techreport2 = new Techreport();
        techreport2.author = "Kowalski";
        techreport2.title = "xyz";
        //techreport2.institution = "first";
        techreport2.year = "2008";
        assertEquals(false, techreport2.hasAllField());
    }
}