package com.example.demo.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.valueOf;

public class InfoSplitter {
    //private static String regex = ";";
    private static String requirementRegex = "\\|";

    //TODO: type T - semester(int), requirements(String)
    public static List<String> requirementSplitter(String str) {
            return Arrays.asList(str.split(requirementRegex));
    }

    public static List<Integer> semesterSplitter(String semester) {
        List<Integer> semesters = new ArrayList<>();
        String[] splitted = semester.split(requirementRegex);

        for (int i = 0; i < semesters.size(); i++) {
            semesters.add(Integer.parseInt(splitted[i]));
        }
        return semesters;
        //return Arrays.asList(semester.split(requirementRegex));
    }


}
