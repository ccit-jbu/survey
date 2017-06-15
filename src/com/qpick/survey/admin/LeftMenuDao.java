package com.qpick.survey.admin;		
		
import java.sql.*;		
import java.util.*;	

import com.qpick.survey.admin.*;		
		
public class LeftMenuDao  extends BaseDao<LeftMenu> {		
	public List<LeftMenu> getLectures(LeftMenu leftMenu){	
		String sql = " SELECT LEFTMENUDIVISION, LEFTMENULARGEGROUP, LEFTMENUMIDDLEGROUP, LEFTMENUSMALLGROUP, LEFTMENUDIVISIONCODE, LEFTMENULARGEGROUPCODE, LEFTMENUMIDDLEGROUPCODE, LEFTMENUSMALLGROUPCODE FROM LEFTMENU WHERE LEFTMENUDIVISIONCODE = ?  AND LEFTMENULARGEGROUPCODE = ?  AND LEFTMENUMIDDLEGROUPCODE = ?  AND LEFTMENUSMALLGROUPCODE = ? ";
		
		List<LeftMenu> listLeftMenus = 
		query(sql , leftMenu, 
		new StatementSetter(){
			 @Override
			 public void setPrameter(PreparedStatement st,  Object object)
			        throws SQLException {
			        LeftMenu leftMenu = (LeftMenu) object;
			        int i = 1;

			        st.setInt(i++, leftMenu.getLeftMenuDivisionCode());
			        st.setInt(i++, leftMenu.getLeftMenuLargeGroupCode());
			        st.setInt(i++, leftMenu.getLeftMenuMiddleGroupCode());
			        st.setInt(i++, leftMenu.getLeftMenuSmallGroupCode());

			}

			
		} , 
		
		
		new ResultSetter<LeftMenu>(){
			
			 @Override
			 public List<LeftMenu> getResults(ResultSet rs) 
			        throws SQLException {
			        List<LeftMenu> listLeftMenu =new ArrayList<LeftMenu>();
			        while(rs.next()){
			            LeftMenu leftMenu = new LeftMenu();
			            leftMenu.setLeftMenuDivision(rs.getString("LEFTMENUDIVISION"));
			            leftMenu.setLeftMenuLargeGroup(rs.getString("LEFTMENULARGEGROUP"));
			            leftMenu.setLeftMenuMiddleGroup(rs.getString("LEFTMENUMIDDLEGROUP"));
			            leftMenu.setLeftMenuSmallGroup(rs.getString("LEFTMENUSMALLGROUP"));
			            leftMenu.setLeftMenuDivisionCode(rs.getInt("LEFTMENUDIVISIONCODE"));
			            leftMenu.setLeftMenuLargeGroupCode(rs.getInt("LEFTMENULARGEGROUPCODE"));
			            leftMenu.setLeftMenuMiddleGroupCode(rs.getInt("LEFTMENUMIDDLEGROUPCODE"));
			            leftMenu.setLeftMenuSmallGroupCode(rs.getInt("LEFTMENUSMALLGROUPCODE"));

			            listLeftMenu.add(leftMenu); } 
			        return listLeftMenu;}
			 
			 
			 
		});
		return listLeftMenus;
	}	
	
	public void insertLeftMenu(List<LeftMenu> leftMenus){	
		String sql = " INSERT INTO leftMenu ( LEFTMENUDIVISION, LEFTMENULARGEGROUP, LEFTMENUMIDDLEGROUP, LEFTMENUSMALLGROUP, LEFTMENUDIVISIONCODE, LEFTMENULARGEGROUPCODE, LEFTMENUMIDDLEGROUPCODE, LEFTMENUSMALLGROUPCODE) VALUES (?,  ?,  ?,  ?,  ?,  ?,  ?,  ?)";
		update(sql, leftMenus , new StatementSetter(){

			@Override
			public void setPrameter(PreparedStatement st, Object object)
					throws SQLException {
		        LeftMenu leftMenu = (LeftMenu) object;
		        
		        int i = 1;

		        st.setString(i++, leftMenu.getLeftMenuDivision());
		        st.setString(i++, leftMenu.getLeftMenuLargeGroup());
		        st.setString(i++, leftMenu.getLeftMenuMiddleGroup());
		        st.setString(i++, leftMenu.getLeftMenuSmallGroup());
		        st.setInt(i++, leftMenu.getLeftMenuDivisionCode());
		        st.setInt(i++, leftMenu.getLeftMenuLargeGroupCode());
		        st.setInt(i++, leftMenu.getLeftMenuMiddleGroupCode());
		        st.setInt(i++, leftMenu.getLeftMenuSmallGroupCode());
			}
		});
	}	
		
