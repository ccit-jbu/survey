package com.qpick.survey.admin;

		
		
import java.sql.*;		
import java.util.*;		
		
public class SurveyPageDao extends BaseDao<SurveyPage> {		
	public List<SurveyPage> getLectures(SurveyPage surveyPage){	
		String sql = " SELECT SURVEYCODE, SURVEYNAME, SURVEYQUESTION, SURVEYITEM, SURVEYQUESTIONSEQ, SURVEYITEMSEQ, SURVEYUSERANSWER, SURVEYUSEROPINION, USERSURVEY, USERCODE, RESPONSEDATE, RESPONSETIME FROM SURVEYPAGE WHERE SURVEYCODE = ?  AND SURVEYQUESTIONSEQ = ?  AND SURVEYITEMSEQ = ?  AND SURVEYUSERANSWER = ?  AND USERCODE = ? ";
		
		List<SurveyPage> listSurveyPages = 
		query(sql , surveyPage, new StatementSetter(){
			
			 @Override
			 public void setPrameter(PreparedStatement st,  Object object)
			        throws SQLException {
			        SurveyPage surveyPage = (SurveyPage) object;
			        int i = 1;

			        st.setInt(i++, surveyPage.getSurveyCode());



			        st.setInt(i++, surveyPage.getSurveyQuestionSeq());
			        st.setInt(i++, surveyPage.getSurveyItemSeq());
			        st.setInt(i++, surveyPage.getSurveyUserAnswer());




			        st.setInt(i++, surveyPage.getUserCode());


			}

			
			
		} , new ResultSetter<SurveyPage>(){
			
			
			 @Override
			 public List<SurveyPage> getResults(ResultSet rs) 
			        throws SQLException {
			        List<SurveyPage> listSurveyPage =new ArrayList<SurveyPage>();
			        while(rs.next()){
			            SurveyPage surveyPage = new SurveyPage();
			            surveyPage.setSurveyCode(rs.getInt("SURVEYCODE"));
			            surveyPage.setSurveyName(rs.getString("SURVEYNAME"));
			            surveyPage.setSurveyQuestion(rs.getString("SURVEYQUESTION"));
			            surveyPage.setSurveyItem(rs.getString("SURVEYITEM"));
			            surveyPage.setSurveyQuestionSeq(rs.getInt("SURVEYQUESTIONSEQ"));
			            surveyPage.setSurveyItemSeq(rs.getInt("SURVEYITEMSEQ"));
			            surveyPage.setSurveyUserAnswer(rs.getInt("SURVEYUSERANSWER"));
			            surveyPage.setSurveyUserOpinion(rs.getString("SURVEYUSEROPINION"));


			            surveyPage.setUserSurvey(rs.getString("USERSURVEY"));
			            surveyPage.setUserCode(rs.getInt("USERCODE"));
			            surveyPage.setResponseDate(rs.getString("RESPONSEDATE"));
			            surveyPage.setResponseTime(rs.getString("RESPONSETIME"));


			            listSurveyPage.add(surveyPage); } 
			        return listSurveyPage;}

		});
		return listSurveyPages;
	}	
		
	public void insertSurveyPage(List<SurveyPage> surveyPages){	
		String sql = " INSERT INTO surveyPage ( SURVEYCODE, SURVEYNAME, SURVEYQUESTION, SURVEYITEM, SURVEYQUESTIONSEQ, SURVEYITEMSEQ, SURVEYUSERANSWER, SURVEYUSEROPINION, USERSURVEY, USERCODE, RESPONSEDATE, RESPONSETIME) VALUES (?,  ?,  ?,  ?,  ?,  ?,  ?,  ?,  ?,  ?,  ?,  ?)";
		update(sql, surveyPages , new StatementSetter(){
			 @Override
			 public void setPrameter(PreparedStatement st,  Object object)
			        throws SQLException {
			        SurveyPage surveyPage = (SurveyPage) object;
			        int i = 1;

			        st.setInt(i++, surveyPage.getSurveyCode());
			        st.setString(i++, surveyPage.getSurveyName());
			        st.setString(i++, surveyPage.getSurveyQuestion());
			        st.setString(i++, surveyPage.getSurveyItem());
			        st.setInt(i++, surveyPage.getSurveyQuestionSeq());
			        st.setInt(i++, surveyPage.getSurveyItemSeq());
			        st.setInt(i++, surveyPage.getSurveyUserAnswer());
			        st.setString(i++, surveyPage.getSurveyUserOpinion());


			        st.setString(i++, surveyPage.getUserSurvey());
			        st.setInt(i++, surveyPage.getUserCode());
			        st.setString(i++, surveyPage.getResponseDate());
			        st.setString(i++, surveyPage.getResponseTime());







			}

			
			
		});
	}	
		
