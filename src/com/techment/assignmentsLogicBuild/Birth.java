//Program number 5
package com.techment.assignmentsLogicBuild;


import java.util.Scanner;


public class Birth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int monthValue;
		
		System.out.println("Enter your birth month =  ");
		monthValue = scanner.nextInt();
		System.out.println("Entered monthValue is  = "+monthValue);
		
		switch(monthValue){
		case 1:
			System.out.println("your birth month is January");
			break;
		case 2:
			System.out.println("your birth month is February");
			break;
		case 3:
			System.out.println("your birth month is March");
			break;
		case 4:
			System.out.println("your birth month is April");
			break;
		case 5:
			System.out.println("your birth month is May");
			break;
		case 6:
			System.out.println("your birth month is June");
			break;
		case 7:
			System.out.println("your birth month is July");
			break;
		case 8:
			System.out.println("your birth month is August");
			break;
		case 9:
			System.out.println("your birth month is september");
			break;
		case 10:
			System.out.println("your birth month is October");
			break;
		case 11:
			System.out.println("your birth month is November");
			break;
		case 12:
			System.out.println("your birth month is december");
			break;
		default:
			System.out.println("Invalid number please enter number between 1 to 12");
			
		
		}
		
		
	}

}
