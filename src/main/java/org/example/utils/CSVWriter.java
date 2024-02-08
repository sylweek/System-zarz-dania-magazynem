package org.example.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CSVWriter {
    public void dodajLinieDoPliku(String sciezka, String linia) {
        try {
            FileWriter fw = new FileWriter(sciezka, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw);
            out.println(linia);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
