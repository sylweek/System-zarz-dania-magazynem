package org.example.models;

class CPojazdCiezarowy extends CPojazdSpalinowy {
    private double ladownosc;
    private boolean systemZabezpieczenLadunku;
    private String rodzajNaczepy;


    public CPojazdCiezarowy(int identyfikator, CData dataPrzyjecia, double cena, String marka, String model, double mocSilnika, String rodzajNapedu, CData dataProdukcji, String rodzajPaliwa, double pojemnoscSilnika, String przeznaczenie, String typPrzekladni, double wydajnoscHydrauliki){
        super(identyfikator, dataPrzyjecia, cena, marka, model, mocSilnika, rodzajNapedu, dataProdukcji, rodzajPaliwa, pojemnoscSilnika);
        this.ladownosc = ladownosc;
        this.systemZabezpieczenLadunku = systemZabezpieczenLadunku;
        this.rodzajNaczepy = rodzajNaczepy;
    }
}