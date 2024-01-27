package org.example.models;

public class CPojazdRolniczy extends CPojazdSpalinowy {
    private String przeznaczenie;
    private String typPrzekladni;
    private double wydajnoscHydrauliki;




    public CPojazdRolniczy(int identyfikator, CData dataPrzyjecia, double cena, String marka, String model, double mocSilnika, String rodzajNapedu, CData dataProdukcji, String rodzajPaliwa, double pojemnoscSilnika, String przeznaczenie, String typPrzekladni, double wydajnoscHydrauliki){
        super(identyfikator, dataPrzyjecia, cena, marka, model, mocSilnika, rodzajNapedu, dataProdukcji, rodzajPaliwa, pojemnoscSilnika);
            this.przeznaczenie = przeznaczenie;
            this.typPrzekladni = typPrzekladni;
            this.wydajnoscHydrauliki = wydajnoscHydrauliki;

    }
}