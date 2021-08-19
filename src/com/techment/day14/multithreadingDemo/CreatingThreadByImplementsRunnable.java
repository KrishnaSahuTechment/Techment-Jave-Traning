package com.techment.day14.multithreadingDemo;


class Info implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("this is  run method by implementing runnable object");
	}
	

}


public class CreatingThreadByImplementsRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Info info = new Info();
		
		Thread thread = new Thread(info);
		thread.start();
		
		
	}

}


