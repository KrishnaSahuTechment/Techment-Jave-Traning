package com.techment.assignmentsLogicBuild.program49;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class FindAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the your date of birth yyyy-mm-dd formate : ");
		String dob = sc.next();
		LocalDate today = LocalDate.now();
		
		LocalDate BirthDateAfterParse =  LocalDate.parse(dob);
		
		Period period = Period.between(BirthDateAfterParse, today);
		
		System.out.println("years: "+period.getYears()+" Months: "+period.getMonths()+" Day: "+period.getDays());
	}

}

