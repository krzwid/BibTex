package Bibtex;

import Bibtex.model.*;

public class Factory {

    public static IEntry createEntry(String type) {
        if ("ARTICLE".equals(type)) {
            return new Article();
        }

        if ("BOOK".equals(type)) {
            return new Book();
        }

        if ("BOOKLET".equals(type)) {
            return new Booklet();
        }
        if ("INBOOK".equals(type)) {
            return new Inbook();
        }

        if ("INCOLLECTION".equals(type)) {
            return new Incollection();
        }

        if ("INPROCEDINGS".equals(type)) {
            return new Inproceedings();
        }
        if ("MANUAL".equals(type)) {
            return new Manual();
        }

        if ("MASTERSTHESIS".equals(type)) {
            return new Mastersthesis();
        }

        if ("MISC".equals(type)) {
            return new Misc();
        }
        if ("PHDTHESIS".equals(type)) {
            return new Phdthesis();
        }

        if ("TECHREPORT".equals(type)) {
            return new Techreport();
        }

        if ("UNPUBLISHED".equals(type)) {
            return new Unpublished();
        }

        return null;
    }

}

