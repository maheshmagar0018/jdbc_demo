package database;

import java.sql.*;

public class P4 {

	public static void main(String[] args) {
		String inQry="insert into student.studentrecord values (?,?,?)";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			
			PreparedStatement pstmt = con.prepareStatement(inQry);
			pstmt.setInt(1,45);
			pstmt.setString(2,"Jonny");
			pstmt.setInt(3,29);
			
			pstmt.executeUpdate();
			System.out.println("Finished");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
