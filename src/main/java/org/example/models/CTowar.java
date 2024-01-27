package org.example.models;

public abstract class CTowar {
    private int identyfikator;
    CData dataPrzyjecia;
    private double cena;

    public CTowar(int identyfikator, CData dataPrzyjecia, double cena){
        this.identyfikator = identyfikator;
        this.dataPrzyjecia = dataPrzyjecia;
        this.cena = cena;
    }
}
