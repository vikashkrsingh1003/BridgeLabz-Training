package com.generics.resumescreeningsystem;

import java.util.List;

public class ScreeningPipeline {

    public static void screenAll(List<? extends JobRole> roles, ResumeData data) {

        for (JobRole role : roles) {
            boolean result = role.isEligible(data);
            System.out.println(
                role.getRoleName() + " Screening Result: " +
                (result ? "Selected" : "Rejected")
            );
        }
    }
}
