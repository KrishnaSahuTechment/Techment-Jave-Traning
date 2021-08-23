package com.techment.assignmentsLogicBuild.program51;

import java.util.Scanner;

public class FindFascinatingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, n2, n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find Facinating number: ");
		 num = sc.nextInt();
		
		n2 = num * 2;  
		n3 = num * 3;  
		  
		String combine = num + "" + n2 + n3;  
		boolean found = true;  
		  
		for(char c = '1'; c <= '9'; c++)  
		{  
			int count = 0;  
			  
			for(int i = 0; i < combine.length(); i++)  
			{  
				char ch = combine.charAt(i);  
			  
				if(ch == c)  
				count++;  
			}  
			  
			if(count > 1 || count == 0)  
			{  
			found = false;  
			break;  
			}  
		}  
		if(found)  
		System.out.println(num + " is a fascinating number.");  
		else  
		System.out.println(num + " is not a fascinating number.");  

	}

}
