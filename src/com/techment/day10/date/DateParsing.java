package com.techment.day10.date;

import java.time.LocalDate;

public class DateParsing {

	public static void main(String[] args) {
		
		String dob = "1995-10-20";
		String joiningDate = "2020-02-22";
		
		System.out.println("date of birth: "+dob);
		System.out.println("joining Date: "+joiningDate);
		
		LocalDate joiningDateAfterParse =  LocalDate.parse(joiningDate);
		System.out.println("joiningDateAfterParse :"+joiningDateAfterParse );
		
		System.out.println("joiningDateAfterParse :"+joiningDateAfterParse.getDayOfYear() );
		System.out.println("joiningDateAfterParse :"+joiningDateAfterParse.getDayOfMonth() );
		System.out.println("joiningDateAfterParse :"+joiningDateAfterParse.getMonthValue() );

		
		System.out.println("joiningDateAfterParse year :"+joiningDateAfterParse.getYear() );
		System.out.println("joiningDateAfterParse Month :"+joiningDateAfterParse.getMonth() );
		System.out.println("joiningDateAfterParse Day :"+joiningDateAfterParse.getDayOfWeek() );

		System.out.println("================Sample===============");
		
		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.parse(dob);
		System.out.println("birthDate: "+birthDate);
		
		System.out.println();
		
	}

}
