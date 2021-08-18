package com.techment.day12.newfeature;

import java.util.function.Function;
import java.util.function.Predicate;

public class InbuiltFuntionInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> predicate = (num)->num>18;
		
		System.out.println(predicate.test(20));
		
		Predicate<String> strPredicate = (name)->name.contains("a");
		System.out.println(strPredicate.test("krishna"));
		
		Function<Integer, Integer> function1 = (num1) -> num1;
		Function<Integer, String> function2 = (num2) -> "value of="+num2;
		Function< String,Integer> function3 = (num3) -> num3.length();

		
		System.out.println(function1.apply(5));
		System.out.println(function2.apply(5));
		System.out.println(function3.apply("krishna"));
		
	}

}
