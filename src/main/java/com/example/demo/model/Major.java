package com.example.demo.model;

import lombok.Getter;

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
    private String recommendedSemesterNumber;
    @Getter
    private int credit;
    @Getter
    private String prerequisiteCode; // TODO: -> String[]

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
        this.recommendedSemesterNumber = recommendedSemesterNumber;
        this.credit = credit;
        this.prerequisiteCode = prerequisiteCode;
    }



    //TODO: constructor with String[] from the file
    public Major(String[] data) {
        this.majorName = data[0];
        this.unitCode = data[1];
        this.unitName = data[2];
        this.unitType = UnitType.valueOf(data[3]);
        this.recommendedSemesterNumber = data[4];
        this.credit = Integer.parseInt(data[5]);
        this.prerequisiteCode = data[6];
    }

}
