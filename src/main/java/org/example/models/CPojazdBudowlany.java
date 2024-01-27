package org.example.models;
class CPojazdBudowlany extends CPojazdSpalinowy {
    private String zastosowanie;
    private double poziomHalasu;



    public CPojazdBudowlany(int identyfikator, CData dataPrzyjecia, double cena, String marka, String model, double mocSilnika, String rodzajNapedu, CData dataProdukcji, String rodzajPaliwa, double pojemnoscSilnika, String przeznaczenie, String typPrzekladni, double wydajnoscHydrauliki){
        super(identyfikator, dataPrzyjecia, cena, marka, model, mocSilnika, rodzajNapedu, dataProdukcji, rodzajPaliwa, pojemnoscSilnika);
        this.zastosowanie = zastosowanie;
        this.poziomHalasu = poziomHalasu;
    }
}