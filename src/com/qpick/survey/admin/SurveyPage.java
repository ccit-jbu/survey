package com.qpick.survey.admin;
import java.sql.*;
import java.util.*;

public class SurveyPage{	
	

	private String updateGu = "NONE";
	private Integer surveyCode= 0;
	private String surveyName= "";
	private String surveyQuestion= "";
	private String surveyItem= "";
	private Integer surveyQuestionSeq= 0;
	private Integer surveyItemSeq= 0;
	private Integer surveyUserAnswer= 0;
	private String surveyUserOpinion= "";	
	private String userSurvey= "";
	private Integer userCode= 0;
	private String responseDate= "";
	private String responseTime= "";
	
	
	
	public String getUpdateGu() {
		return updateGu;
	}
	public void setUpdateGu(String updateGu) {
		this.updateGu = updateGu;
	}
	public Integer getSurveyCode() {
		return surveyCode;
	}
	public void setSurveyCode(Integer surveyCode) {
		this.surveyCode = surveyCode;
	}
	public String getSurveyName() {
		return surveyName;
	}
	public void setSurveyName(String surveyName) {
		this.surveyName = surveyName;
	}
	public String getSurveyQuestion() {
		return surveyQuestion;
	}
	public void setSurveyQuestion(String surveyQuestion) {
		this.surveyQuestion = surveyQuestion;
	}
	public String getSurveyItem() {
		return surveyItem;
	}
	public void setSurveyItem(String surveyItem) {
		this.surveyItem = surveyItem;
	}
	public Integer getSurveyQuestionSeq() {
		return surveyQuestionSeq;
	}
	public void setSurveyQuestionSeq(Integer surveyQuestionSeq) {
		this.surveyQuestionSeq = surveyQuestionSeq;
	}
	public Integer getSurveyItemSeq() {
		return surveyItemSeq;
	}
	public void setSurveyItemSeq(Integer surveyItemSeq) {
		this.surveyItemSeq = surveyItemSeq;
	}
	public Integer getSurveyUserAnswer() {
		return surveyUserAnswer;
	}
	public void setSurveyUserAnswer(Integer surveyUserAnswer) {
		this.surveyUserAnswer = surveyUserAnswer;
	}
	public String getSurveyUserOpinion() {
		return surveyUserOpinion;
	}
	public void setSurveyUserOpinion(String surveyUserOpinion) {
		this.surveyUserOpinion = surveyUserOpinion;
	}
	public String getUserSurvey() {
		return userSurvey;
	}
	public void setUserSurvey(String userSurvey) {
		this.userSurvey = userSurvey;
	}
	public Integer getUserCode() {
		return userCode;
	}
	public void setUserCode(Integer userCode) {
		this.userCode = userCode;
	}
	public String getResponseDate() {
		return responseDate;
	}
	public void setResponseDate(String responseDate) {
		this.responseDate = responseDate;
	}
	public String getResponseTime() {
		return responseTime;
	}
	public void setResponseTime(String responseTime) {
		this.responseTime = responseTime;
	}	
	
}	
