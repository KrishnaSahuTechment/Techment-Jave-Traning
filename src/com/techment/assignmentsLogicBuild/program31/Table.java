//Program number 31

package com.techment.assignmentsLogicBuild.program31;
import java.util.Scanner;


public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any integer number to print tables =  ");
		int number = scanner.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(number+"*"+i+"= "+number*i);
		}
	}

}
