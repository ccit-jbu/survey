package com.qpick.survey.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;

public class TimeTableService  { 

	public TimeTable getTimeTable(String name){
		
		TimeTable timeTable = new TimeTable();
		timeTable.setStudent(name);
		
		LectureDao lectureDao = new LectureDao();
		
		Lecture paramLecture = new Lecture();
		paramLecture.setName("솔라리스");
		
		List<Lecture> lectures = lectureDao.getLectures(paramLecture);
		for ( Lecture lecture : lectures){
			timeTable.addLecture(lecture);
		}
		
		return timeTable;
	}
	
	public List<Lecture> getResults(List<Lecture> lectures){
		LectureDao lectureDao = new LectureDao();
		List<Lecture> results = new ArrayList<Lecture>();
		
		for (Lecture lecture : lectures){
			if ("SELECT".equalsIgnoreCase(lecture.getUpdateGu())){
				List<Lecture> result = lectureDao.getLectures(lecture);
				if (result != null){
					results.addAll(result);
				}
			}
			if ("INSERT".equalsIgnoreCase(lecture.getUpdateGu())){
				lectureDao.insertLecture(lecture);
				continue;
			}			
			if ("UPDATE".equalsIgnoreCase(lecture.getUpdateGu())){
				lectureDao.updateLecture(lecture);
				continue;
			}			
			if ("DELETE".equalsIgnoreCase(lecture.getUpdateGu())){
				lectureDao.deleteLecture(lecture);
				continue;
			}			
		}

		return results;
	}
}
