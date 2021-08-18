package com.techment.day12.newfeature;



@FuntionalInterface
interface Bank
{
	Void rateOfInterest();
	default void dispaly()
	{
		System.out.println("this is default");
	}
	
	
	static void loan()
	{
		System.out.println("You can apply for loan ");
	}
	
	
	
	
}


public class FunctionInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
