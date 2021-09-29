package com.example.demo.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DocumentReaderTest {
    //test: read data and put it into a String[]

    @Test
    public void readDocumentWithResource() throws Exception {
        String resource = "src/test/resources/test_file1.txt";
                /*
                text in file:
                "informatikus könyvtáros;IKT11-121;Olvasásszociológia, -pedagógia, -pszichológia;K;4;3;NULL";
                 */
        String[] result = new String[] {"informatikus könyvtáros",
                "IKT11-121",
                "Olvasásszociológia, -pedagógia, -pszichológia",
                "K",
                "4",
                "3",
                "NULL"};
        Assertions.assertTrue(compareLists(result, DocumentReader.readLine(resource)));
    }

    public <T> boolean compareLists(String[] expected, String[] actual) {
        if(!(expected.length == actual.length)) {
            return false;
        }

        for (int i = 0; i < expected.length; i++) {
            if(!expected[i].equals(actual[i])) {
                return false;
            }
        }
        return true;
    }
}
