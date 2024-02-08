package org.example.utils;



import org.example.models.CData;
import org.example.models.CPojazdBudowlany;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    public List<CPojazdBudowlany> wczytajPojazdy(String plikCSV) {
        List<CPojazdBudowlany> pojazdy = new ArrayList<>();
        String linia;
        String separator = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(plikCSV))) {
            while ((linia = br.readLine()) != null) {
                String[] dane = linia.split(separator);

                CPojazdBudowlany pojazd = new CPojazdBudowlany();
                pojazd.setIdentyfikator(Integer.parseInt(dane[0]));
                pojazd.setDataPrzyjecia(null);
                pojazd.setCena(Double.parseDouble(dane[2]));
                pojazd.setMarka(dane[3]);
                pojazd.setModel(dane[4]);
                pojazd.setMocSilnika(Double.parseDouble(dane[5]));
                pojazd.setRodzajNapedu(dane[6]);
                pojazd.setDataProdukcji(null);
                pojazd.setRodzajPaliwa(dane[8]);
                pojazd.setPojemnoscSilnika(Double.parseDouble(dane[9]));
                pojazd.setPoziomHalasu(Double.parseDouble(dane[10]));
                pojazd.setZastosowanie(dane[11]);

                pojazdy.add(pojazd);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return pojazdy;
    }
}
