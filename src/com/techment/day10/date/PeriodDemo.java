package com.techment.day10.date;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate today = LocalDate.now();
		
		LocalDate birthdate =	LocalDate.of(1995, 10, 20);
		
		Period period = Period.between(birthdate, today);
		
		System.out.println("years: "+period.getYears()+" Months: "+period.getMonths()+" Day: "+period.getDays());
		
	System.out.println((birthdate.isBefore(today)));
		
		
	}

}
