package com.generics.resumescreeningsystem;

public class ProductManager extends JobRole {

    public ProductManager() {
        super("Product Manager");
    }

    @Override
    public boolean isEligible(ResumeData data) {
        return data.experience >= 3 && data.hasLeadership;
    }
}
