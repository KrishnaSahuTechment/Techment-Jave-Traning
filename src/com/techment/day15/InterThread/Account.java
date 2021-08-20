package com.techment.day15.InterThread;

public class Account {

	int balence=0;
	
	synchronized public int withdraw(int amount)
	{
		if(amount>balence)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}	
		System.out.println(Thread.currentThread().getName()+" is going to withdraw ");
		balence-=amount;//balence = balence-amount
//		notifyAll();
		
		return balence;
	}
	
	synchronized public int deposit(int amount)
	{
		if(amount>0) {
		System.out.println(Thread.currentThread().getName()+" is going to deposit");
		balence+=amount;
		}
		notifyAll();
		return balence;
	}
	
}
