//Program number 9
package com.techment.assignmentsLogicBuild.program9;

import java.util.Scanner;


public class seriesProgram9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number till you want the series =  ");
		int number = scanner.nextInt();
		System.out.println("Entered number is  = "+number);
		int i=1;
		
		for(i=1;i<=number;i++)
		{
			System.out.print(i*i*i+",");	
			
		}
		
		
	}

}
