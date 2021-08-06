//Program number 1
package com.techment.assignmentsLogicBuild;

/**
 * 
 */

/**
 * @author Krish
 *
 */

import java.util.*;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1,no2,sum;
//		System.out.println("hello");
		
		
		
		
			Scanner numObj = new Scanner(System.in);
			String number;
			
			System.out.println("Enter  number from 1 to 99 ");
			number = numObj.nextLine();
			int num =  Integer.parseInt(number);
		
			System.out.println("number = "+num);
			
		if (num>=1 && num<=99)
		{
			no1=num%10;
			no2 =num/10;
			sum = no1+no2;
		
			System.out.println("number is = "+num);
			if(sum>=10 && sum<=18){
				System.out.println("congrats you found prince !! glass window is = "+sum);
			}
			else
				System.out.println("wrong window number = "+sum);
			
		}
		else
			System.out.println("Please enter a valid number from 1 to 99 ");
			
	}

	
}

