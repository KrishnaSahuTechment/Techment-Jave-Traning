package com.techment.day5.interfaces;

public class JdbcMain
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JdbcConnection jdbc = new Oracle();
		jdbc.connect();
		
		JdbcConnection jdbc2 = new Mysql();
		jdbc2.connect();
	}

}
