package com.techment.day4.polymorphism;

class Bank 
{
	public void rateOfInterests()
	{
		
		System.out.println("3%");	
	}
	
}

class SBI extends Bank
{	
	@Override						
	public void rateOfInterests()
	{
		
		System.out.println("4%");	
	}
}

class Axis extends Bank
{	
//	@Override
	public void rateOfInterests()
	{
		
		System.out.println("5%");	
	}
}

class IDFC extends Bank
{	
	@Override
	public void rateOfInterests()
	{
		
		System.out.println("6%");	
	}
}


public class OverridingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI sbi = new SBI();
		Axis axis = new Axis();
		IDFC idfc = new IDFC();
		sbi.rateOfInterests();
		axis.rateOfInterests();
		idfc.rateOfInterests();
	}

}
