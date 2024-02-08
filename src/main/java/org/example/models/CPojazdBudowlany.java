package org.example.models;


import java.util.Date;

public class CPojazdBudowlany extends CPojazdSpalinowy {
    private String zastosowanie;
    private double poziomHalasu;

    public CPojazdBudowlany() {}
    public String toString() {
        return super.toString() + "," + poziomHalasu + "," + zastosowanie;
    }

    public CPojazdBudowlany(int identyfikator, Date dataPrzyjecia, double cena, String marka, String model, double mocSilnika, String rodzajNapedu, Date dataProdukcji, String rodzajPaliwa, double pojemnoscSilnika, String zastosowanie, double poziomHalasu){
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
