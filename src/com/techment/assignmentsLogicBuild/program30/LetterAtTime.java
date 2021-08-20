//Program number 30

package com.techment.assignmentsLogicBuild.program30;

import java.util.Scanner;

public class LetterAtTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,countA=0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter text"); 
		String Stringvalue = input.nextLine();
	
		
		System.out.println("the entered string");
		for(int i =0;i<Stringvalue.length();i++) 
		{
			char ch=Stringvalue.charAt(i);//returns the char value at the 4th index  
			
			System.out.print(ch);
			if(Stringvalue.charAt(i)=='a')
			{
				System.out.println(Stringvalue.charAt(i));
				countA++;
			}else if(Stringvalue.charAt(i)!=' ')
				{	count++;			  
				}
				
			
		}
		
		System.out.println("\nTotal character = "+count);
		System.out.println("Total length = "+Stringvalue.length());
		System.out.println("First character on string  = "+Stringvalue.charAt(0));

		System.out.println("Last character on string  = "+Stringvalue.charAt(Stringvalue.length()-1));
		System.out.println("Total a = "+countA);
	}

}
