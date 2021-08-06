package com.techment.day2;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;
		double number = num; // implicit type casting  which happens automatically
		
		System.out.println("Implicit type cast \n Integer num =  "+num+"\n after type cast into double number  =  "+number);
		
		double salaryDouble = 500.50;
		
		int salaryInt = (int) salaryDouble;  // explicit done by developer 
		System.out.println("\nExplicit type cast \n salaryDouble =  "+num+"\n after type cast into intger number salaryInt =  "+salaryInt);
	}

}
