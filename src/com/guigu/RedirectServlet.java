package com.guigu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class redirectServlet
 */
@WebServlet("/redirectServlet")
public class RedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("redirectServlet's doGet !!!");
		
		//设置属性值
		request.setAttribute("user","fuxingwang");
		
		String sPath = "testServlet";
		//执行请求重定向		forword 是转发，redirect是重定向 不一样。
		response.sendRedirect(sPath);
	}

}
