package com.techment.day5.abstraction;


abstract class Bank
{
	void Eligibility()
	{
		System.out.println("Above 18 can open an account");
		
	}
	
	abstract int rateOfIntrestRate(int intrestRate);
}

/* when any class extends abstract so it's need to provide body 
  to abstract method means override is compulsory for abstract method
*/
 class Axis extends Bank
{
	@Override int rateOfIntrestRate(int intrestRate)
	{
		System.out.print("rate of intrest of Axis bank is = ");
		return intrestRate;
	}
}

 class IDFC extends Bank
{
	@Override int rateOfIntrestRate(int intrestRate)
	{
		System.out.print("rate of intrest of IDFC bank is = ");
		return intrestRate;
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bank1 = new Axis();
		System.out.println(bank1.rateOfIntrestRate(5));
		
		Bank bank2 = new IDFC();
		System.out.println(bank2.rateOfIntrestRate(6));
	}

}
