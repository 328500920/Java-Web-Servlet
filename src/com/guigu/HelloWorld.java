package com.guigu;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

import javax.lang.model.element.Element;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloWorld implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		System.out.println("getServletConfig");
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		System.out.println("getServletInfo");
		return null;
	}

	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init");
		String susernameValue = servletConfig.getInitParameter("username");
		String spasswordValue =  servletConfig.getInitParameter("password");
		System.out.println("username value:"+susernameValue+" ,password value:"+spasswordValue);
		
		Enumeration<String> names=  servletConfig.getInitParameterNames();
		
		while(names.hasMoreElements()){
			String sConfigname1 = names.nextElement();
			String sConfigvalue1 = servletConfig.getInitParameter(sConfigname1);
			System.out.println("config name1:"+sConfigname1+" ,config value1:"+sConfigvalue1);
		}
		
		ServletContext servletContext = servletConfig.getServletContext();
		
		String sDriverValue = servletContext.getInitParameter("Driver");
		String sjdbcUrlValue = servletContext.getInitParameter("jdbcUrl");
		System.out.println("Context name :" + sDriverValue + " ,Context value:" +sjdbcUrlValue);
		
		Enumeration<String> contextEnum = servletContext.getInitParameterNames();
		while(contextEnum.hasMoreElements())
		{
			String sContextName1 = contextEnum.nextElement();
			String sContextValue1 = servletContext.getInitParameter(sContextName1);
			System.out.println("Context name :" + sContextName1 + " ,Context value:" +sContextValue1);			
		}
		
		String sRealPath = servletContext.getRealPath("/note.txt");
		System.out.println(sRealPath);
		
		String sContextPath = servletContext.getContextPath();
		System.out.println(sContextPath);
		
		ClassLoader classLoader = getClass().getClassLoader();
		
		try {
			InputStream is = classLoader.getResourceAsStream("catalina-ha.jar");
			System.out.println("1 :"+is);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			InputStream is2 = servletContext.getResourceAsStream("/WEB-INF/lib/catalina-ha.jar");
			System.out.println("2 :"+is2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		System.out.println("service");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println(" username:"+username +" ,password:"+password);
	}

}
