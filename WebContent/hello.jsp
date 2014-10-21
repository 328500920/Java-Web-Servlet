<%@page import="org.apache.catalina.Session"%>
<%@ page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		System.out.println("-----------------------------------------------");
		Date date = new Date();
		System.out.println("current time:"+date);
	%>
	
	<%
		System.out.println("-----------------------------------------------");
		String name = request.getParameter("user");
		String password = request.getParameter("password");
		System.out.println(name +" ,"+ password);
	%>
	
	<%
		System.out.println("-----------------------------------------------");
		ServletRequest req = pageContext.getRequest();		
		System.out.println(req == request);
	%>
	
	<%
		System.out.println("-----------------------------------------------");
		System.out.println(session.getId());
	%>
	
	<%
		System.out.println("-----------------------------------------------");
		System.out.println(application.getInitParameter("Driver"));
		System.out.println(config.getInitParameter("friend"));
	%>
	
	<%
		System.out.println("-----------------------------------------------");
		out.println(request.getParameter("user"));
		out.println("<br>");
		out.println(request.getParameter("password"));
	%>
</body>
</html>