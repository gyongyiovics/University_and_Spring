package com.example.demo.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class InfoSplitterTest {

    @Test
    public void splitRequirementUnitWithNullInput() {
        String input = "NULL";
        Assertions.assertTrue(InfoSplitter.requirementSplitter(input).isEmpty());
    }

    @Test
    public void splitRequirementUnitWithOneInput() {
        String input1 = "ANG11-001";
        List<String> expected = Arrays.asList(input1);
        Assertions.assertTrue(compareLists(expected, InfoSplitter.requirementSplitter(input1)));
    }

    @Test
    public void splitRequirementUnitWithMoreInput() {
        String input4 = "IKT19-203|IKT17-291";
        String[] stringList = new String[] {"IKT19-203", "IKT17-291"};
        List <String> expected4 = Arrays.asList(stringList);
        List<String> result4 = InfoSplitter.requirementSplitter(input4);
        Assertions.assertTrue(compareLists(expected4, result4));
    }

    @Test
    public void splitSemesterWithOneInput() {
        String input2 = "1";
        List <Integer> expectedIntegerList = Arrays.asList(Integer.parseInt(input2));
        List <Integer> result = InfoSplitter.semesterSplitter(input2); //size --> 0?
        Assertions.assertTrue(compareLists(expectedIntegerList, result));
    }

    @Test
    public void splitSemesterWithMoreInput() {
        String input3 = "1|2|3";
        Integer[] integerList = new Integer[]{1,2,3};
        List <Integer> expectedIntegerList = Arrays.asList(integerList);
        List <Integer> result = InfoSplitter.semesterSplitter(input3);
        Assertions.assertTrue(compareLists(expectedIntegerList, result));
    }

    public <T> boolean compareLists(List<T> expected, List<T> actual) {
        if(!(expected.size() == actual.size())) {
            return false;
        }

        for (int i = 0; i < expected.size(); i++) {
            if(!expected.get(i).equals(actual.get(i))) {
                return false;
            }
        }
        return true;
    }

}
