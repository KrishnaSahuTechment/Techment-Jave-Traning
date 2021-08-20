//Program number 14

package com.techment.assignmentsLogicBuild.program14;


import java.util.Scanner;

public class TotalProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum =0,indexValue=0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many product you want to enter   =  ");
		int number = scanner.nextInt();
		System.out.println("================================================");
		System.out.println("ok Total Products you want to enter = "+number);
		System.out.println("================================================");
		int productQuantities[] = new int[number];
		
		Scanner scanProducts = new Scanner(System.in);
		
		for(int i=0;i<number;i++)
		{	System.out.print("Enter the product "+(i+1)+"  Quantities= ");
		 productQuantities[i] = scanProducts.nextInt();
		}
		System.out.println("================================================");
		for(int j=0;j<number;j++)
		{	System.out.println("Quantity of product "+(j+1)+" is = "+productQuantities[j]);
			sum+=productQuantities[j];
		}
		System.out.println("================================================");
		System.out.println("Total stock present = "+sum);
	}

}
