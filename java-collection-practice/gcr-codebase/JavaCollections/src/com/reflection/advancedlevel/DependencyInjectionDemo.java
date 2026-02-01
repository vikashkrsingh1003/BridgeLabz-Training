package com.reflection.advancedlevel;

public class DependencyInjectionDemo {
   public static void main(String[] args) throws Exception {
      Car car = new Car();
      DIContainer.inject(car);
      car.drive();
   }
}