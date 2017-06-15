package kr.ac.joongboo.is.edu.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

import com.qpick.survey.user.User;;

public class DbcpClient {

	public static void main(String[] args) {

		Connection con = null;
		java.sql.PreparedStatement st = null;
		ResultSet rs = null;
		
		boolean stOpened = false; 
		boolean conOpened = false; 
		boolean rsOpened = false; 
	
		try {
			BasicDataSource ds = new BasicDataSource();

			ds.setDriverClassName("com.mysql.jdbc.Driver");
	        ds.setUrl("jdbc:mysql://localhost/qpick");
	        ds.setUsername("ccit");
	        ds.setPassword("ccir");

			con = ds.getConnection();

			conOpened = true;
			
			st = con.prepareStatement("SELECT USER_ID, USER_PASS, GENDAR FROM USER_TABLE WHERE USER_ID = ?");
			
			int i = 1;
            st.setString(i++, "KIM");
            
            rs = st.executeQuery();
			stOpened = true;
            rsOpened = true;
            
            // if(rs.next()){
            while(rs.next()){
            	User user = new User();
            	
            	user.setId(rs.getString("USER_ID"));
            	user.setPassword(rs.getString("USER_PASS"));
            	user.setGender(rs.getInt("GENDAR"));
            	
            	System.out.println(user.getId() + "," + user.getPassword() + "," + user.getGender());
            	
            	user = null;
            }

			
			rs.close();
            st.close();
            con.close();


		} catch (SQLException e) {
			if (rsOpened){
				try {
					rs.close();
				} catch (SQLException e1) { }
			}
			if (stOpened){
				try {
					st.close();
				} catch (SQLException e1) { }
			}
			if (conOpened){
				try {
					con.close();
				} catch (SQLException e1) { }
			}

			e.printStackTrace();
			
		} catch (Exception e) {
			
		}

	}

}
