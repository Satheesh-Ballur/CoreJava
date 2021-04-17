package com.ballur.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws Exception
	{

		
		int aid = 14;
		String color = "marron";
		String fname = "abhi";
		String lname = "naya";
		
		String query = "insert into alien_table values (?,?,?,?)";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ballurdb","root","password");
		
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, aid);
		st.setString(2, color);
		st.setString(3, fname);
		st.setString(4, lname);		
		int rs = st.executeUpdate();
		
		System.out.println(rs);
		
		
	
		
		
		
		
		
		
		
		

	}

}
