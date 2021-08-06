//Program number 4
package com.techment.assignmentsLogicBuild;

import java.util.Scanner;


public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner yearObj = new Scanner(System.in);
		int year;
		
		System.out.println("Enter year value for checking leap or not =  ");
		year = yearObj.nextInt();
		System.out.println("Entered year is  = "+year);
		
		if (((year%4==0) && (year%100!=0)) || (year%400==0))
			System.out.println("Entered year is leap year = "+year);
		else
			System.out.println("Entered year is not leap year = "+year);
		
		
	}

}
