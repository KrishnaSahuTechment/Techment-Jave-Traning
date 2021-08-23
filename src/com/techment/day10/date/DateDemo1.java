package com.techment.day10.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());
		
		System.out.println(LocalDate.now().getDayOfYear());
		System.out.println(LocalDate.now().getDayOfMonth());
		System.out.println(LocalDate.now().getDayOfWeek());
		
		
		System.out.println("===========================");
		LocalDate today= LocalDate.now();
		System.out.println("today: "+today);
		
		System.out.println("===========================");
		System.out.println("after 2 months "+today.plusMonths(2));
		
		System.out.println("===========================");
		System.out.println("after 2days "+today.plusDays(2));
		
		System.out.println("===========================");
		System.out.println("after 2 weeks "+today.plusWeeks(2));
		
		System.out.println("===========================");
		System.out.println("after 2 years "+today.plusYears(2));
		
		
		System.out.println("===========================");
		System.out.println("minus 2 days "+today.minusDays(2));
		
		System.out.println("===========================");
		System.out.println("minus 2 month "+today.minusMonths(2));
		
		System.out.println("===========================");
		System.out.println("minus 2 weeks "+today.minusWeeks(2));
		
		System.out.println("===========================");
		System.out.println("minus 2 years "+today.minusYears(2));
		
	}

}
