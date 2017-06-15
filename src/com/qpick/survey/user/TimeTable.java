package com.qpick.survey.user;

import java.util.ArrayList;
import java.util.List;

public class TimeTable {
    private String student = "";
    private List<Lecture> listLecture = new ArrayList<Lecture>();
    
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		this.student = student;
	}
	public List<Lecture> getListLecture() {
		return listLecture;
	}
	public void setListLecture(List<Lecture> listLecture) {
		this.listLecture = listLecture;
	}
	
	public void addLecture(Lecture lecture){
		listLecture.add(lecture);
	}
}
