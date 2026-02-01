package com.reflection.advancedlevel;
import java.lang.reflect.Field;
public class JsonUtil {
	static String toJson(Object obj) throws Exception {
		StringBuilder sb = new StringBuilder("{");


		for (Field f : obj.getClass().getDeclaredFields()) {
		f.setAccessible(true);
		sb.append("\"")
		.append(f.getName())
		.append("\":\"")
		.append(f.get(obj))
		.append("\",");
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append("}");
		return sb.toString();
		}
		}