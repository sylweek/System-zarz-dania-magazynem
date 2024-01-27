package org.example.models;

public abstract class CPojazdSpalinowy extends CPojazdUzytkowy {
    private String rodzajPaliwa;
    private double pojemnoscSilnika;


    public CPojazdSpalinowy(int identyfikator, CData dataPrzyjecia, double cena, String marka, String model, double mocSilnika, String rodzajNapedu, CData dataProdukcji, String rodzajPaliwa, double pojemnoscSilnika){
        super(identyfikator, dataPrzyjecia, cena, marka, model, mocSilnika, rodzajNapedu, dataProdukcji);
            this.rodzajPaliwa = rodzajPaliwa;
            this.pojemnoscSilnika = pojemnoscSilnika;
    }
}
