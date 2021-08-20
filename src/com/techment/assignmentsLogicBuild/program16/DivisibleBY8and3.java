// Program number 16
package com.techment.assignmentsLogicBuild.program16;

import java.util.Scanner;

public class DivisibleBY8and3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any amount =  ");
		int number = scanner.nextInt();
		
		System.out.println("");
		System.out.println("Number you entered = "+number);
		
		if(number%8==0&&number%3==0)
			System.out.println(number+" is divisible by 8 and 3 now Mr Raj buy goods ");
		else
			System.out.println(number+" is not  divisible by 8 and 3 !!");
		
		
	}

}
