package com.techment.day14.multithreadingDemo;


class Message extends Thread
{
	public void run()
	{
		System.out.println("this is my task ");
		
	}


}



public class CreatingThreadByExtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Message  messase  = new Message ();
		
		messase.start();
		
		
	}

}
