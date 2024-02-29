package org.example.utils;



import org.example.models.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.spec.RSAOtherPrimeInfo;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    //odczyt z csv i zawraca liste obiektow
    public List<CPojazdBudowlany> wczytajPojazdyBudowlane(String plikCSV) {
        List<CPojazdBudowlany> pojazdy = new ArrayList<>();
        String linia;
        String separator = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(plikCSV))) {
            while ((linia = br.readLine()) != null) {
                String[] dane = linia.split(separator);

                CPojazdBudowlany pojazd = new CPojazdBudowlany();
                pojazd.setIdentyfikator(Integer.parseInt(dane[0]));
                pojazd.setDataPrzyjecia(Date.valueOf(dane[1]));
                pojazd.setCena(Double.parseDouble(dane[2]));
                pojazd.setMarka(dane[3]);
                pojazd.setModel(dane[4]);
                pojazd.setMocSilnika(Double.parseDouble(dane[5]));
                pojazd.setRodzajNapedu(dane[6]);
                pojazd.setDataProdukcji(Date.valueOf(dane[7]));
                pojazd.setRodzajPaliwa(dane[8]);
                pojazd.setPojemnoscSilnika(Double.parseDouble(dane[9]));
                pojazd.setPoziomHalasu(Double.parseDouble(dane[10]));
                pojazd.setZastosowanie(dane[11]);

                pojazdy.add(pojazd);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return pojazdy;
    }
    public List<CPojazdCiezarowy> wczytajPojazdyCiezarowe(String plikCSV) {
        List<CPojazdCiezarowy> pojazdy = new ArrayList<>();
        String linia;
        String separator = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(plikCSV))) {
            while ((linia = br.readLine()) != null) {
                String[] dane = linia.split(separator);

                CPojazdCiezarowy pojazd = new CPojazdCiezarowy();
                pojazd.setIdentyfikator(Integer.parseInt(dane[0]));
                pojazd.setDataPrzyjecia(Date.valueOf(dane[1]));
                pojazd.setCena(Double.parseDouble(dane[2]));
                pojazd.setMarka(dane[3]);
                pojazd.setModel(dane[4]);
                pojazd.setMocSilnika(Double.parseDouble(dane[5]));
                pojazd.setRodzajNapedu(dane[6]);
                pojazd.setDataProdukcji(Date.valueOf(dane[7]));
                pojazd.setRodzajPaliwa(dane[8]);
                pojazd.setPojemnoscSilnika(Double.parseDouble(dane[9]));
                pojazd.setLadownosc(Double.parseDouble(dane[10]));
                pojazd.setSystemZabezpieczenLadunku(Boolean.valueOf(dane[11]));
                pojazd.setRodzajNaczepy(dane[12]);

                pojazdy.add(pojazd);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return pojazdy;
    }
    public List<CPojazdRolniczy> wczytajPojazdyRolnicze(String plikCSV) {
        List<CPojazdRolniczy> pojazdy = new ArrayList<>();
        String linia;
        String separator = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(plikCSV))) {
            while ((linia = br.readLine()) != null) {
                String[] dane = linia.split(separator);

                CPojazdRolniczy pojazd = new CPojazdRolniczy();
                pojazd.setIdentyfikator(Integer.parseInt(dane[0]));
                pojazd.setDataPrzyjecia(Date.valueOf(dane[1]));
                pojazd.setCena(Double.parseDouble(dane[2]));
                pojazd.setMarka(dane[3]);
                pojazd.setModel(dane[4]);
                pojazd.setMocSilnika(Double.parseDouble(dane[5]));
                pojazd.setRodzajNapedu(dane[6]);
                pojazd.setDataProdukcji(Date.valueOf(dane[7]));
                pojazd.setRodzajPaliwa(dane[8]);
                pojazd.setPojemnoscSilnika(Double.parseDouble(dane[9]));
                pojazd.setPrzeznaczenie(dane[10]);
                pojazd.setTypPrzekladni(dane[11]);
                pojazd.setWydajnoscHydrauliki(Double.parseDouble(dane[12]));

                pojazdy.add(pojazd);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return pojazdy;
    }

    public List<CAutobusElektryczny> wczytajAutobusyElektryczne(String plikCSV) {
        List<CAutobusElektryczny> pojazdy = new ArrayList<>();
        String linia;
        String separator = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(plikCSV))) {
            while ((linia = br.readLine()) != null) {
                String[] dane = linia.split(separator);

                CAutobusElektryczny pojazd = new CAutobusElektryczny();
                pojazd.setIdentyfikator(Integer.parseInt(dane[0]));
                pojazd.setDataPrzyjecia(Date.valueOf(dane[1]));
                pojazd.setCena(Double.parseDouble(dane[2]));
                pojazd.setMarka(dane[3]);
                pojazd.setModel(dane[4]);
                pojazd.setMocSilnika(Double.parseDouble(dane[5]));
                pojazd.setRodzajNapedu(dane[6]);
                pojazd.setDataProdukcji(Date.valueOf(dane[7]));
                pojazd.setPojemnoscAkumulatora(Double.parseDouble(dane[8]));
                pojazd.setZasieg(Double.parseDouble(dane[9]));
                pojazd.setCzasLadowania(Double.parseDouble(dane[10]));
                pojazd.setIloscMiejsc(Integer.parseInt(dane[11]));
                pojazd.setPrzeznaczenie(dane[12]);
                pojazd.setMaksymalnaPredkosc(Double.parseDouble(dane[13]));

                pojazdy.add(pojazd);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return pojazdy;
    }

}
