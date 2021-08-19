package com.techment.day14.multithreadingDemo;

class Apple extends Thread
{
	public void run()
	{
		for(int i = 1;i<=10;i++)
		{
//			if(i==5)
//				stop();
		System.out.println("eat apple, "+Thread.currentThread().getName());
		}
		
	}

}

class Banana extends Thread
{
	public void run()
	{	for(int i = 1;i<=10;i++)
	{	
//		if(i==8)
//		stop();
		System.out.println("eat Banana, "+Thread.currentThread().getName());
	}
	}

}

public class ThreadNaming {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread());
		
		Apple apple = new Apple();
		Banana banana = new Banana();
		
		apple.setName("Apple Thread");
		banana.setName("Banana Thread");
		apple.start();
		banana.start();
		
		banana.suspend();
		banana.resume();
		
		banana.setPriority(2);
		apple.setPriority(8);
//		apple.run();
//		banana.run();
		
	}

}
