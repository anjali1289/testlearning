package com.java.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.dao.StudentInfoDao;
import com.java.entity.StudentInfo;

/**
 * Servlet implementation class StudentInfoServlet
 */
@WebServlet("/StudentInfoServlet")
public class StudentInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name=request.getParameter("name");
	int enroll = Integer.parseInt(request.getParameter("enrol"));
	String branch = request.getParameter("branch");
	int studentNo = Integer.parseInt(request.getParameter("marks"));
	
	StudentInfo s= new StudentInfo(name,enroll,branch,studentNo);
	StudentInfoDao d= new StudentInfoDao();
	if(d.inserValue(s)==true) {
		RequestDispatcher rs= request.getRequestDispatcher("index.jsp");
		rs.include(request, response);
	}
	else {
		RequestDispatcher rs= request.getRequestDispatcher("register.jsp");
		rs.forward(request, response);
	}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
