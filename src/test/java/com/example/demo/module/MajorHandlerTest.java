package com.example.demo.module;

import com.example.demo.model.Major;
import com.example.demo.model.UnitType;
import com.example.demo.util.DocumentReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorHandlerTest {
    private static Major testMajor;

    //test: new object from file data
    //test: put the data of the object to a map
    public static void main(String[] args) {
        System.out.println(getTestMap().keySet());
    }


    public static Map<String, List<Major>> testMap = new HashMap<>();

    public MajorHandlerTest() throws Exception {
        String[] data = DocumentReader.readLine("src/test/resources/test_file2.txt");

        List<Major> bodyData = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            bodyData.add(testMajor);
        }

        for (int i = 0; i < testMap.size(); i++) {
            testMap.put(data[0], bodyData);
        }
    }

    private static Map<String, List<Major>> getTestMap() {
        //japán;JAP-221;Mai japán szakszövegolvasás 1.;G;3|4|5|6;2;JAP-001
        testMajor = new Major("japán",
                "JAP-221",
                "Mai japán szakszövegolvasás 1.",
                UnitType.G,
                "3|4|5|6",
                2,"JAP-001");

        List<Major> majorList = new ArrayList<>();
        Map <String, List<Major>> map = new HashMap<>();

        majorList.add(testMajor);
        map.put(testMajor.getMajorName(), majorList);
        return map;
    }


    @Test
    public void majorHandlerTest() throws Exception {
        String[] data = DocumentReader.readLine("src/test/resources/test_file2.txt");
        String majorName = data[0];
        Assertions.assertEquals(testMajor.getMajorName(), majorName);
    }

    /*
    org.opentest4j.AssertionFailedError:
    Expected :{japán=[com.example.demo.model.Major@1aafa419]}
    Actual   :{}
     */

    //test: compare the getters
    boolean compareObjectGetters(String expected, String actual) {
        if(expected.equals(actual)) {
           return true;
        }
        return false;
    }

    //test: compare the objects
}
