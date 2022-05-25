package org.test;

import java.util.ArrayList;
import java.util.List;

public class Practice {
	private static String string;

	public static void main(String[] args) {
		List<ArrayList<String>> l=new ArrayList<ArrayList<String>>();
		ArrayList<String> a1=new ArrayList<>();
		a1.add("arun");
		a1.add("arun@gmail.com");
		a1.add("chennai");
		ArrayList<String> a2=new ArrayList<>();
		a2.add("bala");
		a2.add("bala@gmail.com");
		a2.add("pune");
		ArrayList<String> a3=new ArrayList<>();
		a1.add("babu");
		a1.add("babu@gmail.com");
		a1.add("chittoor");
		
		l.add(a1);
		l.add(a2);
		l.add(a3);
		ArrayList<String> arrayList = l.get(1);
		string = arrayList.get(1);
		System.out.println(string);


}

}
