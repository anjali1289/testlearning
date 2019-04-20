package com.java.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.dao.StudentInfoDao;
import com.java.entity.StudentInfo;

/**
 * Servlet implementation class Studentloginservlet
 */
@WebServlet("/Studentloginservlet")
public class Studentloginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Studentloginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name =request.getParameter("user");
		System.out.println(name);
		int pass = Integer.parseInt(request.getParameter("pass"));
		HttpSession session = request.getSession();
		StudentInfo s= StudentInfoDao.loginStudent(name, pass);
		session.setAttribute("q", s);
		
	if(s!=null) {
		RequestDispatcher rs= request.getRequestDispatcher("welcome.jsp");
		rs.include(request, response);
	}
	else {
		RequestDispatcher rs= request.getRequestDispatcher("register.jsp");
		rs.forward(request, response);
	}

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
