package com.techment.day3.patterns;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		System.out.print("Even numbers = ");
		for (int i = 0;i<=20;i+=2)
		{
		System.out.print(i+",");
		}
		System.out.print("\n numbers 10 to 1  = ");
		for (int j = 10;j>=1;j--)
		{
		System.out.print(j+",");
		}
		System.out.println("\n sum of the number from 1 to 10 ");
		
		for (int k = 1;k<=10;k++)
		{ sum+=k;
		}
		System.out.println("sum = "+sum);
		
	}

}
