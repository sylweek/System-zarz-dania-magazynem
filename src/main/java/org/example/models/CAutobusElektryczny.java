package org.example.models;

class CAutobusElektryczny extends CPojazdElektryczny {
    private int iloscMiejsc;
    private String przeznaczenie;
    private double maksymalnaPredkosc;

    public CAutobusElektryczny(int identyfikator, CData dataPrzyjecia, double cena, String marka, String model, double mocSilnika, String rodzajNapedu, CData dataProdukcji, double pojemnoscAkumulatora, double zasieg,double czasLadowania, int iloscMiejsc, String przeznaczenie, double maksymalnaPredkosc){
        super(identyfikator, dataPrzyjecia, cena, marka, model, mocSilnika, rodzajNapedu, dataProdukcji, pojemnoscAkumulatora, zasieg, czasLadowania);
            this.iloscMiejsc = iloscMiejsc;
            this.przeznaczenie = przeznaczenie;
            this.maksymalnaPredkosc = maksymalnaPredkosc;
    }
}