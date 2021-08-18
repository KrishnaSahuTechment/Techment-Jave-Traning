package com.techment.day13.newfeature;

interface Calculation
{
	void display();
}

class Hello
{
	void message()
	{		
		System.out.println("Today is holiday");
	}
}


public class MethodReference1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//by using lamba expression
		Calculation calculation = ()->System.out.println("this is display method");
		calculation.display();
		
		//method reference to no static mehtod (or) instance method
		Hello hello = new Hello();
		Calculation calculation2 = hello::message;
		calculation2.display();
		
		
		
	}

}
