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
    //test: new object from file data
    //test: put the data of the object to a map

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

    public static Map<String, List<Major>> getMajors() {
        return testMap;
    }

    //japán;JAP-221;Mai japán szakszövegolvasás 1.;G;3|4|5|6;2;JAP-001
    Major testMajor = new Major("japán",
            "JAP-221",
            "Mai japán szakszövegolvasás 1.",
            UnitType.G,
            "3|4|5|6",
            2,"JAP-001");

    Map<String, List<Major>> getTestMap(Major major) {
        List<Major> majorList = new ArrayList<>();
        Map <String, List<Major>> map = new HashMap<>();

        majorList.add(major);
        map.put(major.getMajorName(), majorList);
        return map;
    }

    /*
    @Test
    public void majorHandlerTest() throws Exception {
        Assertions.assertEquals(getTestMap(testMajor), this.getMajors());
        //actual --> {}
    }
    */

    //test: compare the getters
    boolean compareObjectGetters(Map<String, List<Major>> expected, Map<String, List<Major>> actual) {
        if(expected.equals(actual)) {
           return true;
        }
        return false;
    }
}
