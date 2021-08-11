package com.techment.test11august.program1;

import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countChild=0,countAdult=0,countCitizen=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many person's age you want to enter =  ");
		int number = scanner.nextInt();
		System.out.println("ok Total subject is = "+number);
		
		int age[] = new int[number];
		
		Scanner scanAge = new Scanner(System.in);
		
		for(int i=0;i<number;i++)
		{	System.out.println("Enter age for person "+(i+1));
			age[i] = scanAge.nextInt();
		}
		
		for(int j=0;j<number;j++)
		{	System.out.println("age of person  "+(j+1)+" is = "+age[j]);
			
		}
		
		for(int i=0;i<number;i++)
		{	
			if(age[i]<18)
				countChild++;
			else if(age[i]>=18 && age[i]<54 )
				countAdult++;
			else if(age[i]>=55)
				countCitizen++;
						
		}
		
		System.out.println("Total childrean = "+countChild);
		System.out.println("Total Adult = "+countAdult);
		System.out.println("Total Senior citizen = "+countCitizen);
		
	}

}
