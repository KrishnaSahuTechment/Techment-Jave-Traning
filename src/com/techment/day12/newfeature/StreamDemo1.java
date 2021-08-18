package com.techment.day12.newfeature;

import java.util.*;

public class StreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(1);
		nums.add(10);
		nums.add(20);
		
		System.out.println("nums :"+nums);
		nums.stream().forEach(i->System.out.println(i));
	
		
		//By using method reference
		nums.stream().forEach(System.out::println);
		
		
	}

}
