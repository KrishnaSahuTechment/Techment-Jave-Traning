//Program number 29

package com.techment.assignmentsLogicBuild;

import java.util.Scanner;

public class RightAngleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scannerTriangle = new Scanner(System.in);
		System.out.println("Enter the value of fisrt side of triangle  = ");
		int firstSide = scannerTriangle.nextInt();
		
		System.out.println("Enter the value of second side of triangle  = ");
		int secondSide = scannerTriangle.nextInt();
		
		System.out.println("Enter the value of third side of triangle  = ");
		int thirdSide = scannerTriangle.nextInt();
		
		System.out.println("First side = "+firstSide);
		System.out.println("Second side = "+secondSide);
		System.out.println("third side = "+thirdSide);
		
		
		if((firstSide*firstSide) == (secondSide*secondSide+thirdSide*thirdSide ) )
			System.out.println("It is right angle triangle ");
		else if((secondSide*secondSide) == (firstSide*firstSide+thirdSide*thirdSide ) )
			System.out.println("It is right angle triangle ");
		else if((thirdSide*thirdSide) == (firstSide*firstSide+secondSide*secondSide ) )
			System.out.println("It is right angle triangle ");
			else
				System.out.println("It is not right angle triangle");
	}

}
