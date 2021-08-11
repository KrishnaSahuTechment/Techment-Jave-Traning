package com.techment.day6.exception;
import java.util.*;


class AgeException extends RuntimeException  // RuntimeException
{
	String msg;

	public AgeException(String msg) {
		super();
		this.msg = msg;
	}
	
}

class IdNotFoundException extends Exception	//compile time exception
{
	String msg;

	public IdNotFoundException(String msg) {
		super();
		this.msg = msg;
	}
	
	
}


public class CustomeException {		
	
	
	public static void main(String[] args) throws IdNotFoundException  {
		// TODO Auto-generated method stub
		
		throw new IdNotFoundException(" id not found ");
//		throw new AgeException(" age not valid ");
	}

}
