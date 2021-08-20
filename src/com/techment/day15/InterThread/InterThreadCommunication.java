package com.techment.day15.InterThread;


public class InterThreadCommunication {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		Thread t1 = new Thread()
		{
			public void run()
			{
				System.out.println("After withdraw balence is: "+account.withdraw(2000));
				
				
			}
			
		};
		
		Thread t2 = new Thread()
		{
			public void run()
			{
				System.out.println("After deposit balence is: "+account.deposit(3000));
				
			}
			
		};
		
		t1.setName("ATM");
		t2.setName("Bank");
		
		t1.start();
		t2.start();
		
	}

}
