//Program number 35
/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
 

 */

package com.techment.assignmentsLogicBuild.program35;

import java.util.Scanner;

public class PatternProg35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any integer number to print patterns =  ");
		int number = scanner.nextInt();
		
				
		for(int i = 1;i<=number;i++) 
		{
			for(int j = 1;j<=i;j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
		for(int i = number;i>=1;i--) 
		{
			for (int j = 1; j < i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
		}
	}

}
