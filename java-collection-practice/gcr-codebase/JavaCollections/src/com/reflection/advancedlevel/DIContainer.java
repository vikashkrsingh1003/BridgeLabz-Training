package com.reflection.advancedlevel;

import java.lang.reflect.Field;

public class DIContainer {
	static void inject(Object obj) throws Exception {
		for (Field f : obj.getClass().getDeclaredFields()) {
		   if (f.isAnnotationPresent(Inject.class)) {
		       Object dependency =
		           f.getType().getDeclaredConstructor().newInstance();
		       f.setAccessible(true);
		       f.set(obj, dependency);
		   }
		}
    }
}