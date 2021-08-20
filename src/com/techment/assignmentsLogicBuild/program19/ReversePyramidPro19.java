//Program number 19 

/*
1 2 3 4 5 4 3 2 1 
  1 2 3 4 3 2 1 
    1 2 3 2 1 
      1 2 1 
        1 

*/


package com.techment.assignmentsLogicBuild.program19;


import java.util.Scanner;

public class ReversePyramidPro19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any integer number to print patterns =  ");
		int rowNumber = scanner.nextInt();
		
		int temp = rowNumber;
		for(int i=0;i<rowNumber;i++)
		{
			for (int j=1;j<=i*2; j++)
            {
                System.out.print(" ");
            }
			
			for(int j=1;j<=temp;j++)
			{				
				System.out.print(j+" ");
			}
			
			for(int j=temp-1;j>=1;j--)
			{				
				System.out.print(j+" ");
			}
			
			System.out.println();
			temp--;
		}
	}

}
