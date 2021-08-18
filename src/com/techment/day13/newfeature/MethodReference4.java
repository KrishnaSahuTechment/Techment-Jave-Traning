package com.techment.day13.newfeature;
@FunctionalInterface
interface LargeNumber
{
	int findLarge(int a, int b , int c);
}
class CalculationutilLarge
{
	int findLargest(int a, int b, int c)
	{
		if(a>b && a>c )
			return a;
		else if(b>a && b>c)
			return b;
		else
			return c;	
	}
}
public class MethodReference4 {
	public static void main(String[] args) {
		LargeNumber largestNumber =(a,b,c) ->
		{
			if(a>b && a>c )
				return a;
			else if(b>a && b>c)
				return b;
			else
				return c;				
		};
		System.out.println(largestNumber.findLarge(10, 5, 9));
		CalculationutilLarge calculationutil = new CalculationutilLarge();
		LargeNumber largenumber = calculationutil::findLargest;
		System.out.println(largenumber.findLarge(7, 8, 9));
	}
}
