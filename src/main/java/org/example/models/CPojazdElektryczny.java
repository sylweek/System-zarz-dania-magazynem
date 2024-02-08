package org.example.models;

public abstract class CPojazdElektryczny extends CPojazdUzytkowy {
    private double pojemnoscAkumulatora;
    private  double zasieg;
    private double czasLadowania;

    public CPojazdElektryczny(int identyfikator, CData dataPrzyjecia, double cena, String marka, String model, double mocSilnika, String rodzajNapedu, CData dataProdukcji, double pojemnoscAkumulatora, double zasieg, double czasLadowania){
        super(identyfikator, dataPrzyjecia, cena, marka, model, mocSilnika, rodzajNapedu, dataProdukcji);
            this.pojemnoscAkumulatora = pojemnoscAkumulatora;
            this.zasieg = zasieg;
            this.czasLadowania = czasLadowania;
    }

    public double getPojemnoscAkumulatora() {
        return pojemnoscAkumulatora;
    }

    public void setPojemnoscAkumulatora(double pojemnoscAkumulatora) {
        this.pojemnoscAkumulatora = pojemnoscAkumulatora;
    }

    public double getZasieg() {
        return zasieg;
    }

    public void setZasieg(double zasieg) {
        this.zasieg = zasieg;
    }

    public double getCzasLadowania() {
        return czasLadowania;
    }

    public void setCzasLadowania(double czasLadowania) {
        this.czasLadowania = czasLadowania;
    }
}