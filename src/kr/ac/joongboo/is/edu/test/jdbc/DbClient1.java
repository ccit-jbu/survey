package kr.ac.joongboo.is.edu.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbClient1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		try {
			Connection con = null;
	
			con = DriverManager.getConnection("jdbc:mysql://localhost/qpick",	"ccit", "ccir");
	
			java.sql.PreparedStatement st = null;
			ResultSet rs = null;

			st = con.prepareStatement("UPDATE USER_TABLE SET USER_PASS = ?, GENDAR = ? where USER_ID = ?");
			
			int i = 1;
			
            st.setString(i++, "KIM");
            st.setString(i++, "passW@rd");
            st.setInt(i++, 1);

			int cnt = st.executeUpdate();
            System.out.println("변경된 레코드 수:" + cnt);


		} catch (SQLException sqex) {
			System.out.println("SQLException: " + sqex.getMessage());
			System.out.println("SQLState: " + sqex.getSQLState());
		}

	}

}

// Insert DELETE 추가
