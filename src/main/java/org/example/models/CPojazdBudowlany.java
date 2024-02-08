package org.example.models;


public class CPojazdBudowlany extends CPojazdSpalinowy {
    private String zastosowanie;
    private double poziomHalasu;

    public CPojazdBudowlany() {}

    public CPojazdBudowlany(int identyfikator, CData dataPrzyjecia, double cena, String marka, String model, double mocSilnika, String rodzajNapedu, CData dataProdukcji, String rodzajPaliwa, double pojemnoscSilnika, String zastosowanie, double poziomHalasu){
        super(identyfikator, dataPrzyjecia, cena, marka, model, mocSilnika, rodzajNapedu, dataProdukcji, rodzajPaliwa, pojemnoscSilnika);
        this.zastosowanie = zastosowanie;
        this.poziomHalasu = poziomHalasu;
    }

    public String getZastosowanie() {
        return zastosowanie;
    }

    public void setZastosowanie(String zastosowanie) {
        this.zastosowanie = zastosowanie;
    }

    public double getPoziomHalasu() {
        return poziomHalasu;
    }

    public void setPoziomHalasu(double poziomHalasu) {
        this.poziomHalasu = poziomHalasu;
    }
}
