/*
 for pattern
 *
  *
   *
    *

 */

package com.techment.day3.patterns;

public class StairPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 4;
		int num = 1;
		for(int i=1;i<=number;i++)
		{	
			for(int j=1;j<=i;j++)
			{	
				if(i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
		System.out.println("");
		}
		
	}

}
