package Bibtex.tests;

import Bibtex.model.Article;

import static org.junit.jupiter.api.Assertions.*;

class ArticleTest {

    @org.junit.jupiter.api.Test
    void hasAllField() {
        Article article = new Article();
        article.author = "Kowalski";
        article.title = "xyz";
        article.journal = "first";
        article.year = "2008";
        assertEquals(true, article.hasAllField());

        Article article2 = new Article();
        article2.author = "Kowalski";
        article2.title = "xyz";
        article2.journal = "first";
        //article2.year = "2008";
        assertEquals(false, article2.hasAllField());
    }
}