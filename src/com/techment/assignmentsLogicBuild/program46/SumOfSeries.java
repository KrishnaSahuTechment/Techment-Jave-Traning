package com.techment.assignmentsLogicBuild.program46;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number where upto you want to print sum of this series 1/1! + 2/2! + 3/3! + ……1/N!  : ");
		int num = sc.nextInt();
		
//		factorial(num);
//		System.out.println(factorial(num));
		
		for(int j =1;j<=num;j++)
		{
			
			sum = (double) sum+(j/factorial(j));
		}
		
		System.out.println("Sum of series:  "+sum);
	}

	
	static double factorial(int n)
    {
        if(n == 0)
           return 1.0;
        double i = n, fact = 1;
        while (n / i != n) {
            fact = fact * i;
            i--;
        }
        return fact;
    }
}
