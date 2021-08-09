package com.techment.arrayFundamentalsAssignments;

import java.util.Scanner;

public class SortingAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many number you want to enter   =  ");
		int number = scanner.nextInt();
		System.out.println("================================================");
		System.out.println("ok Total number you want to enter = "+number);
		System.out.println("================================================");
		int arrayA[] = new int[number];
		
		Scanner scanValue = new Scanner(System.in);
		
		for(int i=0;i<number;i++)
		{	System.out.print("Enter the value for index ["+i+"] = ");
		arrayA[i] = scanValue.nextInt();
		}
		System.out.println("================================================");
		for(int j=0;j<number;j++)
		{	System.out.println("value of index ["+j+"] is = "+arrayA[j]);
			
		}
		System.out.println("================================================");
		
		

		
		for(int m=0;m<arrayA.length-1;m++)
		{
			for(int k=0;k<arrayA.length-1;k++)
			{	if(arrayA[k]> arrayA[k+1])
				{int	temp = arrayA[k];
				arrayA[k]= arrayA[k+1];
				arrayA[k+1] = temp;
				}
			}
		}
		System.out.println("\nAfter sorting ");
		
		for(int l=0;l<arrayA.length;l++)
		{	System.out.println("value of index ["+l+"] is = "+arrayA[l]);
		}
		
		
		
	}

}
