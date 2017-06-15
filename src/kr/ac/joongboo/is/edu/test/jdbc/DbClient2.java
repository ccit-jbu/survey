package kr.ac.joongboo.is.edu.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbClient2 {

	public static void main(String[] args) {

		Connection con = null;
		java.sql.PreparedStatement st = null;
		//java.sql.Statement st1 = null;
		
		boolean stOpened = false; 
		boolean conOpened = false; 
	
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/qpick",	"ccit", "ccir");
			conOpened = true;
			
			st = con.prepareStatement("INSERT INTO USER_TABLE (USER_ID, USER_PASS, GENDAR) VALUES (?, ?, ?)");
			//st1 = con.createStatement();
			//st1.executeUpdate("INSERT INTO USER_TABLE (USER_ID, USER_PASS, GENDAR) VALUES ('KIM', 'passW@rd', 1)");

			
			int i = 1;
			
            st.setString(i++, "JUNG");
            st.setString(i++, "p@ssWord");
            st.setInt(i++, 1);

			int cnt = st.executeUpdate();
			stOpened = true;
			
            System.out.println("변경된 레코드 수:" + cnt);
            
            st.close();
            con.close();
            
            if (cnt == 0) throw new Exception("처리건수 없음");
            

		} catch (SQLException e) {
			if (conOpened){
				try {
					con.close();
				} catch (SQLException e1) { }
			}
			if (stOpened){
				try {
					st.close();
				} catch (SQLException e1) { }
			}

			e.printStackTrace();
			
		} catch (Exception e) {
			
		}

	}

}
