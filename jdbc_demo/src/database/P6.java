package database;

import java.sql.*;

public class P6 {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			
			 stmt = con.createStatement();
			
			 rs = stmt.executeQuery("select * from student.studentdetails where name like 'S%' ");
			while(rs.next())
			{
				/*System.out.println("ID:-" + rs.getInt(1));
				System.out.println("Name:-" + rs.getString(2));
				System.out.println("Age:-" + rs.getInt(3));
				System.out.println("");*/
				
				System.out.println(" Student id:- " + rs.getInt(1) +" ||"+ " Student Name:- " + rs.getString(2) +" ||"+ "  Student Age:- " + rs.getInt(3));
				System.out.println();
			}
		
			System.out.println("Finished");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally
		{
			if(rs != null)
			{
				 try {
					rs.close();
					
					System.out.println("ResultSet closed !!!");
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			if(stmt != null)
			{
				 try {
					stmt.close();
					
					System.out.println("Statement closed !!!");
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			if(con != null)
			{
				 try {
					con.close();
					
					System.out.println("Connection closed !!!");
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		}
	}
}
