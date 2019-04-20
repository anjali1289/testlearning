<%@page import="java.util.Arrays"%>
<%@page import="com.java.entity.StudentInfo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body border >
<table>
<tr>
<td>Name</td>
<td>Enrol.</td>
<td>Branch</td>
<td>TotalMarks</td>
<td>Update</td>
<td>Delete</td>

</tr>
<%
try{
ArrayList<StudentInfo> rs =(ArrayList<StudentInfo>)request.getAttribute("s1"); 
System.out.println(rs);
%>


<% 

for(StudentInfo sb:rs){ 
	System.out.println(sb.getStudentName());
%>
<tr>
<td><%=sb.getStudentName() %></td>
<td><%=sb.getEnroll() %></td>
<td><%=sb.getBranch() %></td>
<td><%=sb.getStudentNo() %></td>
<td><a href="update.jsp?id=<%=sb.getId() %>">Update</a></td>
<td><a href="DeleteServlet?id=<%=sb.getId()%>">Delete</a></td>
</tr>
<%}

}catch(Exception e){
	e.printStackTrace();
}%>

</table>
</body>
</html>