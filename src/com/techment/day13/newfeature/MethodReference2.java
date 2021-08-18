package com.techment.day13.newfeature;

@FunctionalInterface
interface Calculate
{
	int add(int a,int b);
}

class CalculationUtil
{
	int addition(int a,int b)
	{
		return a+b;
	}
 static	int substract(int a,int b)
	{
		return a-b;
	}
}



public class MethodReference2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//by using lambda
		Calculate cal = (a,b)->a+b;		
		System.out.println("addition: "+cal.add(2, 4));
		
		Calculate cal2 = (a,b)->a-b;		
		System.out.println("substraction: "+cal2.add(2, 4));
	
		
				
		// by using method reference
		CalculationUtil calculationUtil = new CalculationUtil();
		
		
		 Calculate c1 =calculationUtil::addition;
		 System.out.println(c1.add(2, 10));
		 
		 Calculate c2 = CalculationUtil::substract; //static
		 System.out.println(c2.add(2, 10));
	}

}
