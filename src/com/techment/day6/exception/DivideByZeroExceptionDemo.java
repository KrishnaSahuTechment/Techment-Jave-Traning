package com.techment.day6.exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;

public class DivideByZeroExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try 
		{		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter first number =  ");
			int firstNumber = scanner.nextInt();
			
			System.out.println("Enter first number =  ");
			int secondNumber = scanner.nextInt();
			
			
			System.out.println("Division = "+(firstNumber/secondNumber));
				
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Don't give zero this exception is caught = "+e);
		}
		catch(InputMismatchException e) 
		{
			System.out.println("Don't give characters enter only number this exception is caught = "+e);
		}
		catch(Exception e) 
		{
			System.out.println("Exception ="+e);
		}
		
	}

}
