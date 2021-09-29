package com.example.demo.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class DocumentReader {
    private static String regex = ";";
    private static String prerequisiteRegex = "\\|";
    public static String path = "src/main/resources/szakok.txt";

    public static void main(String[] args) throws Exception {
        for ( String element : readLine(path)) {
            System.out.println(element);
        }

    }

    //read data from file and split it
    public static String[] readLine(String path)throws Exception {
        File file = new File(path);
        String[] data = new String[7];
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null)
            data = st.split(regex);
        return data;
    }
}
