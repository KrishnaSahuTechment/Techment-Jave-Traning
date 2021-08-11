package com.techment.day8.collections;
import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs = new HashSet();
		
		hs.add(1);
		hs.add(22);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		
		System.out.println("Hashset = "+hs);
	
		LinkedHashSet Lhs = new  LinkedHashSet();
		Lhs.add(100);
		Lhs.add(200);
		Lhs.add(50);
		Lhs.add(20);
		Lhs.add(500);
		Lhs.add("krishna");
		
		System.out.println("linked Hashset = "+Lhs);
		
		TreeSet ts = new TreeSet();
		ts.add(11);
		ts.add(20);
		ts.add(5);
		ts.add(10);
//		ts.add("Ram");// in tree set only allowed similar type of data
		
		System.out.println("Tree Set  = "+ts);
		
		
	}

}
