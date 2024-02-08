package org.example.models;

class CPojazdCiezarowy extends CPojazdSpalinowy {
    private double ladownosc;
    private boolean systemZabezpieczenLadunku;
    private String rodzajNaczepy;


    public CPojazdCiezarowy(int identyfikator, CData dataPrzyjecia, double cena, String marka, String model, double mocSilnika, String rodzajNapedu, CData dataProdukcji, String rodzajPaliwa, double pojemnoscSilnika, double ladownosc, boolean systemZabezpieczenLadunku, String rodzajNaczepy){
        super(identyfikator, dataPrzyjecia, cena, marka, model, mocSilnika, rodzajNapedu, dataProdukcji, rodzajPaliwa, pojemnoscSilnika);
        this.ladownosc = ladownosc;
        this.systemZabezpieczenLadunku = systemZabezpieczenLadunku;
        this.rodzajNaczepy = rodzajNaczepy;
    }

    public double getLadownosc() {
        return ladownosc;
    }

    public void setLadownosc(double ladownosc) {
        this.ladownosc = ladownosc;
    }

    public boolean isSystemZabezpieczenLadunku() {
        return systemZabezpieczenLadunku;
    }

    public void setSystemZabezpieczenLadunku(boolean systemZabezpieczenLadunku) {
        this.systemZabezpieczenLadunku = systemZabezpieczenLadunku;
    }

    public String getRodzajNaczepy() {
        return rodzajNaczepy;
    }

    public void setRodzajNaczepy(String rodzajNaczepy) {
        this.rodzajNaczepy = rodzajNaczepy;
    }
}