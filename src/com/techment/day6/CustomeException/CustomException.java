package com.techment.day6.CustomeException;

public class CustomException {

	public static void main(String[] args) throws InsufficientFundsException
	{
		// TODO Auto-generated method stub
		Account account = new Account();
		try
		{
			account.withdraw(20000);
//			System.out.println();
		}catch(InsufficientFundsException e) {
			System.out.println(e.getMessage());
			
		}
		
	}

}
