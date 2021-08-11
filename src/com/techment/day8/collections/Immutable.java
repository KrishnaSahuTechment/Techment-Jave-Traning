package com.techment.day8.collections;

public class Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String courseName = "java";
		System.out.println("course name "+courseName);
		
		courseName.concat("programming");
		
		System.out.println("after concate "+courseName);
	
		courseName=courseName.concat("languag");
		
		System.out.println(courseName);
	
	
	}

}
