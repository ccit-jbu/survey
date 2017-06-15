package com.qpick.survey.user;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.qpick.survey.admin.BaseDao;
import com.qpick.survey.admin.ResultSetter;
import com.qpick.survey.admin.StatementSetter;

public class LectureDao extends BaseDao<Lecture> {

    public List<Lecture> getLectures(Lecture lecture){
    	
     	String sql = "SELECT STUDENT, WEEK_DAY, START_TIME, END_TIME FROM LECTURE_TABLE WHERE STUDENT = ?";
    	List<Lecture> listLecture = 
    		query(sql, lecture, new StatementSetter(){
						@Override
						public void setPrameter(PreparedStatement st,  Object object)
								throws SQLException {
							Lecture lecture = (Lecture) object;
							
							int i = 1;
							st.setString(i++, lecture.getName());
							
						}		
			}, 
	        new ResultSetter<Lecture>(){
				@Override
				public List<Lecture> getResults(ResultSet rs) throws SQLException {
					List<Lecture> listLecture =new ArrayList<Lecture>();
					
					// if(rs.next()){
					while(rs.next()){
						Lecture lecture = new Lecture();
						
						lecture.setName(rs.getString("STUDENT"));
						lecture.setWeekDay(rs.getString("WEEK_DAY"));
						lecture.setStartTime(rs.getInt("START_TIME"));
						lecture.setStartTime(rs.getInt("END_TIME"));
					   	
					   	listLecture.add(lecture);
					}
					return listLecture;
				}		
			});
   	 
        return listLecture;   	
    }

    public void insertLecture(List<Lecture> lectures){
    	
    	String sql = "INSERT INTO LECTURE_TABLE (STUDENT, WEEK_DAY, START_TIME, END_TIME) VALUES (?, ?, ?, ?)";
		update(sql, lectures, new StatementSetter(){
				@Override
				public void setPrameter(PreparedStatement st,  Object object)
						throws SQLException {
					Lecture lecture = (Lecture) object;
					
					int i = 1;
					st.setString(i++, lecture.getName());
					st.setString(i++, lecture.getWeekDay());
					st.setInt   (i++, lecture.getStartTime());
					st.setInt   (i++, lecture.getEndTime());		
					
				}		
		});
    }
        
    public void updateLecture(List<Lecture> lectures){
    	
    	String sql = "UPDATE LECTURE_TABLE SET WEEK_DAY = ?, START_TIME = ?, END_TIME = ? WHERE STUDENT = ?";
		update(sql, lectures, new StatementSetter(){
			@Override
			public void setPrameter(PreparedStatement st,  Object object)
					throws SQLException {
				Lecture lecture = (Lecture) object;
				
				int i = 1;
	            st.setString(i++, lecture.getWeekDay());
	            st.setInt(i++, lecture.getStartTime());
	            st.setInt(i++, lecture.getEndTime());
	            st.setString(i++, lecture.getName());
				
			}		
		});
    	
    }
    
    public void deleteLecture(List<Lecture> lectures){
    	
    	String sql = "DEKETE FROM  LECTURE_TABLE WHERE STUDENT = ?";
    	
		update(sql, lectures, new StatementSetter(){
			@Override
			public void setPrameter(PreparedStatement st,  Object object)
					throws SQLException {
				Lecture lecture = (Lecture) object;
				
				int i = 1;
	            st.setString(i++, lecture.getName());
				
			}		
		});
    }
    
    // 여기서 부터는 낱개 추가
    public void insertLecture(Lecture lecture){
    	List<Lecture> lectures = new ArrayList<Lecture>();
    	lectures.add(lecture);
    	
    	insertLecture(lectures);
    }
    
    public void updateLecture(Lecture lecture){
    	List<Lecture> lectures = new ArrayList<Lecture>();
    	lectures.add(lecture);
    	
    	updateLecture(lectures);
    }

    public void deleteLecture(Lecture lecture){
    	List<Lecture> lectures = new ArrayList<Lecture>();
    	lectures.add(lecture);
    	
    	deleteLecture(lectures);
    }

}
