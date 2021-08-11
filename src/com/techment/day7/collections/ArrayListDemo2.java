package com.techment.day7.collections;
import java.util.*;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList(); // can store any type of object
		a1.add(1);
		a1.add("krishna");
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();  //default capcity is 10
		a2.add(1);
//		a2.add("krishna");  // not allowed only store  integer
		
		ArrayList<String> a3 = new ArrayList<String>();
		a3.add("krishna sahu");
//		a3.add(100);  // not only store string type
		
	}

}
