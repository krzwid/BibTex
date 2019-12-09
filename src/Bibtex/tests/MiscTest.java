package Bibtex.tests;

import Bibtex.model.Misc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiscTest {

    @Test
    void hasAllField() {
        Misc misc = new Misc();
        assertEquals(true, misc.hasAllField());
    }
}