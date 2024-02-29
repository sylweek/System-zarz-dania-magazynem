package org.example.services;

import org.example.exceptions.UsuwanieLiniiException;
import org.example.models.CAutobusElektryczny;
import org.example.models.CPojazdCiezarowy;
import org.example.utils.CSVWriter;

import java.util.Date;
import java.util.List;

public class AutobusyElektrycznyServices {
    //lista obiektow
    private List<CAutobusElektryczny> pojazdy;
    //inicjalizacja pola pojazdy przekazana jako argument
    public AutobusyElektrycznyServices(List<CAutobusElektryczny> pojazdy) {this.pojazdy = pojazdy; }

    public void dodajNowyPojazd(Date dataPrzyjecia, double cena, String marka, String model, double mocSilnika, String rodzajNapedu, Date dataProdukcji, double pojemnoscAkumulatora, double zasieg, double czasLadowania, int iloscMiejsc, String przeznaczenie, double maksymalnaPredkosc){
        int ostatniIdentyfikator = pojazdy.getLast().getIdentyfikator();
        CAutobusElektryczny pojazd = new CAutobusElektryczny(ostatniIdentyfikator + 1, dataPrzyjecia, cena, marka, model, mocSilnika, rodzajNapedu, dataProdukcji, pojemnoscAkumulatora, zasieg, czasLadowania, iloscMiejsc, przeznaczenie, maksymalnaPredkosc);
        CSVWriter writer = new CSVWriter();
        writer.dodajLinieDoPliku("src/main/resources/data/AutobusyElektryczne.csv", pojazd.toString());
    }
    public void usunPojazd(int id) throws UsuwanieLiniiException {
        for(int i = 0; i < pojazdy.size(); i++) {
            if(pojazdy.get(i).getIdentyfikator() == id) {
                pojazdy.remove(i);
                CSVWriter writer = new CSVWriter();
                writer.usunLinieZPliku("src/main/resources/data/AutobusyElektryczne.csv", id);
            }
        }
    }
    public void wyszukajPojazdPoNazwie(String nazwa) {
        boolean znaleziono = false;
        for (CAutobusElektryczny pojazd : pojazdy) {
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
