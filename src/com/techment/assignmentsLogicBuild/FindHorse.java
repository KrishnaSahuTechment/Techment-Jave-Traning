//Program number 3
package com.techment.assignmentsLogicBuild;

import java.util.Scanner;


public class FindHorse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner horseWeight = new Scanner(System.in);
		int horse1;
		int horse2;
		int horse3;
		
		System.out.println("Enter weight of 1st horse ");
		 horse1 = horseWeight.nextInt();
		System.out.println("Enter weight of 2nd horse ");
		 horse2 = horseWeight.nextInt();
		System.out.println("Enter weight of 3rd horse ");
		 horse3 = horseWeight.nextInt();
				 
		System.out.println("Weight of 1st horse is  = "+horse1);
		System.out.println("Weight of 2nd horse is  = "+horse2);
		System.out.println("Weight of 3rd horse is  = "+horse3);
	
		if(horse1>horse2)
		{
			if(horse1>horse3)
				System.out.println("1st horse is best for hunting beacuse he is the heaviest and it's weight is  = "+horse1);
			else if(horse1==horse3)
				System.out.println("1st horse and 3rd horse are  equal in weight.Entered weights are not distinct values horse1= "+horse1+", horse3= "+horse3);
			else
				System.out.println("3rd horse is best for hunting beacuse he is the heaviest and it's weight is  = "+horse3);
						
		}
		else if (horse1==horse2)
		{
			System.out.println("1st horse and 2nd horse are  equal in weight.Entered weights are not distinct values horse1= "+horse1+", horse2= "+horse2);
		}
		else
		{	if(horse2>horse3)
				System.out.println("2nd horse is best for hunting beacuse he is the heaviest and it's weight is  = "+horse2);
			else if(horse2==horse3)
				System.out.println("2nd horse and 3rd horse are  equal in weight.Entered weights are not distinct values horse1= "+horse1+", horse3= "+horse3);
			else
			System.out.println("3rd horse is best for hunting beacuse he is the heaviest and it's weight is  = "+horse3);
		}	
	}

}
