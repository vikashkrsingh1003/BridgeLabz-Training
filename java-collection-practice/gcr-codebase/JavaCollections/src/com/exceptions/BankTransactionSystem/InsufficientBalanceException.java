package com.exceptions.BankTransactionSystem;

//Custom checked exception
class InsufficientBalanceException extends Exception {

 public InsufficientBalanceException(String message) {
     super(message);
 }
}
