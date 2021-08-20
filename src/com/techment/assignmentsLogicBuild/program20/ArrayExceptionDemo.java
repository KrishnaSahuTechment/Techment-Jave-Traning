//Program Number 20

package com.techment.assignmentsLogicBuild.program20;
import java.lang.*;
import java.math.*;
import java.util.Scanner;

public class ArrayExceptionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter size of an array =  ");
		int number = scanner.nextInt();
		System.out.println("\nok it is = "+number);
		
		int arraySize[] = new int[number];
		
		Scanner scanArrayValue = new Scanner(System.in);
		System.out.println("");
		
		for(int i=0;i<number;i++)
		{	System.out.print("Enter the value for  ["+i+"] = ");
		arraySize[i] = scanArrayValue.nextInt();
		}
		System.out.println("");
		for(int j=0;j<number;j++)
		{	System.out.println("value of ["+j+"] is = "+arraySize[j]);
		}
		
		Scanner scanFind = new Scanner(System.in);
		System.out.print("Enter index to find value in  array =  ");
		int find = scanFind.nextInt();
		
		System.out.println("\nok you want to find value in index number = "+find);
		
		try{
		System.out.println("value at index ["+find+"] "+arraySize[find]);
		}catch(Exception e)
		{
			System.out.println("Exeption ="+e);
			System.out.println("Please enter a valid index value");
		}
	}

}
