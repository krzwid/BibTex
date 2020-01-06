package Bibtex;

import Bibtex.model.Entry;

import java.util.ArrayList;
/**
 * Main part of Abstract Factory design pattern. This is an interface for Factories producing empty entries of given type.
 * Classes implementing this interface should have names like: RecordtypeFactory, e. g. BookFactory. It's required, because later reflection
 * is used to determine which Factory should be used.
 * Methods:<br>
 * - create(): creates empty Entry object of type specified in Factory name, with adequate recordType attribute value and attributes' lists<br>
 * - getRequiredFields(): makes list of required fields for the object type<br>
 * - getOptionalFields(): makes list of optional fields for the object type<br>
 */
public interface EntryFactory {
    Entry create();

    ArrayList<String> getRequiredFields();

    ArrayList<String> getOptionalFields();
}
