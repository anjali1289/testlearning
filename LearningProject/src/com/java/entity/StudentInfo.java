package com.java.entity;

public class StudentInfo {
   private int id;
   private String studentName;
   private int enroll;
   private String branch;
   private int studentNo;
public StudentInfo() {
	super();
}
public StudentInfo(int id) {
	super();
	this.id = id;
}

public StudentInfo(int id, String studentName, int enroll, String branch, int studentNo) {
	super();
	this.id = id;
	this.studentName = studentName;
	this.enroll = enroll;
	this.branch = branch;
	this.studentNo = studentNo;
}
public StudentInfo(String studentName, int enroll, String branch, int studentNo) {
	super();
	this.studentName = studentName;
	this.enroll = enroll;
	this.branch = branch;
	this.studentNo = studentNo;
}

public StudentInfo(String studentName, int enroll) {
	super();
	this.studentName = studentName;
	this.enroll = enroll;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public int getEnroll() {
	return enroll;
}
public void setEnroll(int enroll) {
	this.enroll = enroll;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public int getStudentNo() {
	return studentNo;
}
public void setStudentNo(int studentNo) {
	this.studentNo = studentNo;
}
@Override
public String toString() {
	return "StudentInfo [id=" + id + ", studentName=" + studentName + ", enroll=" + enroll + ", branch=" + branch
			+ ", studentNo=" + studentNo + "]";
}
   
   
   
}
