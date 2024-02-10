package database;
import java.sql.*;
public class P1 {

	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Step 1 done");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			System.out.println("Step 2 done");
			
			Statement stmt = con.createStatement();
			System.out.println("Step 3 done");
			
			stmt.executeUpdate("insert into student.studentdetails values(8,'Bikash sirJi',30)");
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
