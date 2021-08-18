package com.techment.day12.newfeature;


interface Calculation
{
//	void add(int a,int b);
 int add(int a,int b);

}


public class LambdaDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Calculation calculation =(a,b)->System.out.println("result: "+(a+b));
		
//		calculation.add(5, 6);
//		calculation.add(4, 8);
		
		Calculation calculation1 =(a,b)->a+b;
		Calculation calculation2 =(a,b)->
		{
			if(a>b)
				return a;
			return b;
			
		};
		
		System.out.println(calculation1.add(4, 8));
		
		System.out.println(" largest number = "+calculation2.add(12, 8));
		
		
		
	}

}
