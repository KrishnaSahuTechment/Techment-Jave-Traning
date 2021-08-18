package com.techment.java8feturesAssignments;

@FunctionalInterface
interface Greatest
{
	public int findGreatest(int a,int b,int c);
	
}

public class LamdaMultipleParameter {

	public static void main(String[] args) {
	
		
		
		Greatest numbers = (a,b,c)->{
			int greatest=0;
			
			if(a>b&&a>c)
				greatest = a;
			else if(b>a&&b>c)
				greatest = b;
			else if(c>a&&c>b)
				greatest=c;
			
			return greatest;
		};
		
		System.out.println("Gretest: "+numbers.findGreatest(50, 30, 100));
		System.out.println("Gretest: "+numbers.findGreatest(80, 30, 70));
		System.out.println("Gretest: "+numbers.findGreatest(90, 30, 10));
	}

}