	public void updateLeftMenu(List<LeftMenu> leftMenus){	
		String sql = "UPDATE LEFTMENU SET LEFTMENUDIVISION = ? , LEFTMENULARGEGROUP = ?, LEFTMENUMIDDLEGROUP = ?, LEFTMENUSMALLGROUP = ?, LEFTMENUDIVISIONCODE = ?, LEFTMENULARGEGROUPCODE = ?, LEFTMENUMIDDLEGROUPCODE = ?, LEFTMENUSMALLGROUPCODE = ? WHERE LEFTMENUDIVISIONCODE = ?  AND LEFTMENULARGEGROUPCODE = ?  AND LEFTMENUMIDDLEGROUPCODE = ?  AND LEFTMENUSMALLGROUPCODE = ? ";
		update(sql, leftMenus , new StatementSetter(){
			
			 @Override
			 public void setPrameter(PreparedStatement st,  Object object)
			        throws SQLException {
			        LeftMenu leftMenu = (LeftMenu) object;
			        int i = 1;

			        st.setString(i++, leftMenu.getLeftMenuDivision());
			        st.setString(i++, leftMenu.getLeftMenuLargeGroup());
			        st.setString(i++, leftMenu.getLeftMenuMiddleGroup());
			        st.setString(i++, leftMenu.getLeftMenuSmallGroup());
			        st.setInt(i++, leftMenu.getLeftMenuDivisionCode());
			        st.setInt(i++, leftMenu.getLeftMenuLargeGroupCode());
			        st.setInt(i++, leftMenu.getLeftMenuMiddleGroupCode());
			        st.setInt(i++, leftMenu.getLeftMenuSmallGroupCode());

			        st.setInt(i++, leftMenu.getLeftMenuDivisionCode());
			        st.setInt(i++, leftMenu.getLeftMenuLargeGroupCode());
			        st.setInt(i++, leftMenu.getLeftMenuMiddleGroupCode());
			        st.setInt(i++, leftMenu.getLeftMenuSmallGroupCode());
			}
		});
	}	
		
	public void deleteLeftMenu(List<LeftMenu> leftMenus){	
		String sql = " DELETE FROM LEFTMENU WHERE LEFTMENUDIVISIONCODE = ?  AND LEFTMENULARGEGROUPCODE = ?  AND LEFTMENUMIDDLEGROUPCODE = ?  AND LEFTMENUSMALLGROUPCODE = ? ";
		update(sql, leftMenus , new StatementSetter(){
			 @Override
			 public void setPrameter(PreparedStatement st,  Object object)
			        throws SQLException {
			        LeftMenu leftMenu = (LeftMenu) object;
			        int i = 1;

			        st.setInt(i++, leftMenu.getLeftMenuDivisionCode());
			        st.setInt(i++, leftMenu.getLeftMenuLargeGroupCode());
			        st.setInt(i++, leftMenu.getLeftMenuMiddleGroupCode());
			        st.setInt(i++, leftMenu.getLeftMenuSmallGroupCode());
			}			
		});
	}	
	
	public void insertLeftMenu(LeftMenu leftMenu){	
		List<LeftMenu> leftMenus = new ArrayList<LeftMenu>();
		leftMenus.add(leftMenu);

		insertLeftMenu(leftMenus);
	}	

	public void updateLeftMenu(LeftMenu leftMenu){	
		List<LeftMenu> leftMenus = new ArrayList<LeftMenu>();
		leftMenus.add(leftMenu);

		updateLeftMenu(leftMenus);
	}	

	public void deleteLeftMenu(LeftMenu leftMenu){	
		List<LeftMenu> leftMenus = new ArrayList<LeftMenu>();
		leftMenus.add(leftMenu);

		deleteLeftMenu(leftMenus);
	}	
	
}		
