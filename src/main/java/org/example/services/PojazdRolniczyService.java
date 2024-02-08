package org.example.services;

import org.example.models.CPojazdRolniczy;

import java.util.Date;
import java.util.List;

public class PojazdRolniczyService {
    private List<CPojazdRolniczy> pojazdy;

    public PojazdRolniczyService(List<CPojazdRolniczy> pojazdy) {
        this.pojazdy = pojazdy;
    }

    public void dodajNowyPojazd(Date dataPrzyjecia, double cena, String marka, String model, double mocSilnika, String rodzajNapedu, Date dataProdukcji, String rodzajPaliwa, double pojemnoscSilnika, String przeznaczenie, String typPrzekladni, double wydajnoscHydrauliki) {
        int ostatniIdentyfikator = pojazdy.getLast().getIdentyfikator();
        CPojazdRolniczy pojazd = new CPojazdRolniczy(ostatniIdentyfikator + 1, dataPrzyjecia, cena, marka, model, mocSilnika, rodzajNapedu, dataProdukcji, rodzajPaliwa, pojemnoscSilnika, przeznaczenie, typPrzekladni, wydajnoscHydrauliki);
    }
}
