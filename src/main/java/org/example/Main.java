package org.example;

import org.example.models.CAutobusElektryczny;
import org.example.models.CPojazdBudowlany;
import org.example.models.CPojazdCiezarowy;
import org.example.models.CPojazdRolniczy;
import org.example.services.PojazdRolniczyService;
import org.example.utils.CSVReader;
import org.example.utils.CSVWriter;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // tworzenie list obiektow danych pojazdow
        List<CPojazdBudowlany> pojazdyBudowlane = new ArrayList<>();
        List<CPojazdRolniczy> pojazdyRlonicze = new ArrayList<>();
        List<CPojazdCiezarowy> pojazdCiezarowe = new ArrayList<>();
        List<CAutobusElektryczny> autobusyElektryczne = new ArrayList<>();

        // wczytywanie danych z pliku
        CSVReader reader = new CSVReader();
        pojazdyBudowlane = reader.wczytajPojazdyBudowlane("/home/bartek/Desktop/projek=cik/System_zarzadzania_magazynem/src/main/resources/data/PojazdyBudowlane.csv");
        pojazdyRlonicze = reader.wczytajPojazdyRolnicze("/home/bartek/Desktop/projek=cik/System_zarzadzania_magazynem/src/main/resources/data/PojazdyRolnicze.csv");
        pojazdCiezarowe = reader.wczytajPojazdyCiezarowe("/home/bartek/Desktop/projek=cik/System_zarzadzania_magazynem/src/main/resources/data/PojazdyCiezarowe.csv");
        autobusyElektryczne = reader.wczytajAutobusyElektryczne("/home/bartek/Desktop/projek=cik/System_zarzadzania_magazynem/src/main/resources/data/AutobusyElektryczne.csv");

        PojazdRolniczyService pojazdRolniczyService = new PojazdRolniczyService(pojazdyRlonicze);
        pojazdRolniczyService.dodajNowyPojazd(Date.valueOf("2024-02-02"), 200000, "Zetor" , "Fortera", 123, "4wD", Date.valueOf("2024-02-02"), "disel", 123, "ogolen", "automatyczna", 213);

    }
}