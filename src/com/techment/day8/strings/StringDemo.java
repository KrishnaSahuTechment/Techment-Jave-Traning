package com.techment.day8.strings;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 ="hello"; //by literal
		String s2 ="hello"; 
		
		String s3 = new String(" hello"); //by keyword
		String s4 = new String(" hello");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
				
	}

}
