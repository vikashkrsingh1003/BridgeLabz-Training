package com.reflection.advancedlevel;

import java.lang.reflect.Proxy;

public class LoggingProxyDemo {
   public static void main(String[] args) {
      
	   Greeting original = new GreetingImpl();

       Greeting proxy = (Greeting) Proxy.newProxyInstance(
       Greeting.class.getClassLoader(),
           new Class[]{Greeting.class},
           (obj, method, arguments) -> {
              System.out.println("Calling method: " + method.getName());
              return method.invoke(original, arguments);
            }
       );

       proxy.sayHello();
   }
}