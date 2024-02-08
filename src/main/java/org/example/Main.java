package org.example;

import org.example.models.CAutobusElektryczny;
import org.example.models.CPojazdBudowlany;
import org.example.models.CPojazdCiezarowy;
import org.example.models.CPojazdRolniczy;
import org.example.utils.CSVReader;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CPojazdBudowlany> pojazdyBudowlane = new ArrayList<>();
        List<CPojazdRolniczy> pojazdyRlonicze = new ArrayList<>();
        List<CPojazdCiezarowy> pojazdCiezarowe = new ArrayList<>();
        List<CAutobusElektryczny> autobusyElektryczne = new ArrayList<>();

        CSVReader reader = new CSVReader();

        pojazdyBudowlane = reader.wczytajPojazdyBudowlane("/home/bartek/Desktop/projek=cik/System_zarzadzania_magazynem/src/main/resources/data/PojazdyBudowlane.csv");
        pojazdyRlonicze = reader.wczytajPojazdyRolnicze("/home/bartek/Desktop/projek=cik/System_zarzadzania_magazynem/src/main/resources/data/PojazdyRolnicze.csv");
        pojazdCiezarowe = reader.wczytajPojazdyCiezarowe("/home/bartek/Desktop/projek=cik/System_zarzadzania_magazynem/src/main/resources/data/PojazdyCiezarowe.csv");
        autobusyElektryczne = reader.wczytajAutobusyElektryczne("/home/bartek/Desktop/projek=cik/System_zarzadzania_magazynem/src/main/resources/data/AutobusyElektryczne.csv");

        for(CAutobusElektryczny pojazd : autobusyElektryczne) {
            System.out.println(pojazd.getIloscMiejsc());
        }

    }
}