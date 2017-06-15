<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.qpick.survey.user.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    ${timeTable.student}
	<table>
		<c:forEach items="${timeTable.listLecture}" var="lecture">
			<tr>
				<td>${lecture.name}</td>
				<td>${lecture.startTime}</td>
				<td>${lecture.endTime}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>