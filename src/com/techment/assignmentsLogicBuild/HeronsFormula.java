//Program number 44 (Heron’s Formula)

package com.techment.assignmentsLogicBuild;
import java.math.*;
import java.util.Scanner;

public class HeronsFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the length of fisrt side of triangle =  ");
		double a = scanner.nextDouble();
		
		System.out.print("Enter the length of  second side of triangle =  ");
		double b = scanner.nextDouble();
		
		System.out.print("Enter the length of third side of triangle =  ");
		double c = scanner.nextDouble();
		
		double semiPerimeter =  (a+b+c)/2;
		
		System.out.println("semiPerimeter = "+semiPerimeter);
		
		double area = Math.sqrt(semiPerimeter*(semiPerimeter-a)*(semiPerimeter-b)*(semiPerimeter-c));
		
		
		System.out.println("Area of triangle  = "+area);
		
	}

}
