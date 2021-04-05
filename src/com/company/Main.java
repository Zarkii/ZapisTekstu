package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String filePath;
        String textLine;
        Scanner skaner = new Scanner(System.in);
        System.out.println("wprowadz sciezke do pliku");
        filePath = skaner.nextLine();
        File file = new File(filePath);
        zapiszTekst(skaner, file);
    }

    private static void zapiszTekst(Scanner skaner, File file) {
        String textLine;
        try (FileWriter fileWriter = new FileWriter(file)) {
            while (true) {
                System.out.println("wporwadz linijke tekstu,jezeli chcesz" +
                        "zakonczyc wprowadzanie wpisz '-'");
                textLine = skaner.nextLine();
                if (textLine.equals("-"))
                    break;
                else
                    fileWriter.write(textLine + System.lineSeparator());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
