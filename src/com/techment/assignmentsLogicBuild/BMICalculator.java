//Program 23
package com.techment.assignmentsLogicBuild;

import java.util.Scanner;
import java.lang.*;

public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your height in meter =  ");
		double height = scanner.nextDouble();
		
		System.out.println("Enter your weight in kg =  ");
		double weight = scanner.nextDouble();
		
		double bmi = weight/(height*height);
		System.out.println("BMI  = "+bmi);
		
		if(bmi<18.5)
			System.out.println("You are Underweight ");
		else if (bmi>=18.5&&bmi<=25)
			System.out.println("You are Normal ");
		else if (bmi>25&&bmi<=30)
			System.out.println("You are Overweigth ");
		else if (bmi>30)
			System.out.println("You are Obese  ");
		
	}

}
