package org.example.models;

import java.util.Date;

public abstract class CPojazdUzytkowy extends  CTowar// klasa abstrakcyjna po której dziedziczą klasy
{
    private String marka;
    private String model;
    private double mocSilnika;
    private String rodzajNapedu;
    private Date dataProdukcji;


    public CPojazdUzytkowy() {}

    public CPojazdUzytkowy(int identyfikator, Date dataPrzyjecia, double cena, String marka, String model, double mocSilnika, String rodzajNapedu, Date dataProdukcji)  {
    super(identyfikator,  dataPrzyjecia, cena);
        this.marka = marka;
        this.model = model;
        this.mocSilnika = mocSilnika;
        this.rodzajNapedu = rodzajNapedu;
        this.dataProdukcji = dataProdukcji;
    }

    public String toString() {
        return super.toString() + "," + marka + "," + model + "," + mocSilnika + "," + rodzajNapedu + ","  + dataProdukcji;
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

    public Date getDataProdukcji() {
        return dataProdukcji;
    }

    public void setDataProdukcji(Date dataProdukcji) {
        this.dataProdukcji = dataProdukcji;
    }
}

