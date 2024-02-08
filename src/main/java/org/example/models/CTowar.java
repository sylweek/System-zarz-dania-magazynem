package org.example.models;

public abstract class CTowar {
    private int identyfikator;
    CData dataPrzyjecia;
    private double cena;
    

    public CTowar() {}

    public CTowar(int identyfikator, CData dataPrzyjecia, double cena){
        this.identyfikator = identyfikator;
        this.dataPrzyjecia = dataPrzyjecia;
        this.cena = cena;
    }

    public int getIdentyfikator() {
        return identyfikator;
    }

    public void setIdentyfikator(int identyfikator) {
        this.identyfikator = identyfikator;
    }
    public CData getCData() {
        return dataPrzyjecia;
    }

    public void setDataPrzyjecia(CData dataPrzyjecia) {
        this.dataPrzyjecia = dataPrzyjecia;
    }
    public double cena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
