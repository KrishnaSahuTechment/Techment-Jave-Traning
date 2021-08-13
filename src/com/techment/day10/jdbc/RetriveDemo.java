package com.techment.day10.jdbc;

import java.sql.*;
import java.util.Scanner;

public class RetriveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Connection con = ConnectionDetails.getConnected();
			PreparedStatement ps = con.prepareStatement("select * from employee where id = ?; ");
			
			System.out.println("Enter id = ");
			Scanner scanner = new Scanner(System.in);
			int empId = scanner.nextInt();

			ps.setInt(1, empId);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				System.out.println("id = "+rs.getInt(1)+" name "+rs.getString(2)+" salary "+rs.getInt(3));
			}
				con.close();
			
			
		}catch(Exception e)
		{
			
			System.out.println("cought: "+e);
		}
		
	}

}
