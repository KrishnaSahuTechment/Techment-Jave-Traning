package com.techment.day10.date;

import java.time.LocalDate;

public class DateDemo2 {

	public static void main(String[] args) {
		
		
		LocalDate today = LocalDate.now();
		
		System.out.println(today.getDayOfWeek());
		
		
		System.out.println(today.plusYears(2).getDayOfMonth());
		
		System.out.println(today.plusYears(2).getDayOfWeek());
		
		System.out.println(today.plusYears(2).getDayOfWeek().toString().equals("WEDNESDAY"));
	
		
		LocalDate datetime = LocalDate.now();
		
		
		System.out.println("datetime: "+datetime);
		
		
		
	}

}
