package Bibtex;

import Bibtex.model.Entry;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
/**
 * This is main class of the program and regular user will only interact with it.
 */
public class Main {
    /**
     * Main method of the program, calling other methods to parse records in provided file, filter them according to passed arguments and display results.
     * @param args - array of 3 elements: file path, authors to filter and publication types to filter
     */
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, ParserException, IOException {

        String fileName = "C:\\Users\\Lenovo\\Desktop\\cos.txt";

        List<Entry> entries = Parser.getEntriesFromFile(fileName);
        System.out.println("Listujemy wszystkie wpisy:" + "\n");

        for (Entry entry : entries) {
            System.out.println(entry.toString());
        }
        System.out.println("KONIEC DOKUMENTU." + "\n" + "\n");

        //odfiltrowanie po imieniu i nazwisku
        System.out.println("WYSZUKIWANIE AUTORÓW:");
        entries.stream()
                .filter(entry -> "Donald E. Knuth".equals(entry.fieldMap.get("author")))
                .collect(Collectors.toList())
                .forEach(entry -> {
                    System.out.println(entry);
                });
        System.out.println("KONIEC SZUKANIA");

        //odfiltrowanie po roku
        System.out.println("\n" + "\n" + "SZUKAMY PO ROKU:");
        entries.stream()
                .filter(entry -> "2000".equals(entry.fieldMap.get("year")))
                .collect(Collectors.toList())
                .forEach(entry -> {
                    System.out.println(entry);
                });
        System.out.println("KONIEC SZUKANIA");
        System.out.println("--------------------");


        System.out.println("\nWyszukujemy wszystkie artykuły:");
        entries.stream()
                .filter(entry -> entry.getClass().getSimpleName().equals("Article"))
                .collect(Collectors.toList())
                .forEach(entry -> {
                    System.out.println(entry.getName());
                    entry.fieldMap.forEach((s, s2) -> {
                        System.out.println(s + " " + s2);
                    });
                });
        System.out.println("KONIEC SZUKANIA");
        System.out.println("--------------------");

        System.out.println("\nWyszukujemy wszystkie manuale:");
        entries.stream()
                .filter(entry -> entry.getClass().getSimpleName().equals("Manual"))
                .collect(Collectors.toList())
                .forEach(entry -> {
                    System.out.println(entry.getName());
                    entry.fieldMap.forEach((s, s2) -> {
                        System.out.println(s + " " + s2);
                    });
                });
        System.out.println("KONIEC SZUKANIA");
        System.out.println("--------------------");
    }
}
//jak nie ma przecinka to jest zły komunikat przecinek
//to samo jeśli chodzi o ACMS zamiast ACM

//Pomijać informacje zawarte w polach ignorowanych
//Usuwać z tekstu wszystkie inne, zbędne elementy:
//deklaracje @comment oraz @preamble
//fragmenty niezawierające ani rekordów, ani deklaracji
//Wyszukiwanie, tylko po nazwisku lub nazwisku(ach) i imieniu(ach), publikacji podanego autora lub autorów
//Wyświetlanie nazw osób ma się odbywać następująco: każdy autor w osobnej linii (jak w przykładzie); najpierw jego imię, a potem nazwisko
//Wyświetlanie pomocy (opis opcji i sposobu uruchamiania) gdy program zostanie wywołany bez argumentów

//testy???
//java doc
