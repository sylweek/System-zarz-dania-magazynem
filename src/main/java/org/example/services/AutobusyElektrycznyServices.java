package org.example.services;

import org.example.models.CAutobusElektryczny;
import org.example.utils.CSVWriter;

import java.util.Date;
import java.util.List;

public class AutobusyElektrycznyServices {
    private List<CAutobusElektryczny> pojazdy;

    public AutobusyElektrycznyServices(List<CAutobusElektryczny> pojazdy) {this.pojazdy = pojazdy; }

    public void dodajNowyPojazd(Date dataPrzyjecia, double cena, String marka, String model, double mocSilnika, String rodzajNapedu, Date dataProdukcji, double pojemnoscAkumulatora, double zasieg, double czasLadowania, int iloscMiejsc, String przeznaczenie, double maksymalnaPredkosc){
        int ostatniIdentyfikator = pojazdy.getLast().getIdentyfikator();
        CAutobusElektryczny pojazd = new CAutobusElektryczny(ostatniIdentyfikator + 1, dataPrzyjecia, cena, marka, model, mocSilnika, rodzajNapedu, dataProdukcji, pojemnoscAkumulatora, zasieg, czasLadowania, iloscMiejsc, przeznaczenie, maksymalnaPredkosc);
        CSVWriter writer = new CSVWriter();
        writer.dodajLinieDoPliku("/home/bartek/Desktop/projek=cik/System_zarzadzania_magazynem/src/main/resources/data/AutobusyElektryczne.csv", pojazd.toString());
    }
}
