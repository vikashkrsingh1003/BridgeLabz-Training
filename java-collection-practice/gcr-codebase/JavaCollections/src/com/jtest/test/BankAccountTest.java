package com.jtest.test;

import org.junit.jupiter.api.Test;

import com.jtest.main.BankAccount;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount(200);
        account.withdraw(80);
        assertEquals(120, account.getBalance());
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount(50);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(100);
        });
        assertEquals("Insufficient funds", exception.getMessage());
    }

    @Test
    public void testNegativeDeposit() {
        BankAccount account = new BankAccount(100);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-50);
        });
        assertEquals("Deposit amount cannot be negative", exception.getMessage());
    }

    @Test
    public void testNegativeWithdraw() {
        BankAccount account = new BankAccount(100);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-30);
        });
        assertEquals("Withdraw amount cannot be negative", exception.getMessage());
    }

    @Test
    public void testInitialBalanceNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new BankAccount(-100);
        });
        assertEquals("Initial balance cannot be negative", exception.getMessage());
    }
}