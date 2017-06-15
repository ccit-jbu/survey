package com.qpick.survey.user;

public class Lecture {
	private String  name = "";
	private String  weekDay = "SUN";
	private Integer startTime = 0;
	private Integer endTime = 0;
	
	private String updateGu = "NONE";
	
	public Lecture() { }
	
	public Lecture(String name, String weekDay, Integer startTime, Integer endTime) {
		super();
		this.name = name;
		this.weekDay = weekDay;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWeekDay() {
		return weekDay;
	}
	public void setWeekDay(String weekDay) {
		this.weekDay = weekDay;
	}
	public Integer getStartTime() {
		return startTime;
	}
	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
	}
	public Integer getEndTime() {
		return endTime;
	}
	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
	}

	

	public String getUpdateGu() {
		return updateGu;
	}

	public void setUpdateGu(String updateGu) {
		this.updateGu = updateGu;
	}
      
      
}
