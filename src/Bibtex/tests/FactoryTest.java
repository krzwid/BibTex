package Bibtex.tests;

import Bibtex.Factory;
import Bibtex.model.Article;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryTest {

    @Test
    void createEntry() {
        String article = "ARTICLE";
        Article article2 = new Article();
        assertTrue(Factory.createEntry(article) instanceof Article);
    }
}