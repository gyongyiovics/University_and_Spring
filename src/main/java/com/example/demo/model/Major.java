package com.example.demo.model;

import com.example.demo.util.InfoSplitter;
import lombok.Getter;

import java.util.List;

public class Major {
    @Getter
    private String majorName;
    @Getter
    private String unitCode;
    @Getter
    private String unitName;
    @Getter
    private UnitType unitType;
    @Getter
    private List<Integer> recommendedSemesterNumber;
    @Getter
    private int credit;
    @Getter
    private List<String> prerequisiteCode;

    public Major(String majorName,
                 String unitCode,
                 String unitName,
                 UnitType unitType,
                 String recommendedSemesterNumber,
                 int credit,
                 String prerequisiteCode) {
        this.majorName = majorName;
        this.unitCode = unitCode;
        this.unitName = unitName;
        this.unitType = unitType;
        this.recommendedSemesterNumber = InfoSplitter.semesterSplitter(recommendedSemesterNumber);
        this.credit = credit;
        this.prerequisiteCode = InfoSplitter.requirementSplitter(prerequisiteCode);
    }

    //constructor with String[] from the file
    public Major(String[] data) {
        this.majorName = data[0];
        this.unitCode = data[1];
        this.unitName = data[2];
        this.unitType = UnitType.valueOf(data[3]);
        this.recommendedSemesterNumber = InfoSplitter.semesterSplitter(data[4]);
        this.credit = Integer.parseInt(data[5]);
        this.prerequisiteCode = InfoSplitter.requirementSplitter(data[6]);
    }


}
