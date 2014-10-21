package com.guigu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class Login implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
			
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); 
		
		String username = request.getParameter("user");
		String password = request.getParameter("password");
		
		System.out.println(username + " ," + password);
		
		System.out.println("1 ----------------------------------------------------" );
		//System.out.println(request);
		//System.out.println(response);
		
		/*String[] sInsterestings = request.getParameterValues("insteresting");
		
		for(String sInsteresting:sInsterestings)
			System.out.println("-->" + sInsteresting );*/
		
		System.out.println("2 ----------------------------------------------------" );
		
		Enumeration<String> names = request.getParameterNames();
		while(names.hasMoreElements())
		{
			String sname = names.nextElement();
			String svalue = request.getParameter(sname);
			System.out.println(sname + " ," + svalue);
		}
		
		System.out.println("3 ----------------------------------------------------" );
	
		Map<String,String[]> maps = request.getParameterMap();
		for(Map.Entry<String, String[]> entry: maps.entrySet())
		{
			System.out.println(entry.getKey() + " ," + Arrays.asList(entry.getValue()));
		}
		
		System.out.println("4 ----------------------------------------------------" );
		
		HttpServletRequest httpRequest = (HttpServletRequest)request;
		
		String requestURI = httpRequest.getRequestURI();
		System.out.println(requestURI);
		
		String method = httpRequest.getMethod();
		System.out.println(method);
		
		String queryString = httpRequest.getQueryString();
		System.out.println(queryString);
		
		String ServletPath = httpRequest.getServletPath();
		System.out.println(ServletPath);
		
		//response.setContentType("application/msword");
		
		PrintWriter pw = response.getWriter();
		pw.write("Login sucess ,welcome " + username);
	}

}
