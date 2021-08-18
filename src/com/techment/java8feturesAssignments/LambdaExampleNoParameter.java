package com.techment.java8feturesAssignments;

@FunctionalInterface
interface Message
{
	public String display();
}


public class LambdaExampleNoParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Message msg1 = ()->
		{
			return "Hello, This is krishna";
		};
		System.out.println(msg1.display());
		
	}

}
