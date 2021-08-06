/*
 for pattern
 * 
 *  * 
 *  *  * 
 *  *  *  * 
 *  *  *  *  * 
  
 */

package com.techment.day3.patterns;
import java.util.Scanner;


public class StarPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any integer number to print patterns =  ");
		int number = scanner.nextInt();
		
		for(int i=1;i<=number;i++)
		{	for(int j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
		System.out.println("");
		}
	}

}
