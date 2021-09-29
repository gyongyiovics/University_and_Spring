package com.example.demo.module;

import com.example.demo.model.Major;
import com.example.demo.util.DocumentReader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorHandler {
    Map<String, List<Major>> majors = new HashMap<>();
    //TODO: put this into config file!
    public static String path = "src/main/resources/szakok.txt";

    public MajorHandler() throws Exception {
        String[] data = DocumentReader.readLine(path);
        List<Major> bodyData = new ArrayList<>();
        for (int i = 1; i < data.length; i++) {
            bodyData.add(new Major(data));
        }

        for (int i = 0; i < majors.size(); i++) {
            majors.put(data[0], bodyData);
        }
    }
}
