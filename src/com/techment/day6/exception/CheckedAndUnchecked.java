package com.techment.day6.exception;

import java.io.FileNotFoundException;

public class CheckedAndUnchecked {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
//		throw new ArithmeticException("arithmetic Exception occured");  // run time
		try {
		throw new FileNotFoundException("file is not found"); // compile time 
		}catch(Exception e)
		{
			System.out.println("exception"+e);
		}
		
	}

}
