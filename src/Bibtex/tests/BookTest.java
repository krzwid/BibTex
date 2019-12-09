package Bibtex.tests;

import Bibtex.model.Article;
import Bibtex.model.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void hasAllField() {
        Book book = new Book();
        book.author = "Kowalski";
        book.title = "xyz";
        book.publisher = "first";
        book.year = "2008";
        assertEquals(true, book.hasAllField());

        Book book2 = new Book();
        book2.author = "Kowalski";
        //book2.title = "xyz";
        book2.publisher = "first";
        book2.year = "2008";
        assertEquals(false, book2.hasAllField());
    }
}