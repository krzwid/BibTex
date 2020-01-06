package Bibtex.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Objects of this abstract class represent entire single BibTeX record, e. g. section from @RECORDTYPE{, through tags and their values, to closing bracket }.
 */
public abstract class Entry {
    /**
     * Attributes:<br>
     * - name: type of record, each type defined in BibTeX documentation has list of required and optional attributes (types other than those from
     * documentation are ignored),<br>
     * - fieldMap: HashMap which contains all attributes of each entry with a value of each attribute
     * - requiredAttributes: collection of attributes required for given record type and their values,<br>
     * - optionalAttributes: collection of attributes optional for given record type and their values.<br>
     * Attributes that are not required nor optional are ignored. Record type, key and values for required attributes are all required not to be empty Strings.
     */
    protected String name;
    public Map<String, String> fieldMap = new HashMap<>();
    public abstract List<String> getRequiredFields();
    public abstract List<String> getOptionalFields();

    /**
     *  Method to convert name of entry into a string
     * @return string version of an entry name
     */
    public String getName() {
        return name;
    }

    /**
     * Next part of converting object model of document into a string (to avoid NullPointerException).
     * @return a string version of an object model of document
     */
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name).append("\n");
        fieldMap.forEach((String field,String value)->{
            stringBuilder.append(field).append(" ").append(value).append("\n");
        });
        return stringBuilder.toString();
    }
}
