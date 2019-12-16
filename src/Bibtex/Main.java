package Bibtex;

import Bibtex.model.*;

import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String fileName = "C:\\Users\\Lenovo\\Desktop\\cos.txt";

        List<Entry> entries = Parser.getEntriesFromFile(fileName);

//        for (Entry entry : entries) {
//            entry.fieldMap.forEach((s, s2) -> {
//                System.out.println();
//                System.out.print(s);
//                System.out.print(" " + s2);
//                System.out.println();
//            });
//        }

        for (Entry entry : entries) {
            System.out.println(entry.toString());
        }

        System.out.println("\nWyszukujemy wszystkie artykuły:");
        entries.stream()
                .filter(entry -> entry.getClass().getSimpleName().equals("Article"))
                .collect(Collectors.toList())
                .forEach(entry -> System.out.println(entry.fieldMap));


        System.out.println("\nWyszukujemy wszystkie booki:");
        entries.stream()
                .filter(entry -> entry.getClass().getSimpleName().equals("Book"))
                .collect(Collectors.toList())
                .forEach(entry -> System.out.println(entry.fieldMap));

        System.out.println("\nWyszukujemy wszystkie inproceedings:");
        entries.stream()
                .filter(entry -> entry.getClass().getSimpleName().equals("Inproceedings"))
                .collect(Collectors.toList())
                .forEach(entry -> System.out.println(entry.fieldMap));
}
}

