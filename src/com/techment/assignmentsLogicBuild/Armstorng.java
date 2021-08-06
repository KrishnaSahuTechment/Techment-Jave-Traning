//Program number 8
package com.techment.assignmentsLogicBuild;
import java.util.Scanner;
import java.lang.Math;  

public class Armstorng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any 3 digit number number =  ");
		int number = scanner.nextInt();
		
		int length = String.valueOf(number).length();
		System.out.println("Entered number is =  "+number);
		System.out.println("Entered number length =  "+length);
		if(length==3)
		{	
//			System.out.println("Entered number is =  "+number);
			int sum = 0,i=0,digit=0;
			int temp = number;
			
			while(temp!=0)
			{	digit = temp%10;
				sum =sum+(digit*digit*digit);
				temp = temp/10;
			}
			if (sum==number)
				System.out.println("It is armstrong number = "+number);
			else
				System.out.println("It is not an armstrong number = "+number);
		}
		else
			System.out.println("Please enter 3 digit number ");
	}

}
