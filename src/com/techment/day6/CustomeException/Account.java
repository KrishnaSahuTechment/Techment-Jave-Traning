package com.techment.day6.CustomeException;

public class Account  {

	int balence=5000;
	
		void withdraw(int amount) throws InsufficientFundsException
		{
			try {
			if(amount>balence)
				throw new InsufficientFundsException("insufficient fund");
			else
				System.out.println("Amount = "+amount);
			
		
		
	}catch(InsufficientFundsException e)
	{
		System.out.println(e);
	}
		
	}
}
