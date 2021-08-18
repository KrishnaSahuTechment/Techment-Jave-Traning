package com.techment.day12.newfeature;

interface Largest
{
	
String findLargest(int a,int b, int c);
}



public class FindLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Largest largest  =(a,b,c)->
		{
			if(a>b&&a>c)
			{
				return a+"largest";
				
			}
			else if(b>a&&b>c)
			{
				return b+"largest";
				
			}
			else if(c>b&&c>a)
			{
				return c+"largest";
				
			}
			return null;
			
		};
		
		System.out.println(largest.findLargest(5, 6, 7));
	}

}
