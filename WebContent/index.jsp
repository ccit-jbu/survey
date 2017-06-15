<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="kr.ac.joongboo.is.edu.cookie.PotatoChipCookie" %>

<%
   System.out.println("hi ......");
   out.println("hi ......");
   
   String name = "보경";
   out.println(request.getRequestURI());
   
   request.setAttribute("xxx", "yyy");
   
   PotatoChipCookie potatoChipCookie = new PotatoChipCookie("보경");
   request.setAttribute("qc", potatoChipCookie);
   
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   Hi !!!!  <%=name %> <%= request.getParameter("c") %> ${xxx} ${qc.name}

</body>
</html>