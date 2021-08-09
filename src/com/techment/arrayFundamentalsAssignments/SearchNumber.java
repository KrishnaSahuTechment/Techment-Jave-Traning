package com.techment.arrayFundamentalsAssignments;

import java.util.Scanner;

public class SearchNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0,indexValue;
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
		
		Scanner scannerSearch = new Scanner(System.in);
		System.out.print("Enter number which you want to search  =  ");
		int findNumber = scannerSearch.nextInt();
		
		
		for(int m=0;m<arrayA.length;m++)
		{
			if(arrayA[m]==findNumber)
			{	count++;
				System.out.println("found at index ["+m+"] has = "+arrayA[m]);				
			}					
		}
		
		if(count==0)
			System.out.println("Not found -1");
		
		

	}

}
