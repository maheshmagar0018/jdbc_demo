package database;
import java.sql.*; 
public class P2 {

	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Step 1 done");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			System.out.println("Step 2 done");
			
			Statement stmt = con.createStatement();
			System.out.println("Step 3 done");
			
			stmt.executeUpdate("insert into product.productrecord values(5,'Dark Oreo',64,2022,2023)");
			
			//stmt.executeUpdate("insert into student.studentdetails values(8,'Mahi',22)");
			//stmt.executeUpdate("update product.productrecord set P_id = 4 where P_name = 'dairy milk'");
			//stmt.executeUpdate("delete from product.productrecord where P_id = 3");
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
