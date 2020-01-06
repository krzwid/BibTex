package Bibtex;

import Bibtex.model.*;
/**
 * Main factory class which "produces" an object model of given document.
 */
public class Factory {
    /**
     * The only method of Factory class which "produces" object version of every entry in a file
     * @param type name of an entry
     * @return object model of given entry
     */
    public static Entry createEntry(String type) {
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

        if ("INPROCEEDINGS".equals(type)) {
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

