package com.customannotations.intermediatelevel.fieldvalidation;

public class MaxLengthDemo {
   public static void main(String[] args) {

      try {
         User u1 = new User("Rajeev");
         System.out.println("Username accepted: " + u1.username);

         User u2 = new User("VeryLongUsername");
         System.out.println("Username accepted: " + u2.username);

      } 
      catch (Exception e) {
         System.out.println("Error: " + e.getMessage());
      }
   }
}