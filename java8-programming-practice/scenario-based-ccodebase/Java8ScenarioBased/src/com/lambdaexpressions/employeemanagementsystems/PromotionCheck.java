package com.lambdaexpressions.employeemanagementsystems;

@FunctionalInterface
public interface PromotionCheck {
    boolean isEligible(int experience);
}
