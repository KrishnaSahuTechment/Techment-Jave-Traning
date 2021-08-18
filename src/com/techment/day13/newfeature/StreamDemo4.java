package com.techment.day13.newfeature;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.*;

public class StreamDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(10);
		nums.add(15);
		nums.add(20);
		nums.add(30);
		nums.add(8);
		
		System.out.println("nums :"+nums);
		
		nums.forEach(s->System.out.println("numbers: "+s));
		nums.forEach(System.out::println);
		
		nums.stream().sorted().forEach(System.out::println);
		
		List<Integer> mySorted =	nums.stream().sorted().collect(Collectors.toList());
		System.out.println("mySorted: "+mySorted);
	
		List<Integer> myReverse	= nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("myReverse	: "+myReverse	);
		
		
	}

}
