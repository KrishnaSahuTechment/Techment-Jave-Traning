//Program number 15
package com.techment.assignmentsLogicBuild;


import java.util.Scanner;
import java.util.Arrays;

public class TwoArrayCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any  odd number =  ");
		int number = scanner.nextInt();
		
		System.out.println("================================================");
		
			if(number%2!=0)	
			{	if(number<=15)
				{	System.out.println("ok here you comparision= "+number);
					
					int arr1[] = new int[number];
					
					Scanner scanProducts = new Scanner(System.in);
					
					for(int i=0;i<number;i++)
					{	System.out.print("Enter the value of array1 "+(i+1)+"  Quantities= ");
					arr1[i] = scanProducts.nextInt();
					}
					System.out.println("================================================");
					for(int j=0;j<number;j++)
					{	System.out.println("value of array 1 is  "+(j+1)+" is = "+arr1[j]);
					}
					System.out.println("================================================");
					int arr2[] = new int[number];
					
					Scanner scanProducts2 = new Scanner(System.in);
					
					for(int i=0;i<number;i++)
					{	System.out.print("Enter the array2  "+(i+1)+"  Quantities= ");
						arr2[i] = scanProducts2.nextInt();
					}
					System.out.println("================================================");
					for(int j=0;j<number;j++)
					{	System.out.println("value of array2  is  "+(j+1)+" is = "+arr2[j]);
					}	
					
					if (Arrays.equals(arr1, arr2))
			            System.out.println("Same");
			        else
			            System.out.println("Not same");
					
					
					
				}
				else
					System.out.println("Please enter between 1 to 15 = "+number);
			
			}
			else
				System.out.println("Please enter odd number= "+number);
				
	}

}
