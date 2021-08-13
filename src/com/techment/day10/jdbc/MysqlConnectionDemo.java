package com.techment.day10.jdbc;

//import java.sql.Connection;
//import java.sql.DriverManager;
//
//import com.mysql.cj.xdevapi.Statement;

import java.sql.*;

public class MysqlConnectionDemo {

	
	
	public static void main(String[] args) {
		
		try {
		
		//step1
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("class found and loaded");
		
		//step2
		String url1 = "jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false";
//		String url2 = "jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false";
		
		Connection con1 = DriverManager.getConnection(url1, "root", "root");
//		Connection con2 = DriverManager.getConnection(url2, "root", "root");
		
		System.out.println("con to connect Mysql = "+con1);
		System.out.println("connected to my sql");
		
		Statement stmt = con1.createStatement();
		ResultSet rs = stmt.executeQuery("select * from employee");
		
		System.out.println("rs ="+rs);
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
			con1.close();
			
		
		}catch(ClassNotFoundException e)
		{
			System.out.println("cought: "+e);
			
			
		}catch(Exception e)
		{
			System.out.println("cought: "+e);
			
			
		}
	}

}
