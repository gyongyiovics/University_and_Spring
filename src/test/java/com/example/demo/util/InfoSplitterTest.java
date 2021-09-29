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
