/* for pattern
1
23
456
78910  */

package com.techment.day3.patterns;

import java.util.Scanner;

public class NumberPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 4;
		int num = 1;
		for(int i=1;i<=number;i++)
		{	for(int j=1;j<=i;j++)
			{
				System.out.print(num++);
			}
		System.out.println("");
		}
	}

}
