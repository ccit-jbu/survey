package com.qpick.survey.admin;

import java.sql.*;		
import java.util.*;		
import com.qpick.survey.admin.*;		
		
public class StatesChartPageDao extends BaseDao<StatesChartPage> {		
	public List<StatesChartPage> getLectures(StatesChartPage statesChartPage){	
		String sql = " SELECT SURVEYCODE, SURVEYNAME, SURVEYCREATEDDATE, SURVEYSTARTEDDATE, SURVEYCLOSEDDATE, SURVEYRESPONSEUSER, SURVEYTARGETRESPONSEUSER, SURVEYSTATUS, SURVEYRESULT FROM STATESCHARTPAGE WHERE SURVEYCODE = ?  AND SURVEYSTARTEDDATE = ? ";
		
		List<StatesChartPage> listStatesChartPages = 
		query(sql , statesChartPage, new StatementSetter(){
			 @Override
			 public void setPrameter(PreparedStatement st,  Object object)
			        throws SQLException {
			        StatesChartPage statesChartPage = (StatesChartPage) object;
			        int i = 1;

			        st.setInt(i++, statesChartPage.getSurveyCode());


			        st.setString(i++, statesChartPage.getSurveyStartedDate());

			}

		} , new ResultSetter<StatesChartPage>(){
			 @Override
			 public List<StatesChartPage> getResults(ResultSet rs) 
			        throws SQLException {
			        List<StatesChartPage> listStatesChartPage =new ArrayList<StatesChartPage>();
			        while(rs.next()){
			            StatesChartPage statesChartPage = new StatesChartPage();
			            statesChartPage.setSurveyCode(rs.getInt("SURVEYCODE"));
			            statesChartPage.setSurveyName(rs.getString("SURVEYNAME"));
			            statesChartPage.setSurveyCreatedDate(rs.getString("SURVEYCREATEDDATE"));
			            statesChartPage.setSurveyStartedDate(rs.getString("SURVEYSTARTEDDATE"));
			            statesChartPage.setSurveyClosedDate(rs.getString("SURVEYCLOSEDDATE"));
			            statesChartPage.setSurveyResponseUser(rs.getInt("SURVEYRESPONSEUSER"));
			            statesChartPage.setSurveyTargetResponseUser(rs.getInt("SURVEYTARGETRESPONSEUSER"));
			            statesChartPage.setSurveyStatus(rs.getInt("SURVEYSTATUS"));
			            statesChartPage.setSurveyResult(rs.getInt("SURVEYRESULT"));



			            listStatesChartPage.add(statesChartPage); } 
			        return listStatesChartPage;}

		});
		return listStatesChartPages;
	}	
		
	public void insertStatesChartPage(List<StatesChartPage> statesChartPages){	
		String sql = " INSERT INTO statesChartPage ( SURVEYCODE, SURVEYNAME, SURVEYCREATEDDATE, SURVEYSTARTEDDATE, SURVEYCLOSEDDATE, SURVEYRESPONSEUSER, SURVEYTARGETRESPONSEUSER, SURVEYSTATUS, SURVEYRESULT) VALUES (?,  ?,  ?,  ?,  ?,  ?,  ?,  ?,  ?)";
		update(sql, statesChartPages , new StatementSetter(){
			 @Override
			 public void setPrameter(PreparedStatement st,  Object object)
			        throws SQLException {
			        StatesChartPage statesChartPage = (StatesChartPage) object;
			        int i = 1;

			        st.setInt(i++, statesChartPage.getSurveyCode());
			        st.setString(i++, statesChartPage.getSurveyName());
			        st.setString(i++, statesChartPage.getSurveyCreatedDate());
			        st.setString(i++, statesChartPage.getSurveyStartedDate());
			        st.setString(i++, statesChartPage.getSurveyClosedDate());
			        st.setInt(i++, statesChartPage.getSurveyResponseUser());
			        st.setInt(i++, statesChartPage.getSurveyTargetResponseUser());
			        st.setInt(i++, statesChartPage.getSurveyStatus());
			        st.setInt(i++, statesChartPage.getSurveyResult());

			}

		});
	}	
		
	public void updateStatesChartPage(List<StatesChartPage> statesChartPages){	
		String sql = "UPDATE STATESCHARTPAGE SET SURVEYCODE = ? , SURVEYNAME = ?, SURVEYCREATEDDATE = ?, SURVEYSTARTEDDATE = ?, SURVEYCLOSEDDATE = ?, SURVEYRESPONSEUSER = ?, SURVEYTARGETRESPONSEUSER = ?, SURVEYSTATUS = ?, SURVEYRESULT = ? WHERE SURVEYCODE = ?  AND SURVEYSTARTEDDATE = ? ";
		update(sql, statesChartPages , new StatementSetter(){
			 @Override
			 public void setPrameter(PreparedStatement st,  Object object)
			        throws SQLException {
			        StatesChartPage statesChartPage = (StatesChartPage) object;
			        int i = 1;

			        st.setInt(i++, statesChartPage.getSurveyCode());
			        st.setString(i++, statesChartPage.getSurveyName());
			        st.setString(i++, statesChartPage.getSurveyCreatedDate());
			        st.setString(i++, statesChartPage.getSurveyStartedDate());
			        st.setString(i++, statesChartPage.getSurveyClosedDate());
			        st.setInt(i++, statesChartPage.getSurveyResponseUser());
			        st.setInt(i++, statesChartPage.getSurveyTargetResponseUser());
			        st.setInt(i++, statesChartPage.getSurveyStatus());
			        st.setInt(i++, statesChartPage.getSurveyResult());
			        st.setInt(i++, statesChartPage.getSurveyCode());
			        st.setString(i++, statesChartPage.getSurveyStartedDate());
			}

		});
	}	
		
	public void deleteStatesChartPage(List<StatesChartPage> statesChartPages){	
		String sql = " DELETE FROM STATESCHARTPAGE WHERE SURVEYCODE = ?  AND SURVEYSTARTEDDATE = ? ";
		update(sql, statesChartPages , new StatementSetter(){
			 @Override
			 public void setPrameter(PreparedStatement st,  Object object)
			        throws SQLException {
			        StatesChartPage statesChartPage = (StatesChartPage) object;
			        int i = 1;

			        st.setInt(i++, statesChartPage.getSurveyCode());
			        st.setString(i++, statesChartPage.getSurveyStartedDate());
			      
			}

		});
	}	
		
	public void insertStatesChartPage(StatesChartPage statesChartPage){	
	    	List<StatesChartPage> statesChartPages = new ArrayList<StatesChartPage>();
	    	statesChartPages.add(statesChartPage);
	    	
	    	insertStatesChartPage(statesChartPages);
	}	
		
	public void updateStatesChartPage(StatesChartPage statesChartPage){	
	    	List<StatesChartPage> statesChartPages = new ArrayList<StatesChartPage>();
	    	statesChartPages.add(statesChartPage);
	    	
	    	updateStatesChartPage(statesChartPages);
	}	
		
	public void deleteStatesChartPage(StatesChartPage statesChartPage){	
	    	List<StatesChartPage> statesChartPages = new ArrayList<StatesChartPage>();
	    	statesChartPages.add(statesChartPage);
	    	
	    	deleteStatesChartPage(statesChartPages);
	}	
		
}		
