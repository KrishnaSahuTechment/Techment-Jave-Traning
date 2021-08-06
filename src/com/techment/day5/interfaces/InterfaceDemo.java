package com.techment.day5.interfaces;


interface One
{
	void great();
}

interface Two
{
	void great2();
}

class Manager
{
	void operationRegion() 
	{
		
	}
	
}


public class InterfaceDemo extends Manager implements One ,Two 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceDemo demo = new InterfaceDemo();
		demo.great();
		demo.great2();
	}

	@Override
	public void great() {
		// TODO Auto-generated method stub
		System.out.println(" from One interface ");
	}

	@Override
	public void great2() {
		// TODO Auto-generated method stub
		System.out.println(" from Two interface ");
	}

}
