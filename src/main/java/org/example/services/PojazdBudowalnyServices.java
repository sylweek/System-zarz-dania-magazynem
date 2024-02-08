package org.example.services;

import org.example.models.CPojazdBudowlany;
import org.example.utils.CSVWriter;

import java.util.Date;
import java.util.List;

public class PojazdBudowalnyServices {
    private List<CPojazdBudowlany> pojazdy;

    public PojazdBudowalnyServices(List<CPojazdBudowlany> pojazdy){ this.pojazdy = pojazdy; }

    public void dodajNowyPojazdint(Date dataPrzyjecia, double cena, String marka, String model, double mocSilnika, String rodzajNapedu, Date dataProdukcji, String rodzajPaliwa, double pojemnoscSilnika, String zastosowanie, double poziomHalasu){
        int ostatniIdentyfikator = pojazdy.getLast().getIdentyfikator();
        CPojazdBudowlany pojazd = new CPojazdBudowlany(ostatniIdentyfikator + 1,dataPrzyjecia, cena, marka, model, mocSilnika, rodzajNapedu, dataProdukcji, rodzajPaliwa, pojemnoscSilnika, zastosowanie, poziomHalasu);
        CSVWriter writer = new CSVWriter();
        writer.dodajLinieDoPliku("/home/bartek/Desktop/projek=cik/System_zarzadzania_magazynem/src/main/resources/data/PojazdyBudowlane.csv", pojazd.toString());
    }
}
