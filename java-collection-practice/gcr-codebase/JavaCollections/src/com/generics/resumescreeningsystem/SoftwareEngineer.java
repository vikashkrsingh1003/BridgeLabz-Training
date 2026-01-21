package com.generics.resumescreeningsystem;

public class SoftwareEngineer extends JobRole {

    public SoftwareEngineer() {
        super("Software Engineer");
    }

    @Override
    public boolean isEligible(ResumeData data) {
        return data.experience >= 2 && data.projects >= 3;
    }
}
