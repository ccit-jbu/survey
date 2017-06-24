package com.qpick.survey.admin;


import java.sql.*;		
import java.util.*;		

public class QustionStatesChartDao extends BaseDao<QustionStatesChart> {		
	public List<QustionStatesChart> getLectures(QustionStatesChart qustionStatesChart){	
		String sql = " SELECT USERSURVEY, QUESTIONSEQ, SURVEYITEMSEQ, SURVEYITEMRESPONSEUSER FROM QUSTIONSTATESCHART WHERE QUESTIONSEQ = ? ";
		
		List<QustionStatesChart> listQustionStatesCharts = 
		query(sql , qustionStatesChart, new StatementSetter(){ @Override
			 public void setPrameter(PreparedStatement st,  Object object)
				        throws SQLException {
				        QustionStatesChart qustionStatesChart = (QustionStatesChart) object;
				        int i = 1;


				        st.setInt(i++, qustionStatesChart.getQuestionSeq());
				}
} , new ResultSetter<QustionStatesChart>(){ @Override
	 public List<QustionStatesChart> getResults(ResultSet rs) 
		        throws SQLException {
		        List<QustionStatesChart> listQustionStatesChart =new ArrayList<QustionStatesChart>();
		        while(rs.next()){
		            QustionStatesChart qustionStatesChart = new QustionStatesChart();
		            qustionStatesChart.setUserSurvey(rs.getString("USERSURVEY"));
		            qustionStatesChart.setQuestionSeq(rs.getInt("QUESTIONSEQ"));
		            qustionStatesChart.setSurveyItemSeq(rs.getInt("SURVEYITEMSEQ"));
		            qustionStatesChart.setSurveyItemResponseUser(rs.getInt("SURVEYITEMRESPONSEUSER"));

		            listQustionStatesChart.add(qustionStatesChart); } 
		        return listQustionStatesChart;}
});
		return listQustionStatesCharts;
	}	
		
	public void insertQustionStatesChart(List<QustionStatesChart> qustionStatesCharts){	
		String sql = " INSERT INTO qustionStatesChart ( USERSURVEY, QUESTIONSEQ, SURVEYITEMSEQ, SURVEYITEMRESPONSEUSER) VALUES (?,  ?,  ?,  ?)";
		update(sql, qustionStatesCharts , new StatementSetter(){
			 @Override
			 public void setPrameter(PreparedStatement st,  Object object)
			        throws SQLException {
			        QustionStatesChart qustionStatesChart = (QustionStatesChart) object;
			        int i = 1;

			        st.setString(i++, qustionStatesChart.getUserSurvey());
			        st.setInt(i++, qustionStatesChart.getQuestionSeq());
			        st.setInt(i++, qustionStatesChart.getSurveyItemSeq());
			        st.setInt(i++, qustionStatesChart.getSurveyItemResponseUser());




			}

		});
	}	
		
	public void updateQustionStatesChart(List<QustionStatesChart> qustionStatesCharts){	
		String sql = "UPDATE QUSTIONSTATESCHART SET USERSURVEY = ? , QUESTIONSEQ = ?, SURVEYITEMSEQ = ?, SURVEYITEMRESPONSEUSER = ? WHERE QUESTIONSEQ = ? ";
		update(sql, qustionStatesCharts , new StatementSetter(){
			 @Override
			 public void setPrameter(PreparedStatement st,  Object object)
			        throws SQLException {
			        QustionStatesChart qustionStatesChart = (QustionStatesChart) object;
			        int i = 1;

			        st.setString(i++, qustionStatesChart.getUserSurvey());
			        st.setInt(i++, qustionStatesChart.getQuestionSeq());
			        st.setInt(i++, qustionStatesChart.getSurveyItemSeq());
			        st.setInt(i++, qustionStatesChart.getSurveyItemResponseUser());
			        st.setInt(i++, qustionStatesChart.getQuestionSeq());


			}

		});
	}	
		
	public void deleteQustionStatesChart(List<QustionStatesChart> qustionStatesCharts){	
		String sql = " DELETE FROM QUSTIONSTATESCHART WHERE QUESTIONSEQ = ? ";
		update(sql, qustionStatesCharts , new StatementSetter(){
			 @Override
			 public void setPrameter(PreparedStatement st,  Object object)
			        throws SQLException {
			        QustionStatesChart qustionStatesChart = (QustionStatesChart) object;
			        int i = 1;

		
			        st.setInt(i++, qustionStatesChart.getQuestionSeq());
		




			}

		});
	}	
		
	public void insertQustionStatesChart(QustionStatesChart qustionStatesChart){	
	    	List<QustionStatesChart> qustionStatesCharts = new ArrayList<QustionStatesChart>();
	    	qustionStatesCharts.add(qustionStatesChart);
	    	
	    	insertQustionStatesChart(qustionStatesCharts);
	}	
		
	public void updateQustionStatesChart(QustionStatesChart qustionStatesChart){	
	    	List<QustionStatesChart> qustionStatesCharts = new ArrayList<QustionStatesChart>();
	    	qustionStatesCharts.add(qustionStatesChart);
	    	
	    	updateQustionStatesChart(qustionStatesCharts);
	}	
		
	public void deleteQustionStatesChart(QustionStatesChart qustionStatesChart){	
	    	List<QustionStatesChart> qustionStatesCharts = new ArrayList<QustionStatesChart>();
	    	qustionStatesCharts.add(qustionStatesChart);
	    	
	    	deleteQustionStatesChart(qustionStatesCharts);
	}	
		
}		
