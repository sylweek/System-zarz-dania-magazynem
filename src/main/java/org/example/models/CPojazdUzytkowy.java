package org.example.models;

public abstract class CPojazdUzytkowy extends  CTowar// klasa abstrakcyjna po której dziedziczą klasy rzeczywiste
{
    private String marka;
    private String model;
    private double mocSilnika;
    private String rodzajNapedu;
    private CData dataProdukcji;


    public CPojazdUzytkowy() {}

    public CPojazdUzytkowy(int identyfikator, CData dataPrzyjecia, double cena, String marka, String model, double mocSilnika, String rodzajNapedu, CData dataProdukcji)  {
    super(identyfikator,  dataPrzyjecia, cena);
        this.marka = marka;
        this.model = model;
        this.mocSilnika = mocSilnika;
        this.rodzajNapedu = rodzajNapedu;
        this.dataProdukcji = dataProdukcji;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMocSilnika() {
        return mocSilnika;
    }

    public void setMocSilnika(double mocSilnika) {
        this.mocSilnika = mocSilnika;
    }

    public String getRodzajNapedu() {
        return rodzajNapedu;
    }

    public void setRodzajNapedu(String rodzajNapedu) {
        this.rodzajNapedu = rodzajNapedu;
    }

    public CData getDataProdukcji() {
        return dataProdukcji;
    }

    public void setDataProdukcji(CData dataProdukcji) {
        this.dataProdukcji = dataProdukcji;
    }
}

