package org.example.services;

import org.example.exceptions.UsuwanieLiniiException;
import org.example.models.CPojazdBudowlany;
import org.example.models.CPojazdCiezarowy;
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
        writer.dodajLinieDoPliku("src/main/resources/data/POjazdyBudowlane.csv", pojazd.toString());
    }
    public void usunPojazd(int id) throws UsuwanieLiniiException {
        for(int i = 0; i < pojazdy.size(); i++) {
            if(pojazdy.get(i).getIdentyfikator() == id) {
                pojazdy.remove(i);
                CSVWriter writer = new CSVWriter();
                writer.usunLinieZPliku("src/main/resources/data/PojazdyBudowlane.csv", id);
            }
        }
    }
    public void wyszukajPojazdPoNazwie(String nazwa) {
        boolean znaleziono = false;
        for (CPojazdBudowlany pojazd : pojazdy) {
            if (pojazd.getMarka().equalsIgnoreCase(nazwa)) {
                System.out.println("Znaleziono pojazd: " + pojazd);
                znaleziono = true;
            }
        }
        if (!znaleziono) {
            System.out.println("Nie znaleziono pojazdu o nazwie: " + nazwa);
        }
    }
}
