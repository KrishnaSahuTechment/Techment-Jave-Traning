//Program number 12
package com.techment.assignmentsLogicBuild.program12;

import java.util.Scanner;
/*
		5 
	  4 5 4 
	3 4 5 4 3 
  2 3 4 5 4 3 2 
1 2 3 4 5 4 3 2 1 
   
 */

public class PyramidReversePro12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any integer number to print patterns =  ");
		int rowNumber = scanner.nextInt();
		
		 int rowCount = 1;
		 		        	 
	        for (int i = rowNumber; i >= 1; i--)
	        {
	            //Printing i*2 spaces at the beginning of each row
	 
	            for (int j = 1; j <= i*2; j++)
	            {
	                System.out.print(" ");
	            }
	 
	            //Printing j where j value will be from i to noOfRows
	 
	            for (int j = i; j <= rowNumber; j++)          
	            {
	                System.out.print(j+" ");
	            }
	 
	            //Printing j where j value will be from noOfRows-1 to i
	             
	            for (int j = rowNumber-1; j >= i; j--)
	            {               
	                System.out.print(j+" ");            
	            }
	             
	            System.out.println();
	 
	            //Incrementing the rowCount
	 
	            rowCount++;
	        }
		
	}

}
