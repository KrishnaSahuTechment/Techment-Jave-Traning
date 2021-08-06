//Program number 36
/*
1 2 3 4 5 5 4 3 2 1 
1 2 3 4 4 3 2 1 
1 2 3 3 2 1 
1 2 2 1 
1 1 

 */

package com.techment.assignmentsLogicBuild;

import java.util.Scanner;

public class PatternProg36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any integer number to print patterns =  ");
		int number = scanner.nextInt();
		int temp = number;
		
		
		
		for(int i = number;i>=1;i--) 
		{
			for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
			}
			
			for (int k = temp; k>=1;k--)
            {
                System.out.print(k+" ");
            }
			System.out.println();
			temp--;
			
			
		}
	}

}
