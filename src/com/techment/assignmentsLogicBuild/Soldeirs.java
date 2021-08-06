//Program number 7
package com.techment.assignmentsLogicBuild;


import java.util.Scanner;

public class Soldeirs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		int soldeirFirst;
		int soldeirLast;
		
		
		System.out.print("Enter 1st soldeir number ");
		soldeirFirst = Sc.nextInt();
		System.out.print("\nEnter last soldeir number ");
		soldeirLast = Sc.nextInt();
				 
		System.out.println("\nFirst Soldeir number  = "+soldeirFirst);
		System.out.println("Last Soldeir number  = "+soldeirLast);
		
		if(soldeirFirst>soldeirLast)
		{
			int temp = soldeirFirst;
			soldeirFirst = soldeirLast;
			soldeirLast = temp;
		}
		System.out.println("The list of soldeirs which are able to going in battle ");
		for(int i=soldeirFirst+1;i<soldeirLast;i++)
		{
			System.out.println(" Soldeir number = "+i);
				
		}
		
		
	}

}
