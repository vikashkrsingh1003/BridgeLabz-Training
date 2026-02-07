package com.lambdaexpressions.bankingfinancesystem;

@FunctionalInterface
public interface InterestCalculator {
    double calculate(double p, double r, double t);
}
