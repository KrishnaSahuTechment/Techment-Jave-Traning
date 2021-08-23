package com.techment.assignmentsLogicBuild.program52;

import java.util.Scanner;

public class TriangleFormed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st side of traingle: ");
		 double side1 = sc.nextDouble();
		 
		 System.out.println("Enter the 2nd side of traingle: ");
		 double side2 = sc.nextDouble();
		 
		 System.out.println("Enter the 3rd side of traingle: ");
		 double side3 = sc.nextDouble();
		 
		
		 if(((side1+side2)>side3)&&((side2+side3)>side1)&&((side1+side3)>side2))
			 System.out.println("yes triangle can be formed");
		 else
			 System.out.println("no triangle is formed");
			 
	}

}
