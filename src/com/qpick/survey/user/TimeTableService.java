package com.qpick.survey.user;

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
}
