//Program number 10
package com.techment.assignmentsLogicBuild.program10;

import java.util.Scanner;


public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any integer number till you want prime number series =  ");
		int number = scanner.nextInt();
		System.out.println("Entered number is  = "+number);
		
		
		if (number==0)
			System.out.println(number+" is not a prime number");
		else if (number==1)
			System.out.println(number+" is not a prime number");
		else
		{	
				for(int j=2;j<=number;j++)
				{ int count=0;
					for(int i=1;i<=j;i++ )
					{
						if(j%i==0)
							count++;
																
					}
					if(count==2)
						System.out.print(j+" ");
				}
		}
		
		
	}

}
