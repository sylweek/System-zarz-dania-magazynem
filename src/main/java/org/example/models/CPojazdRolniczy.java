package org.example.models;

import java.util.Date;

public class CPojazdRolniczy extends CPojazdSpalinowy {
    private String przeznaczenie;
    private String typPrzekladni;
    private double wydajnoscHydrauliki;




    public CPojazdRolniczy(int identyfikator, Date dataPrzyjecia, double cena, String marka, String model, double mocSilnika, String rodzajNapedu, Date dataProdukcji, String rodzajPaliwa, double pojemnoscSilnika, String przeznaczenie, String typPrzekladni, double wydajnoscHydrauliki){
        super(identyfikator, dataPrzyjecia, cena, marka, model, mocSilnika, rodzajNapedu, dataProdukcji, rodzajPaliwa, pojemnoscSilnika);
            this.przeznaczenie = przeznaczenie;
            this.typPrzekladni = typPrzekladni;
            this.wydajnoscHydrauliki = wydajnoscHydrauliki;

    }

    public String toString() {
        return super.toString() + "," + przeznaczenie + "," + typPrzekladni + "," + wydajnoscHydrauliki;
    }

    public CPojazdRolniczy() {}

    public String getPrzeznaczenie() {
        return przeznaczenie;
    }

    public void setPrzeznaczenie(String przeznaczenie) {
        this.przeznaczenie = przeznaczenie;
    }

    public String getTypPrzekladni() {
        return typPrzekladni;
    }

    public void setTypPrzekladni(String typPrzekladni) {
        this.typPrzekladni = typPrzekladni;
    }

    public double getWydajnoscHydrauliki() {
        return wydajnoscHydrauliki;
    }

    public void setWydajnoscHydrauliki(double wydajnoscHydrauliki) {
        this.wydajnoscHydrauliki = wydajnoscHydrauliki;
    }
}