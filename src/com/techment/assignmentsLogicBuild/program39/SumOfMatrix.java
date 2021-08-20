//Program number 39

package com.techment.assignmentsLogicBuild.program39;

import java.util.Scanner;

public class SumOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sum=0;
		int MatrixA[][] = 	new int [3][3];			//{{1,2,3},{4,5,6},{7,8,9}};
		int MatrixB[][] = 	new int [3][3];				//{{1,2,3},{4,5,6},{7,8,9}};
		
		int MatrixC[][] = new int [3][3];
		
		
		Scanner scanner = new Scanner(System.in);
				
		
		System.out.println("enter values for matrix A = ");
		for (int i = 0; i<MatrixA.length;i++)
		{
			for (int j = 0;j<MatrixA.length;j++) 
			{	
				MatrixA[i][j] = scanner.nextInt();

			}
			System.out.println(" ");
		}
		
		Scanner scannerB = new Scanner(System.in);
		
		System.out.println("enter values for matrix B = ");
		for (int i = 0; i<MatrixB.length;i++)
		{
			for (int j = 0;j<MatrixB.length;j++) 
			{	
				MatrixB[i][j] = scannerB.nextInt();

			}
			System.out.println(" ");
		}

		
		System.out.println("matrix A = ");
		for (int i = 0; i<MatrixA.length;i++)
		{
			for (int j = 0;j<MatrixA.length;j++) 
			{	
				System.out.print(MatrixA[i][j]+" ");
			}
			System.out.println(" ");
		}

		System.out.println("matrix B = ");
		for (int i = 0; i<MatrixB.length;i++)
		{
			for (int j = 0;j<MatrixB.length;j++) 
			{	
				System.out.print(MatrixB[i][j]+" ");

			}
			System.out.println(" ");
		}

		System.out.println("after addition matrix C = ");
		for (int i = 0; i<MatrixA.length;i++)
		{
			for (int j = 0;j<MatrixB.length;j++) 
			{
				 MatrixC[i][j] = MatrixA[i][j]+MatrixB[i][j];
				 System.out.print(MatrixC[i][j]+" ");
			}
			System.out.println(" ");
		}
				
	}

}
