<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="StudentInfoServlet">
<lable>Name : <input type ="text" name="name"></lable>
<lable>Enrollment : <input  type ="text" name="enrol"></lable>
<lable>Branch : <input type ="text" name="branch"></lable>
<lable>TotalMarks : <input type ="text" name="marks"></lable>
<input type ="submit" value="submit">
<a href="index.jsp">login</a>
</form>
</body>
</html>