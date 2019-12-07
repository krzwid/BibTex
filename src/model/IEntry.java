package model;

import java.util.List;

public interface IEntry {

    List<String> getRequiredFields();
    List<String> getOptionalFields();
}
