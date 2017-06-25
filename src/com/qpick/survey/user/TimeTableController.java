package com.qpick.survey.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

/**
 * Servlet implementation class TimeTableController
 */
@WebServlet("/TimeTableController")
public class TimeTableController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TimeTableController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameterValues("name")[0];
		TimeTableService timeTableService = new TimeTableService();
		TimeTable timeTable = timeTableService.getTimeTable(name);
		
		request.setAttribute("timeTable", timeTable); 
		
//		response.sendRedirect("DisplayTimeTable.jsp");
		RequestDispatcher view = request.getRequestDispatcher("DisplayTimeTable.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 페이지로 부터 넘어온 JSON 문자열을 읽는다.
		String json = RequestParser.getBody(request);

		// Lecture Class 로 전환한다 
		ObjectMapper mapper = new ObjectMapper();
		TypeContainer typeContainer = mapper.readValue(json, TypeContainer.class);
		List<Lecture> lectures = typeContainer.getLectures();
		
		// 로직 단위 서비스를 호출한다 .
		TimeTableService timeTableService = new TimeTableService();
		List<Lecture> resultLectures = timeTableService.getResults(lectures);
		
		// 서비스의 처리결과를 문자열로 바꾼다 
        //String jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(resultLectures);
        String jsonLectures = mapper.writeValueAsString(resultLectures);
        
		// JSON 문자열을 호출한 페이지로 리턴한다. 
		response.setContentType("application/json; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("{\"_message\": \"\"");
		out.println(",\t\"lectures\": " + jsonLectures);
		out.println("}");
        out.close();
        
	}
    

}
