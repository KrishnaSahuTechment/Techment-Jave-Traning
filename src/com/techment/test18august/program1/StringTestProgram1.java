package com.techment.test18august.program1;

public class StringTestProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		repeatFront("Chocolate", 4);
		System.out.println();
		repeatFront("Chocolate", 3);
		System.out.println();
		repeatFront("Ice Cream", 2);
		
	}

	static public void repeatFront(String str,int n)
	{
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(str.charAt(j));
				
			}
			n--;
		}
		
		
	}
}
