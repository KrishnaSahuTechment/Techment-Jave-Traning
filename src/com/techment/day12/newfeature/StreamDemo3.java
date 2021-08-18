package com.techment.day12.newfeature;

import java.util.*;

public class StreamDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<String>();
		names.add("Krishna");
		names.add("Aman");
		names.add("dhoni");
		names.add("Bhumi");
		names.add("Kunj");
		names.add("Saraswati");
		names.add("Laxmi");
		names.add("Durga");
		
		System.out.println("names:  "+names);
		System.out.println("names contains a: ");
		names.stream().filter(name->name.contains("a")).forEach(s->System.out.println(s));
		System.out.println("\nnames which length is greater than 5: ");
		names.stream().filter(name->name.length()>5).forEach(s->System.out.println(s));
		
		
	}

}
