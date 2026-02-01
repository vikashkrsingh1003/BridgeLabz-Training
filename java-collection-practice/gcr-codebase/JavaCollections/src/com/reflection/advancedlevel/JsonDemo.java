package com.reflection.advancedlevel;

import java.lang.reflect.Field;

public class JsonDemo {
   public static void main(String[] args) throws Exception {
       User u = new User("player1", 150);
       System.out.println(JsonUtil.toJson(u));
   }
}