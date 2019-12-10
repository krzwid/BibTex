package Bibtex;

import Bibtex.model.Entry;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Parser {

    public static List<Entry> getEntriesFromFile(String fileName) {
        List<Entry> iEntries = new ArrayList<>();

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            List<String> lines = stream
                    .collect(Collectors.toList());

//            lines.forEach(s -> System.out.println(s));

            List<String> words = Arrays.asList("ARTICLE", "BOOK", "BOOKLET","INBOOK","INCOLLECTION","INPROCEEDINGS","MANUAL",
                    "MASTERSTHESIS","MISC","PHDTHESIS","TECHREPORT","UNPUBLISHED");
            List<String> fields = Arrays.asList("author", "title", "journal", "year","volume", "number", "pages", "month",
                    "note", "key", "series", "address", "edition", "booktitle", "organization", "howpublished");

            Entry entry = null;

            int lineCounter = 0;

            Map<String, String> variables = new LinkedHashMap<>();

            while (lineCounter < lines.size() - 1) {

                boolean isExist = false;

                String field = "";

                if (lines.get(lineCounter).startsWith("@STRING")) {
                    String[] s = lines.get(lineCounter).replace("@STRING{", "").split(" = \"");

                    String var = s[0];
                    String value = s[1].replace("}", "").replace("\"","");

                    variables.put(var, value);
                }

                for (String word : words) {
                    if (lines.get(lineCounter).startsWith("@" + word)) {
                        field = word;
                        isExist = true;
                    }
                }

                if (isExist) {
                    entry = Factory.createEntry(field);

                    if (entry != null) {
                        iEntries.add(entry);
                    }
                }

                if ((!"}".startsWith(lines.get(lineCounter)))) {
                    //sprawdź pola
                }

                while ((!"}".startsWith(lines.get(lineCounter)))) {
                    for (String f : fields) {
                        if (lines.get(lineCounter).startsWith("   " + f)) {
                            String value = lines.get(lineCounter).split(" = ")[1].replace(",", "");

                            if (isExist) {
                                Optional<String> first = variables.keySet().stream()
                                        .filter(s -> ((String) s).equals(value))
                                        .findFirst();

                                if (first.isPresent()) {
                                    entry.fieldMap.put(f, variables.get(value));
                                }   else {
                                    entry.fieldMap.put(f, value);
                                }
                            }
                        }
                    }
                    lineCounter++;
                }
                lineCounter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return iEntries;
    }
}
