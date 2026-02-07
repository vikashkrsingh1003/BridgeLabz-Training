package com.lambdaexpressions.bankingfinancesystem;

@FunctionalInterface
public interface MinimumBalanceCheck {
    boolean check(double balance);
}
