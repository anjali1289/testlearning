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
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id =Integer.parseInt( request.getParameter("id"));
	String name= request.getParameter("name");
	int enroll=Integer.parseInt(request.getParameter("enroll"));
	String branch =request.getParameter("branch");
	int no =Integer.parseInt( request.getParameter("studentNo"));
	StudentInfo s= new StudentInfo(id,name,enroll,branch,no);
	StudentInfoDao d= new StudentInfoDao();
	if(d.getUpdate(s)==true) {
		RequestDispatcher rs =request.getRequestDispatcher("FindServlet");
		rs.include(request, response);
	}
	else{
		RequestDispatcher rs =request.getRequestDispatcher("update.jsp");
		rs.include(request, response);
	}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
