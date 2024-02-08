package org.example.models;

import java.util.Date;

public class CAutobusElektryczny extends CPojazdElektryczny {
    private int iloscMiejsc;
    private String przeznaczenie;
    private double maksymalnaPredkosc;

    public CAutobusElektryczny(int identyfikator, Date dataPrzyjecia, double cena, String marka, String model, double mocSilnika, String rodzajNapedu, Date dataProdukcji, double pojemnoscAkumulatora, double zasieg, double czasLadowania, int iloscMiejsc, String przeznaczenie, double maksymalnaPredkosc){
        super(identyfikator, dataPrzyjecia, cena, marka, model, mocSilnika, rodzajNapedu, dataProdukcji, pojemnoscAkumulatora, zasieg, czasLadowania);
            this.iloscMiejsc = iloscMiejsc;
            this.przeznaczenie = przeznaczenie;
            this.maksymalnaPredkosc = maksymalnaPredkosc;
    }

    public CAutobusElektryczny() {}

    public int getIloscMiejsc() {
        return iloscMiejsc;
    }

    public void setIloscMiejsc(int iloscMiejsc) {
        this.iloscMiejsc = iloscMiejsc;
    }

    public String getPrzeznaczenie() {
        return przeznaczenie;
    }

    public void setPrzeznaczenie(String przeznaczenie) {
        this.przeznaczenie = przeznaczenie;
    }

    public double getMaksymalnaPredkosc() {
        return maksymalnaPredkosc;
    }

    public void setMaksymalnaPredkosc(double maksymalnaPredkosc) {
        this.maksymalnaPredkosc = maksymalnaPredkosc;
    }
}