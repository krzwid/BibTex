package Bibtex;

import Bibtex.Factory;
import Bibtex.model.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        String fileName = "C:\\Users\\Lenovo\\Desktop\\cokolwiek.txt";

        List<IEntry> iEntries = new ArrayList<>();

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            List<String> lines = stream
                    .collect(Collectors.toList());

//            lines.forEach(s -> System.out.println(s));

            List<String> words = Arrays.asList("ARTICLE", "BOOK", "BOOKLET","INBOOK","INCOLLECTION","INPROCEEDINGS","MANUAL",
                    "MASTERSTHESIS","MISC","PHDTHESIS","TECHREPORT","UNPUBLISHED");
            List<String> fields = Arrays.asList("author", "title", "journal", "year","volume", "number", "pages", "month",
                    "note", "key", "series", "address", "edition", "booktitle", "organization", "howpublished");

            int counter = 0;

            IEntry iEntry = null;

            int lineCounter = 0;

            while (lineCounter < lines.size() - 1) {

                boolean isExist = false;

                String field = "";

                lineCounter += 2;

                for (String word : words) {
                    if (lines.get(lineCounter).startsWith("@" + word)) {
                        field = word;
                        System.out.println("field" + field);
                        isExist = true;
                    }
                }

                if (isExist) {
                    iEntry = Factory.createEntry(field);
                    iEntries.add(iEntry);
                }

                if ((!"}".startsWith(lines.get(lineCounter)))) {
                    //sprawdź pola
                }

                while ((!"}".startsWith(lines.get(lineCounter)))) {
                    for (String f : fields) {
                        if (lines.get(lineCounter).startsWith("   " + f)) {
                            String value = lines.get(lineCounter).split(" = ")[1].replace(",", "");
                            System.out.println(f + " " + value);

                            if (isExist) {
                                iEntry.getClass().getField(f).set(iEntry, value);
                            }
                        }
                    }
                    lineCounter++;
                }
            }
        } catch (IOException | NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        for (IEntry iEntry : iEntries) {
            if (iEntry instanceof Article) {
                System.out.println("Article" + (((Article) iEntry)).author);
            }
            if (iEntry instanceof Book) {
                System.out.println("Book" + (((Book) iEntry)).author);
            }
            if (iEntry instanceof Booklet) {
                System.out.println("Booklet" + (((Booklet) iEntry)).title);
            }
            if (iEntry instanceof Inbook) {
                System.out.println("Inbook" + (((Inbook) iEntry)).author);
            }
            if (iEntry instanceof Incollection) {
                System.out.println("Incollection" + (((Incollection) iEntry)).author);
            }
            if (iEntry instanceof Inproceedings) {
                System.out.println("Inproceedings" + (((Inproceedings) iEntry)).author);
            }
            if (iEntry instanceof Manual) {
                System.out.println("Manual" + (((Manual) iEntry)).title);
            }
            if (iEntry instanceof Mastersthesis) {
                System.out.println("Mastersthesis" + (((Mastersthesis) iEntry)).author);
            }
            if (iEntry instanceof Phdthesis) {
                System.out.println("Phdthesis" + (((Phdthesis) iEntry)).author);
            }
            if (iEntry instanceof Techreport) {
                System.out.println("Techreport" + (((Techreport) iEntry)).author);
            }
            if (iEntry instanceof Unpublished) {
                System.out.println("Unpublished" + (((Unpublished) iEntry)).author);
            }
        }
    }
}

