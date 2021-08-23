package com.techment.assignmentsLogicBuild.program40;

import java.util.Scanner;

public class MirrorMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = new int[3][3];
		int m[][] = new int[3][3];
		int i,j,n;
		
		
		System.out.println("Enter elments in matrix: ");
		
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println("Enter elements in ["+i+"]"+"["+j+"] :");
				a[i][j] = sc.nextInt();
				
			}
			
		}
		
		System.out.println("Matrix is : ");
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			
				
			}
			System.out.println();
			
		}
		
		for(i=0;i<3;i++)
		{
			n=3-1;
			for(j=0;j<3;j++)
			{
				m[i][j] = m[i][j]+a[i][n];
				n--;
			}
			
		}
		
		System.out.println("Mirror Matrix  is : ");
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(m[i][j]+" ");
			
				
			}
			System.out.println();
			
		}
		
		
	}

}
