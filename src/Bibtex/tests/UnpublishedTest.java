package Bibtex.tests;

import Bibtex.model.Unpublished;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnpublishedTest {

    @Test
    void hasAllField() {
        Unpublished unpublished = new Unpublished();
        unpublished.author = "Kowalski";
        unpublished.title = "xyz";
        unpublished.note = "note";
        assertEquals(true, unpublished.hasAllField());

        Unpublished unpublished2 = new Unpublished();
        unpublished2.author = "Kowalski";
        unpublished2.title = "xyz";
        //unpublished2.note = "note";
        assertEquals(false, unpublished2.hasAllField());
    }
}