package com.techment.java8feturesAssignments;

@FunctionalInterface    // it is optional
interface Shapes
{
	public double displayArea(double side);
}


public class LamdaExampleOneParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		double side=10;
		
		//by using Lambda
		Shapes square =(side)->(side*side);
		System.out.println("Area of square :"+square.displayArea(10));
		
		
	}

}
