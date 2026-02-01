package com.reflection.advancedlevel;

import java.util.*;

public class ObjectMapperDemo {
public static void main(String[] args) throws Exception {


Map<String, Object> map = new HashMap<>();
map.put("name", "Aman");
map.put("age", 22);


Student s = ObjectMapper.toObject(Student.class, map);


System.out.println("Name: " + s.name);
System.out.println("Age: " + s.age);
}
}