package com.example.demo.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InfoSplitter {
    //private static String regex = ";";
    private static String requirementRegex = "\\|";

    public static void main(String[] args) {
        System.out.println(semesterSplitter("2|3"));
    }


    public static List<String> requirementSplitter(String str) {
        if(!str.equals("NULL")) {
            return Arrays.asList(str.split(requirementRegex));
        }
        return new ArrayList<>();
    }

    public static List<Integer> semesterSplitter(String semester) {
        List<Integer> semesters = new ArrayList<>();
        String[] splitted = semester.split(requirementRegex);
        for (int i = 0; i < splitted.length; i++) {
            semesters.add(Integer.parseInt(splitted[i]));
        }
        return semesters;
        //return Arrays.asList(semester.split(requirementRegex));
    }


}
