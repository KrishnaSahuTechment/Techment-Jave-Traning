// Program number 18
package com.techment.assignmentsLogicBuild.program18;

import java.util.Scanner;

public class ArithmeticExceptipProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	try{	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number =  ");
		int a = scanner.nextInt();
		System.out.print("Enter second number =  ");
		int b = scanner.nextInt();
	
		int c = a/b;
		
		System.out.print("Division =  "+c);
	
	}catch(Exception e)
	{
		System.out.println("Exception occures =  "+e);	
	}
	
	finally{
		System.out.println("Inside the finally block ");
	}
		
		
	}

}
