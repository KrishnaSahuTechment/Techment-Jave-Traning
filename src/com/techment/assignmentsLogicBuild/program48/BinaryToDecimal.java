package com.techment.assignmentsLogicBuild.program48;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary number (1/0) form to convert into deccimal number : ");
		int binaryNum = sc.nextInt();
		
		getDecimal(binaryNum);
		System.out.println("Decimal of binary number "+binaryNum+" is :"+getDecimal(binaryNum));
		
	}

	public static int getDecimal(int binary){  
	    int decimal = 0;  
	    int n = 0;  
	    while(true){  
	      if(binary == 0){  
	        break;  
	      } else {  
	          int temp = binary%10;  
	          decimal += temp*Math.pow(2, n);  
	          binary = binary/10;  
	          n++;  
	       }  
	    }  
	    return decimal;  
	}  
	
}
