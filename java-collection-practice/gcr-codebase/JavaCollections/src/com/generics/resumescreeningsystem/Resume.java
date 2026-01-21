package com.generics.resumescreeningsystem;

public class Resume<T extends JobRole> {

    private ResumeData data;
    private T jobRole;

    public Resume(ResumeData data, T jobRole) {
        this.data = data;
        this.jobRole = jobRole;
    }

    public boolean screen() {
        return jobRole.isEligible(data);
    }

    public T getJobRole() {
        return jobRole;
    }
}
