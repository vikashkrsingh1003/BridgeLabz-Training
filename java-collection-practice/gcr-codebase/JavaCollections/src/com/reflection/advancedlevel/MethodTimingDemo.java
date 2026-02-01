package com.reflection.advancedlevel;

import java.lang.reflect.Method;

public class MethodTimingDemo {
   public static void main(String[] args) throws Exception {
      PerformanceTest test = new PerformanceTest();
      Method method = PerformanceTest.class.getDeclaredMethod("heavyTask");

      long start = System.nanoTime();
      method.invoke(test);
      long end = System.nanoTime();

      System.out.println("Execution Time: " + (end - start) + " ns");
   }
}