	public void updateSurveyPage(List<SurveyPage> surveyPages){	
		String sql = "UPDATE SURVEYPAGE SET SURVEYCODE = ? , SURVEYNAME = ?, SURVEYQUESTION = ?, SURVEYITEM = ?, SURVEYQUESTIONSEQ = ?, SURVEYITEMSEQ = ?, SURVEYUSERANSWER = ?, SURVEYUSEROPINION = ?, USERSURVEY = ?, USERCODE = ?, RESPONSEDATE = ?, RESPONSETIME = ? WHERE SURVEYCODE = ?  AND SURVEYQUESTIONSEQ = ?  AND SURVEYITEMSEQ = ?  AND SURVEYUSERANSWER = ?  AND USERCODE = ? ";
		update(sql, surveyPages , new StatementSetter(){
			
			 @Override
			 public void setPrameter(PreparedStatement st,  Object object)
			        throws SQLException {
			        SurveyPage surveyPage = (SurveyPage) object;
			        int i = 1;
			        st.setInt(i++, surveyPage.getSurveyCode());
			        st.setString(i++, surveyPage.getSurveyName());
			        st.setInt(i++, surveyPage.getSurveyItemSeq());
			        st.setString(i++, surveyPage.getSurveyQuestion());
			        st.setString(i++, surveyPage.getSurveyItem());
			        st.setInt(i++, surveyPage.getSurveyQuestionSeq());
			        st.setInt(i++, surveyPage.getSurveyUserAnswer());
			        st.setString(i++, surveyPage.getUserSurvey());
			        st.setInt(i++, surveyPage.getUserCode());
			        st.setString(i++, surveyPage.getResponseDate());
			        st.setString(i++, surveyPage.getResponseTime());






			}

		});
	}	
		
	public void deleteSurveyPage(List<SurveyPage> surveyPages){	
		String sql = " DELETE FROM SURVEYPAGE WHERE SURVEYCODE = ?  AND SURVEYQUESTIONSEQ = ?  AND SURVEYITEMSEQ = ?  AND SURVEYUSERANSWER = ?  AND USERCODE = ? ";
		update(sql, surveyPages , new StatementSetter(){
			
			 @Override
			 public void setPrameter(PreparedStatement st,  Object object)
			        throws SQLException {
			        SurveyPage surveyPage = (SurveyPage) object;
			        int i = 1;

			        st.setInt(i++, surveyPage.getSurveyCode());
			        st.setInt(i++, surveyPage.getSurveyQuestionSeq());
			        st.setInt(i++, surveyPage.getSurveyItemSeq());
			        st.setInt(i++, surveyPage.getSurveyUserAnswer());
			        st.setInt(i++, surveyPage.getUserCode());
			
			}

		});
	}	
		
	public void insertSurveyPage(SurveyPage surveyPage){	
	    	List<SurveyPage> surveyPages = new ArrayList<SurveyPage>();
	    	surveyPages.add(surveyPage);
	    	
	    	insertSurveyPage(surveyPages);
	}	
		
	public void updateSurveyPage(SurveyPage surveyPage){	
	    	List<SurveyPage> surveyPages = new ArrayList<SurveyPage>();
	    	surveyPages.add(surveyPage);
	    	
	    	updateSurveyPage(surveyPages);
	}	
		
	public void deleteSurveyPage(SurveyPage surveyPage){	
	    	List<SurveyPage> surveyPages = new ArrayList<SurveyPage>();
	    	surveyPages.add(surveyPage);
	    	
	    	deleteSurveyPage(surveyPages);
	}	
		
}		
