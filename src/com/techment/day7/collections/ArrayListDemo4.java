package com.techment.day7.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.*;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> batch1 = new ArrayList<String>();
		batch1.add("Sachine");
		batch1.add("Ravi");
		batch1.add("kumar");
		batch1.add("Sowmya");
		System.out.println("batch1 = "+batch1);
		
		ArrayList<String> batch2 = new ArrayList<String>();
		batch2.add("Sourabh");
		batch2.add("Manish");
		batch2.add("Sachin");
		batch2.add("Sankit");
		batch2.add("kumar");
		System.out.println("batch2 = "+batch2);
		
		batch2.addAll(batch1);
		System.out.println("\nafter add all batch1 intp batch2 then, batch2 = "+batch2);
					
		Set<String> set = new HashSet<>(batch2);
		batch2.clear();
		batch2.addAll(set);
		System.out.println("\nafter removing dublicates batch2 = "+batch2);
		
		Collections.sort(batch2);
		System.out.println("\nafter sorting  batch2  = "+batch2);
	
		
	}

}
