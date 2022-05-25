package org.test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class TwoDWithHeader {
	public static void main(String[] args) {
		List<LinkedHashMap<String,String>> l=new ArrayList<LinkedHashMap<String,String>>();
		LinkedHashMap<String,String> a1= new LinkedHashMap<String,String>();
		a1.put("name", "arun");
		a1.put("email", "arun@gmail.com");
		a1.put("city", "chittoor");
		LinkedHashMap<String,String> a2= new LinkedHashMap<String,String>();
		a2.put("name", "bala");
		a2.put("email", "bala@gmail.com");
		a2.put("city", "pune");
		LinkedHashMap<String,String> a3= new LinkedHashMap<String,String>();
		a3.put("name", "babu");
		a3.put("email", "babu@gmail.com");
		a3.put("city", "tirupathi");
		l.add(a1);
		l.add(a2);
		l.add(a3);
		LinkedHashMap<String, String> linkedHashMap = l.get(2);
		String string = linkedHashMap.get("name");
		System.out.println(string);
		String string2 = l.get(1).get("name");
		System.out.println(string2);
		
		
		
		
	}

}
