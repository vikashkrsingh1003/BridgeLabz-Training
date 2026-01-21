package com.generics.resumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ResumeData candidate =
                new ResumeData(3, 4, true);

        Resume<SoftwareEngineer> seResume =
                new Resume<>(candidate, new SoftwareEngineer());

        Resume<DataScientist> dsResume =
                new Resume<>(candidate, new DataScientist());

        Resume<ProductManager> pmResume =
                new Resume<>(candidate, new ProductManager());

        System.out.println("Individual Screening:");
        System.out.println("SE: " + seResume.screen());
        System.out.println("DS: " + dsResume.screen());
        System.out.println("PM: " + pmResume.screen());

        System.out.println("\nPipeline Screening:");

        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());

        ScreeningPipeline.screenAll(roles, candidate);
    }
}
