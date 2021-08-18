package com.techment.day12.newfeature;

interface Bank2
{
	
	void display();
	
//	void add(int a,int b);
	

}


public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank2 bank1 = ()->System.out.println("this is display method with single line body");
		bank1.display();
		
		Bank2 bank2 = ()->
		{
			System.out.println("this is display mehtod with multiline body");
			System.out.println("2dn line ");
		};
		bank2.display();
}
}
	