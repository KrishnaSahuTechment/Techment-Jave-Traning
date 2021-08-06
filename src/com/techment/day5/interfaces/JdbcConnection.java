package com.techment.day5.interfaces;

public interface JdbcConnection {
	void connect();

}


		


class Oracle implements JdbcConnection
{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println(" this is from Oracle ");
	}
	
}

class Mysql implements JdbcConnection
{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println(" this is from MySQL ");
	}
	
	
}
