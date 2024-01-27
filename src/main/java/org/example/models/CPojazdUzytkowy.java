package org.example.models;

public abstract class CPojazdUzytkowy extends  CTowar// klasa abstrakcyjna po której dziedziczą klasy rzeczywiste
{
    private String marka;
    private String model;
    private double mocSilnika;
    private String rodzajNapedu;
    private CData dataProdukcji;


    public CPojazdUzytkowy(int identyfikator, CData dataPrzyjecia, double cena, String marka, String model, double mocSilnika, String rodzajNapedu, CData dataProdukcji)  {
    super(identyfikator,  dataPrzyjecia, cena);
        this.marka = marka;
        this.model = model;
        this.mocSilnika = mocSilnika;
        this.rodzajNapedu = rodzajNapedu;
        this.dataProdukcji = dataProdukcji;
    }
}

