package com.qpick.survey.admin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbcp2.BasicDataSource;

import com.qpick.survey.user.Lecture;

public class BaseDao<T> {

	protected void update(String sql, List<T> objects, StatementSetter setter) {
		Connection con = null;
		java.sql.PreparedStatement st = null;
		//java.sql.Statement st1 = null;
		
		boolean stOpened = false; 
		boolean conOpened = false; 
	
		try {
			BasicDataSource ds = new BasicDataSource();
	
			ds.setDriverClassName("com.mysql.jdbc.Driver");
	        ds.setUrl("jdbc:mysql://localhost/qpick");
	        ds.setUsername("ccit");
	        ds.setPassword("ccir");
	
			con = ds.getConnection();
			conOpened = true;
			
			st = con.prepareStatement(sql);
	
			int cnt = 0;
			for (Object object : objects){
				setter.setPrameter(st, object);
				cnt += st.executeUpdate();
			}
			
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

	protected List<T> query(String sql, Object object, StatementSetter paramSetter, ResultSetter<T> resultSetter) {
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
			
			st = con.prepareStatement(sql);
			
			paramSetter.setPrameter(st, object);
	        
	        rs = st.executeQuery();
			stOpened = true;
	        rsOpened = true;
	        
	        List<T> listObject = resultSetter.getResults(rs);
			
			rs.close();
	        st.close();
	        con.close();
	
	        return listObject;
	        
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
		return null;
	}

}