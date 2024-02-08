package org.example;

import org.example.models.CPojazdBudowlany;
import org.example.utils.CSVReader;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<CPojazdBudowlany> pojazdy = new ArrayList<>();

        CSVReader reader = new CSVReader();

        pojazdy = reader.wczytajPojazdy("/home/bartek/Desktop/projek=cik/System_zarzadzania_magazynem/src/main/resources/data/PojazdyBudowlane.csv");

        for(CPojazdBudowlany pojazd : pojazdy) {
            System.out.println(pojazd.getIdentyfikator());
            System.out.print(pojazd.getZastosowanie());
        }
    }
}