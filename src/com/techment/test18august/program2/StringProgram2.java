package com.techment.test18august.program2;

public class StringProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		repeatFront("Hello", 3);
		System.out.println();
		repeatFront("Hello", 2);
		System.out.println();
		repeatFront("Hello", 1);
		
		}


		static public void repeatFront(String str,int n)
		{
			int temp=n;
			
			for(int i=0;i<n;i++)
			{				
				for(int j=0;j<str.length();j++)
				{
					if(j<str.length()-n)
					continue;
					System.out.print(str.charAt(j));		
				}
				
			}
		
		}
}
