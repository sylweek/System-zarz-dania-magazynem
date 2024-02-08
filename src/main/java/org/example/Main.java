package org.example;

import org.example.models.CAutobusElektryczny;
import org.example.models.CPojazdBudowlany;
import org.example.models.CPojazdCiezarowy;
import org.example.models.CPojazdRolniczy;
import org.example.services.AutobusyElektrycznyServices;
import org.example.services.PojazdBudowalnyServices;
import org.example.services.PojazdCiezarowyService;
import org.example.services.PojazdRolniczyService;
import org.example.utils.CSVReader;

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
        pojazdyBudowlane = reader.wczytajPojazdyBudowlane("src/main/resources/data/PojazdyBudowlane.csv");
        pojazdyRlonicze = reader.wczytajPojazdyRolnicze("src/main/resources/data/PojazdyRolnicze.csv");
        pojazdCiezarowe = reader.wczytajPojazdyCiezarowe("src/main/resources/data/PojazdyCiezarowe.csv");
        autobusyElektryczne = reader.wczytajAutobusyElektryczne("src/main/resources/data/AutobusyElektryczne.csv");


        
        // operacje na danych

        //PojazdRolniczyService pojazdRolniczyService = new PojazdRolniczyService(pojazdyRlonicze);
        //pojazdRolniczyService.dodajNowyPojazd(Date.valueOf("2024-02-02"), 200000, "Zetor" , "Fortera", 123, "4wD", Date.valueOf("2024-02-02"), "disel", 123, "ogolen", "automatyczna", 213);

        //PojazdCiezarowyService pojazdCiezarowyService = new PojazdCiezarowyService(pojazdCiezarowe);
        //pojazdCiezarowyService.dodajNowyPojazd(Date.valueOf("2024-02-02"),20000,"MAN","H123", 123123,  "4WD", Date.valueOf("2021-03-01"), "Benzyna", 324, 34423423, true, "Plandeka");
        //pojazdCiezarowyService.usunPojazd(5);

        //PojazdBudowalnyServices pojazdBudowalnyServices = new PojazdBudowalnyServices(pojazdyBudowlane);
        //pojazdBudowalnyServices.dodajNowyPojazdint(Date.valueOf("2024-02-02"), 2000, "JCB", "PO21", 2344, "4WD", Date.valueOf("2023-02-02"), "Benzyna", 300, "Koparka", 23231);

        //AutobusyElektrycznyServices autobusElektrycznyServices = new AutobusyElektrycznyServices(autobusyElektryczne);
        //autobusElektrycznyServices.dodajNowyPojazd(Date.valueOf("2024-02-02"), 2200, "MAN", "XO0", 2000, "4WD", Date.valueOf("2022-03-02"), 200, 6000, 3, 35, "Przewoz osob", 70);

    }
}