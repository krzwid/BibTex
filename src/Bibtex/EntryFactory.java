package Bibtex;

import Bibtex.model.Entry;

import java.util.ArrayList;

public interface EntryFactory {
    Entry create();

    ArrayList<String> getRequiredFields();

    ArrayList<String> getOptionalFields();
}
