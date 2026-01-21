package com.generics.resumescreeningsystem;

public class DataScientist extends JobRole {

    public DataScientist() {
        super("Data Scientist");
    }

    @Override
    public boolean isEligible(ResumeData data) {
        return data.experience >= 1 && data.projects >= 2;
    }
}
