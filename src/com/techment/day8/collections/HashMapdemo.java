package com.techment.day8.collections;
import java.util.*;
import java.util.Map.Entry;
public class HashMapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("sachine","Sachine is a great batsman");
		hm.put("Dhoni ", "Dhoni is great captain");
		hm.put("Virat", "Virat is also good cricketer ");
		
		System.out.println("hash hm ="+ hm);
		
		for(Entry<String, String> e :hm.entrySet())
		{
			System.out.println(e);
			System.out.println("Key :"+e.getKey());
			System.out.println("value:"+e.getValue());
		}
		
		System.out.println("printing values");
		
		for(String val :hm.values())
		{
			System.out.println(val);
		}
	}

}
