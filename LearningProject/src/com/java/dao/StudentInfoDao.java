package com.java.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.java.entity.StudentInfo;
import com.java.util.DBConnection;


public class StudentInfoDao {

	Connection c;
	
	public boolean inserValue(StudentInfo s) {
		
		try {
			c=DBConnection.getConnection();
			PreparedStatement ps= c.prepareStatement("insert into studentreg values (?,?,?,?,?)");
			ps.setInt(1, s.getId());
			ps.setString(2, s.getStudentName());
			ps.setInt(3, s.getEnroll());
			ps.setString(4, s.getBranch());
			ps.setInt(5, s.getStudentNo());
			ps.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return true;
	}
	
	public static StudentInfo loginStudent(String name,int rollNo) {
		StudentInfo se=null;
		try {
			
		Connection	c= DBConnection.getConnection();
			PreparedStatement ps = c.prepareStatement("select * from studentreg where student_name=? and enrol= ?");
			ps.setString(1, name);
			ps.setInt(2, rollNo);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				se = new StudentInfo();
				se.setStudentName(rs.getString("student_name"));
				se.setEnroll(rs.getInt("enrol"));
			}
			
		}catch(Exception e)
		{
		e.printStackTrace();	
		}
		return se;
	}
	
	public ArrayList <StudentInfo> FindAdd(){
	Connection c;
		ArrayList<StudentInfo> st = new ArrayList<StudentInfo>();
		try {
			
			c= DBConnection.getConnection();
			PreparedStatement ps = c.prepareStatement("Select * from studentreg");
			ResultSet rs = ps.executeQuery();
			System.out.println("inserted");
			while(rs.next()) {
			StudentInfo n = new StudentInfo();
			n.setId(rs.getInt("id"));
			
			n.setStudentName(rs.getString("student_name"));
			n.setEnroll(rs.getInt("enrol"));
			n.setBranch(rs.getString("branch"));
			n.setStudentNo(rs.getInt("student_no"));
			st.add(n);
			}
			
		}catch(Exception e) {
		e.printStackTrace();	
		}
		
		return st;
	}
	
	public static StudentInfo findById(int id) {
		StudentInfo s=null;
		try {
		Connection c=DBConnection.getConnection();
		PreparedStatement ps= c.prepareStatement("select * from studentreg where id=? ");
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			s=new StudentInfo();
			s.setId(rs.getInt("id"));
			s.setStudentName(rs.getString("student_name"));
			s.setEnroll(rs.getInt("enrol"));
			s.setBranch(rs.getString("branch"));
			s.setStudentNo(rs.getInt("student_no"));
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return s;
	}
	
	public boolean getUpdate(StudentInfo s1) {
		Connection c;
		try {
			 c= DBConnection.getConnection();
			 PreparedStatement ps= c.prepareStatement("update studentreg set student_name=?,enrol=?,branch=?,student_no=? where id=? ");
		ps.setString(1, s1.getStudentName());
		ps.setInt(2, s1.getEnroll());
		ps.setString(3, s1.getBranch());
		ps.setInt(4, s1.getStudentNo());
		ps.setInt(5, s1.getId());
		ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	public boolean delete(StudentInfo s) {
		try {
		Connection c=DBConnection.getConnection();
		PreparedStatement ps=c.prepareStatement("delete from studentreg where id =?");
		ps.setInt(1, s.getId());
		ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return true;
	}
}
