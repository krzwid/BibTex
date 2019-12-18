package Bibtex;
import Bibtex.model.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, ParserException, IOException {

        String fileName = "C:\\Users\\Lenovo\\Desktop\\cos.txt";

        List<Entry> entries = Parser.getEntriesFromFile(fileName);

        for (Entry entry : entries) {
            System.out.println(entry.toString());
        }

        List<Optional<String>> collect = entries.stream().map(entry -> {
            if (entry.getOptionalFields().contains("author")) {
                return entry.getOptionalFields().stream().filter(s -> s.equals("aaa")).findFirst();
            }
            if (entry.getRequiredFields().contains("author")) {



                return entry.getRequiredFields().stream().filter(s -> entry.fieldMap.get("author").equals("aaa")).findFirst();
            }

            return null;

        }).filter(s -> s != null && s.isEmpty()).collect(Collectors.toList());

        System.out.println("aaaaaaaaaaaaaaaaaaa");

        collect.stream().forEach(s -> System.out.println(s));

        System.out.println("\nWyszukujemy wszystkie artykuły:");
        entries.stream()
                .filter(entry -> entry.getClass().getSimpleName().equals("Article"))
                .collect(Collectors.toList())
                .forEach(entry -> {
                    System.out.println(entry.getName() + "\n");
                    entry.fieldMap.forEach((s, s2) -> {
                        System.out.println(s + " " + s2);
                    });
                });


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

//obsługa pól wymaganych i opcjonalnych
//konkatenacja stringów oraz wywalanie błędu przy braku pola
//usuwanie z tekstu zbędnych rzeczy
//wyszukiwanie po np autorze
//testy
//java doc

//rozbudowa programu w przyszłości:
//wyszukiwanie po roku

