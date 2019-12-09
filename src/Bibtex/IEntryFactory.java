package Bibtex;

import Bibtex.model.IEntry;

import java.util.ArrayList;

public interface IEntryFactory {
    IEntry create();

    ArrayList<String> getRequiredFields();

    ArrayList<String> getOptionalFields();
}
