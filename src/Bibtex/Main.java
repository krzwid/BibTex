package Bibtex;

import Bibtex.model.*;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String fileName = "C:\\Users\\Lenovo\\Desktop\\cokolwiek.txt";

        List<Entry> entries = Parser.getEntriesFromFile(fileName);

        for (Entry entry : entries) {
            entry.fieldMap.forEach((s, s2) -> {
                System.out.print(s);
                System.out.print(" " + s2);
                System.out.println();
            });
        }
        //wyszukiwanie np. "Article"
//        entries.stream()
//                .filter(entry -> entry.getClass().getSimpleName().equals("Article"))
//                .collect(Collectors.toList())
//                .forEach(entry -> System.out.println(entry.fieldMap));
    }
}

