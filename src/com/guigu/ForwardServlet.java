package com.guigu;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ForwardServlet
 */
@WebServlet(description = "重定向", urlPatterns = { "/forwardServlet" })
public class ForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ForwordServlet's doGet !!!");
		
		//设置属性值
		request.setAttribute("user","fuxingwang");
		
		//转发地址
		String sPath = "testServlet";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(sPath);
		
		//进行请求转发
		requestDispatcher.forward(request, response);
	}

}
