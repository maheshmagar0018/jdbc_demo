// code to execute the batch w.r.t statement.
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class P7 {

	public static void main(String[] args) 
	{
		String inQry = "insert into empdetails.emprecords values(3,'Rocky','Technical')";
		String upQry = "update student.studentrecord set id=46 where name='david'";
		String deQry = "delete from product.productrecord where P_id=5";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Step 1 done");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			System.out.println("Step 2 done");
			
			Statement stmt = con.createStatement();
			
			// Added the Query into the Batch 
			stmt.addBatch(inQry);
			stmt.addBatch(upQry);
			stmt.addBatch(deQry);
			
			// Execute the Batch
			int [] ar = stmt.executeBatch();
			System.out.println("Size of the Array:- "+ar.length);
			System.out.println("Finished");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
