package kr.ac.joongboo.is.edu.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = null;
	
			con = DriverManager.getConnection("jdbc:mysql://localhost/qpick",	"ccit", "ccir");
	
			java.sql.Statement st = null;
			ResultSet rs = null;
			st = con.createStatement();
			rs = st.executeQuery("SELECT USER_ID, USER_PASS, GENDAR  FROM USER_TABLE");

	
			while (rs.next()) {
				String userId = rs.getString("USER_ID");
				String userPass = rs.getString("USER_PASS");
				int i = rs.getInt("GENDAR");
				
				System.out.println(userId + " " + userPass + " " + i);
			}
			
			
			
			
		} catch (SQLException sqex) {
			System.out.println("SQLException: " + sqex.getMessage());
			System.out.println("SQLState: " + sqex.getSQLState());
		}

	}

}

// Close 추가
