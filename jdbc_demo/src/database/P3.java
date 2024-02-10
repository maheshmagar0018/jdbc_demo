package database;

import java.sql.*;

public class P3 {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Step 1 complete");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			System.out.println("Step 2 complete");
			
			PreparedStatement pstmt = con.prepareStatement("insert into product.productrecord_1 values (4,'Nuts',33)");
			//PreparedStatement pstmt = con.prepareStatement("delete from product.productrecord_1 where P_id = 3");
			//PreparedStatement pstmt = con.prepareStatement("update product.productrecord_1 set P_id = 3 where P_name = 'Coconut-cookies'");
			 
			System.out.println("Step 3 complete");
			
			pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
 
}
