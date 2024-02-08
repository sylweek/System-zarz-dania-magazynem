package org.example.models;

public abstract class CPojazdSpalinowy extends CPojazdUzytkowy {
    private String rodzajPaliwa;
    private double pojemnoscSilnika;


    public CPojazdSpalinowy() {}

    public CPojazdSpalinowy(int identyfikator, CData dataPrzyjecia, double cena, String marka, String model, double mocSilnika, String rodzajNapedu, CData dataProdukcji, String rodzajPaliwa, double pojemnoscSilnika){
        super(identyfikator, dataPrzyjecia, cena, marka, model, mocSilnika, rodzajNapedu, dataProdukcji);
            this.rodzajPaliwa = rodzajPaliwa;
            this.pojemnoscSilnika = pojemnoscSilnika;
    }


    public String getRodzajPaliwa() {
        return rodzajPaliwa;
    }

    public void setRodzajPaliwa(String rodzajPaliwa) {
        this.rodzajPaliwa = rodzajPaliwa;
    }

    public double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public void setPojemnoscSilnika(double pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }
}
