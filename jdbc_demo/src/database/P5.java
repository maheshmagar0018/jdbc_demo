package database;
import java.sql.*;
import java.util.Scanner;
public class P5 {

	public static void main(String[] args) {
		String inQry = "insert into student.studentrecord values(?,?,?)"; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your id :-");
		int id = sc.nextInt();
		
		System.out.println("Enter your name :-");
		String name = sc.next();
		
		System.out.println("Enter your age :-");
		int age = sc.nextInt();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			
			PreparedStatement pstmt = con.prepareStatement(inQry);
			
			pstmt.setInt(1,id);
			pstmt.setString(2,name);
			pstmt.setInt(3,age);
			
			pstmt.executeUpdate();
			
			System.out.println("Finished");
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}	
	}
}
