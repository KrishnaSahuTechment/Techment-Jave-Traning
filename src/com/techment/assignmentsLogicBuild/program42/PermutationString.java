package com.techment.assignmentsLogicBuild.program42;

import java.util.Scanner;

public class PermutationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any string");
		String str = scanner.next();
		
		getPermutaion(str,"");
	}
	
	static void getPermutaion(String str,String ans)
	{
		 if (str.length() == 0) {
	            System.out.print(ans + " ");
	            return;
	        }
	  
	        for (int i = 0; i < str.length(); i++) 
	        {	          
	            char ch = str.charAt(i);
	            
	            String ros = str.substring(0, i)+str.substring(i + 1);
	  
	            
	            getPermutaion(ros, ans + ch);
	        }
		
	}

}
