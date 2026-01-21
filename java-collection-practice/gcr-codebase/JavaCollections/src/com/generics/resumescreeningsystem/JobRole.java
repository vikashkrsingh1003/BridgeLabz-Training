package com.generics.resumescreeningsystem;

public abstract class JobRole {

	protected String roleName;

    public JobRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public abstract boolean isEligible(ResumeData data);
}
