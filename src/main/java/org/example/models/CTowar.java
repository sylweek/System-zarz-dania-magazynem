package org.example.models;

import java.util.Date;

public abstract class CTowar {
    private int identyfikator;
    Date dataPrzyjecia;
    private double cena;
    

    public CTowar() {}

    public CTowar(int identyfikator, Date dataPrzyjecia, double cena){
        this.identyfikator = identyfikator;
        this.dataPrzyjecia = dataPrzyjecia;
        this.cena = cena;
    }

    public String toString() {
        return identyfikator + "," + dataPrzyjecia + "," + cena;
    }

    public int getIdentyfikator() {
        return identyfikator;
    }

    public void setIdentyfikator(int identyfikator) {
        this.identyfikator = identyfikator;
    }
    public Date getCData() {
        return dataPrzyjecia;
    }

    public void setDataPrzyjecia(Date dataPrzyjecia) {
        this.dataPrzyjecia = dataPrzyjecia;
    }
    public double cena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
