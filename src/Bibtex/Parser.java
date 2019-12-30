package Bibtex;

import Bibtex.model.Entry;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Parser {

    private static final Pattern variablePattern = Pattern.compile("@(\\w*)\\{(.*) = \"(.*)\"}");
    private static final Pattern objectPattern = Pattern.compile("@(\\w*)\\{(.*),");
    private static final Pattern fieldPattern = Pattern.compile("   (\\w*) = \"(.*)\",");
    private static final Pattern variablePattern2 = Pattern.compile("   (\\w*) = (.*),");

    public static List<Entry> getEntriesFromFile(String fileName) throws NoSuchFieldException, IllegalAccessException, ParserException, IOException {
        List<Entry> iEntries = new ArrayList<>();

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            List<String> lines = stream
                    .collect(Collectors.toList());

            //lines.forEach(s -> System.out.println(s));

            List<String> words = Arrays.asList("ARTICLE", "BOOK", "BOOKLET", "INBOOK", "INCOLLECTION", "INPROCEEDINGS", "MANUAL",
                    "MASTERSTHESIS", "MISC", "PHDTHESIS", "TECHREPORT", "UNPUBLISHED");
            List<String> fields = Arrays.asList("author", "title", "journal", "year", "volume", "number", "pages", "month",
                    "note", "key", "series", "address", "edition", "booktitle", "publisher", "chapter", "organization", "howpublished");

            Map<String, String> variables = findVariables(lines);

            int lineCounter = 0;


            for (int i = 0; i < lines.size(); i++) {
                Matcher matcher = objectPattern.matcher(lines.get(i));

                if (matcher.find()) {
                    if (!words.contains(matcher.group(1))) {
                        throw new ParserException("Niewłaściwy typ rekordu: " + matcher.group(1));
                    }

                    Entry entry = Factory.createEntry(matcher.group(1));
                    i++;

                    while (!lines.get(i).equals("}") && i != lines.size() - 1) {
                        Matcher fieldMatcher = fieldPattern.matcher(lines.get(i));

                        if (fieldMatcher.find()) {
                            entry.fieldMap.put(fieldMatcher.group(1), fieldMatcher.group(2));

                            if (!fields.contains(fieldMatcher.group(1))) {
                                throw new ParserException("Nieprawidłowa nazwa pola: " + fieldMatcher.group(1));
                            }

                            if (!entry.getRequiredFields().contains(fieldMatcher.group(1))) {
                                if (!entry.getOptionalFields().contains(fieldMatcher.group(1))) {
                                    throw new ParserException("Nieprawidłowe wymagane pole: " + fieldMatcher.group(1));
                                }
                            }
                        }else {
                            Matcher variableMatcher = variablePattern2.matcher(lines.get(i));

                            if (variableMatcher.find()) {
                                if (variables.containsKey(variableMatcher.group(2))) {
                                    entry.fieldMap.put(variableMatcher.group(1), variableMatcher.group(2));

                                    entry.fieldMap.replace(variableMatcher.group(1), variables.get(variableMatcher.group(2)));
                                }
                            }
                        }
                        i++;
                    }

                    if (!entry.fieldMap.keySet().containsAll(entry.getRequiredFields())) {
                        throw new ParserException("Brak wszystkich wymaganych pól dla: " + entry);
                    }
                    iEntries.add(entry);
                }
            }
            return iEntries;
        }
    }

    private static Map<String, String> findVariables(List<String> lines) {
        Map<String, String> variableMap = new HashMap<>();

        lines.stream().forEach(s -> {
            Matcher matcher = variablePattern.matcher(s);

            if (matcher.find()) {
                variableMap.put(matcher.group(2), matcher.group(3));
            }
        });

        return variableMap;
    }
}
