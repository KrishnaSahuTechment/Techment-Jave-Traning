package com.techment.day6.CustomeException;

public class InsufficientFundsException extends RuntimeException {
	
	String msg;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public InsufficientFundsException(String msg) {
		super();
		this.msg = msg;
	}

}
