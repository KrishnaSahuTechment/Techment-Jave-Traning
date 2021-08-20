//Program number 2
package com.techment.assignmentsLogicBuild.program2;

import java.util.Scanner;
import java.util.*;
import java.time.LocalDate;
import java.time.Month;


public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		//Getting the current date value
	      LocalDate currentdate = LocalDate.now();
	      System.out.println("Current date: "+currentdate);
	      //Getting the current day
	      int currentDay = currentdate.getDayOfMonth();
	      System.out.println("Current day: "+currentDay);
							
		if (currentDay >=1 && currentDay <=31)
		{ 	
			
			if (currentDay%2==0)
				System.out.println("Cars with Even registration numbers are permitted today beacause date is even = "+currentDay);
			else
				System.out.println("Cars with Odd registration numbers are permitted today beacause date is Odd = "+currentDay);
		}
		else
			System.out.println(" Invalid date "+currentdate);
			
	}

}
