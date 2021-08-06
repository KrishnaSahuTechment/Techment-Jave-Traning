//Program number 6
package com.techment.assignmentsLogicBuild;

import java.util.Scanner;


public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Scanner scanOPerator = new Scanner(System.in);
		
		
		System.out.println("Enter 1st number =  ");
		int number1 = scanner.nextInt();
		
		System.out.println("Enter operator =  ");
		String operator = scanOPerator.nextLine();
		operator = operator.trim();
		
		System.out.println("Enter 2nd number =  ");
		int number2 = scanner.nextInt();
		
		
		
		System.out.println();
		
		if (operator.equals("+"))
			System.out.print("means "+number1+""+operator+""+number2+"="+(number1+number2));
		else if (operator.equals("-"))	
			System.out.print("means "+number1+""+operator+""+number2+"="+(number1-number2));
		else if (operator.equals("*"))	
			System.out.print("means "+number1+""+operator+""+number2+"="+(number1*number2));
		else if (operator.equals("/"))	
			System.out.print("means "+number1+""+operator+""+number2+"="+(number1/number2));
		else if (operator.equals("%"))	
			System.out.print("means "+number1+""+operator+""+number2+"="+(number1%number2));
		else 	
			System.out.print("Please enter valid arithmetic operators between (+,-,*,/,%) ");
	}

}
