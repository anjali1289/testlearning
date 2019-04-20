<%@page import="com.java.entity.StudentInfo"%>
<%@page import="com.java.dao.StudentInfoDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% int id =Integer.parseInt( request.getParameter("id"));
System.out.println(id);
%>
<%StudentInfo s=StudentInfoDao.findById(id);

%>

<form action="UpdateServlet">
<input type=hidden name =id value=<%=id%>>
<input type=text name =name value=<%=s.getStudentName() %>>
<input type=text name =enroll value=<%=s.getEnroll() %>>
<input type=text name =branch value=<%=s.getBranch() %>>
<input type=text name =studentNo value=<%=s.getStudentNo() %>>
<input type=submit value="update">
</form>
</body>
</html>