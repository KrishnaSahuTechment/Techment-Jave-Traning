// Program number 28
package com.techment.assignmentsLogicBuild;

import java.util.Scanner;

public class ValidatePIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) 
		{
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter your five digit ATM pin =  ");
		int ATMPin = scanner.nextInt();
		
		if(ATMPin==12345)
		break;
		else
			System.out.println("\nyou entered wrong pin number Please enter again = ");
		}
		
		System.out.println("\nCongrats your ATM pin is correct");
		
	}

}
