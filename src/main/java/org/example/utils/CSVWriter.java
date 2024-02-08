package org.example.utils;

import java.io.*;

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
    public void usunLinieZPliku(String sciezka, int id) {
        File inputFile = new File(sciezka);
        File tempFile = new File(inputFile.getAbsolutePath() + ".tmp");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                String trimmedLine = currentLine.trim();
                String[] parts = trimmedLine.split(",");
                if (parts.length > 0 && Integer.parseInt(parts[0]) != id) {
                    writer.write(currentLine + System.lineSeparator());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!inputFile.delete()) {
            System.out.println("Nie można usunąć oryginalnego pliku");
            return;
        }
        if (!tempFile.renameTo(inputFile)) {
            System.out.println("Nie można zmienić nazwy pliku tymczasowego");
        }
    }


}
