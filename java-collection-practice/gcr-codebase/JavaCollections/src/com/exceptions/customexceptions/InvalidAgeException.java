package com.exceptions.customexceptions;

//Custom Exception
public class InvalidAgeException extends Exception {

 // Constructor
  public InvalidAgeException(String message) {
     super(message);
  }
}
