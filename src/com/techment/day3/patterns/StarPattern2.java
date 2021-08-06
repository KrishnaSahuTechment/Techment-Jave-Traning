/* 
 for pattern
 
*****
*   *
*   *
*   *
*****

  
   */

package com.techment.day3.patterns;

public class StarPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 5,col=5;
		for(int i=1;i<=row;i++)
		{	
			for(int j=1;j<=col;j++)
			{	if(i==1||i==row||j==1||j==col)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
