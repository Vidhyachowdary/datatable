package org.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class WithHeader {
	public static void main(String[] args) {
		Map<String,String> l=new LinkedHashMap<>();
		l.put("name", "arun");
		l.put("email", "arun@gmail.com");
		l.put("city", "chittoor");
		String string = l.get("city");
		System.out.println(string);
		
		
	}

}
