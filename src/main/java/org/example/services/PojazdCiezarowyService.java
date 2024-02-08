package org.example.services;

import org.example.exceptions.UsuwanieLiniiException;
import org.example.models.CPojazdBudowlany;
import org.example.models.CPojazdCiezarowy;
import org.example.utils.CSVWriter;

import java.util.Date;
import java.util.List;

public class PojazdCiezarowyService {
    private List<CPojazdCiezarowy> pojazdy;
    public PojazdCiezarowyService(List<CPojazdCiezarowy> pojazdy) {this.pojazdy = pojazdy; }

    public void dodajNowyPojazd(Date dataPrzyjecia, double cena, String marka, String model, double mocSilnika, String rodzajNapedu, Date dataProdukcji, String rodzajPaliwa, double pojemnoscSilnika, double ladownosc, boolean systemZabezpieczenLadunku, String rodzajNaczepy){
        int ostatniIdentyfikator = pojazdy.getLast().getIdentyfikator();
        CPojazdCiezarowy pojazd = new CPojazdCiezarowy(ostatniIdentyfikator + 1, dataPrzyjecia, cena, marka, model, mocSilnika, rodzajNapedu, dataProdukcji, rodzajPaliwa, pojemnoscSilnika, ladownosc, systemZabezpieczenLadunku, rodzajNaczepy);
        CSVWriter writer = new CSVWriter();
        writer.dodajLinieDoPliku("src/main/resources/data/PojazdyCiezarowe.csv", pojazd.toString());
    }

    public void usunPojazd(int id) throws UsuwanieLiniiException {
       for(int i = 0; i < pojazdy.size(); i++) {
           if(pojazdy.get(i).getIdentyfikator() == id) {
               pojazdy.remove(i);
               CSVWriter writer = new CSVWriter();
               writer.usunLinieZPliku("src/main/resources/data/PojazdyCiezarowe.csv", pojazdy.get(i).getIdentyfikator());
           }
       }
    }
}
