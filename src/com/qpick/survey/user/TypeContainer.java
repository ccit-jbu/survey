package com.qpick.survey.user;

import java.util.ArrayList;
import java.util.List;

import com.qpick.survey.admin.DonateRequest;
import com.qpick.survey.admin.DonateStatePage;
import com.qpick.survey.admin.LeftMenu;
import com.qpick.survey.admin.PersonalInfomation;
import com.qpick.survey.admin.QustionStatesChart;
import com.qpick.survey.admin.StatesChartPage;
import com.qpick.survey.admin.SurveyPage;

public class TypeContainer {
	List<Lecture> lectures = null;

	public List<Lecture> getLectures() {
		return lectures;
	}

	public void setLectures(List<Lecture> lectures) {
		this.lectures = lectures;
	}
	
	// 클래스가 추가죌 때마다 위코드 추가해줄것 
	
	List<SurveyPage> surveyPage = null;
	List<StatesChartPage> statesChartPage = null;
	List<QustionStatesChart> qustionStatesChart = null;
	List<PersonalInfomation> personalInfomation = null;
	List<LeftMenu> leftMenu = null;
	List<DonateStatePage> donateStatePage = null;
	List<DonateRequest> donateReqeust = null;

	public List<SurveyPage> getSurveyPage() {
		return surveyPage;
	}

	public void setSurveyPage(List<SurveyPage> surveyPage) {
		this.surveyPage = surveyPage;
	}

	public List<StatesChartPage> getStatesChartPage() {
		return statesChartPage;
	}

	public void setStatesChartPage(List<StatesChartPage> statesChartPage) {
		this.statesChartPage = statesChartPage;
	}

	public List<QustionStatesChart> getQustionStatesChart() {
		return qustionStatesChart;
	}

	public void setQustionStatesChart(List<QustionStatesChart> qustionStatesChart) {
		this.qustionStatesChart = qustionStatesChart;
	}

	public List<PersonalInfomation> getPersonalInfomation() {
		return personalInfomation;
	}

	public void setPersonalInfomation(List<PersonalInfomation> personalInfomation) {
		this.personalInfomation = personalInfomation;
	}

	public List<LeftMenu> getLeftMenu() {
		return leftMenu;
	}

	public void setLeftMenu(List<LeftMenu> leftMenu) {
		this.leftMenu = leftMenu;
	}

	public List<DonateStatePage> getDonateStatePage() {
		return donateStatePage;
	}

	public void setDonateStatePage(List<DonateStatePage> donateStatePage) {
		this.donateStatePage = donateStatePage;
	}

	public List<DonateRequest> getDonateReqeust() {
		return donateReqeust;
	}

	public void setDonateReqeust(List<DonateRequest> donateReqeust) {
		this.donateReqeust = donateReqeust;
	}

	
}
