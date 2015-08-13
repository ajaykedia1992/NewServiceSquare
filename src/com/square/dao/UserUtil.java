package com.square.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public abstract class UserUtil {

	private static ResourceBundle rb;
	static
	{
	
		try {
			rb=ResourceBundle.getBundle("square");
			Class.forName(rb.getString("driver"));
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	public static Connection getConn() throws SQLException
	{
		String url=rb.getString("url");
		String uname=rb.getString("uname");
		Connection conn=DriverManager.getConnection(url,uname,"");
		return conn;
	}
	public static void closeConn(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}
	public static int validateUser(String Username,String Password) 
	{
		Connection conn=null;
		try {
			conn = UserUtil.getConn();
			Statement stmt= conn.createStatement();
			ResultSet results = stmt.executeQuery("select count(*) user where email='"+Username+"' and password='"+Password+"'");
			System.out.println(results.getInt(0));
			if(results.getString(0)=="1")
				return 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
				UserUtil.closeConn(conn);
		}
		
		
	return 0;
		
	}
	public static int fetchUserId(String emailid)
	{
		
		int user_Id=0;
		Connection conn=null;
		try {
			conn = UserUtil.getConn();
			Statement stmt= conn.createStatement();
			ResultSet results=stmt.executeQuery("select user_id from user where email='"+emailid+"'");
			if(results.getInt(0)!=0)
			{
				user_Id=results.getInt(0);
				return user_Id;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			UserUtil.closeConn(conn);
		}
		return 0;
	
		
	
	}
}
