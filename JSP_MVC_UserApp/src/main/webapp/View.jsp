<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
UserBean ub=(UserBean)session.getAttribute("ubean");
out.println("page of "+ub.getfName()+"<br>");
out.println(ub.getfName()+"&nbsp&nbsp"+ub.getlName()+"&nbsp&nbsp"+ub.getAddr()+"&nbsp&nbsp"+ub.getmId()+"&nbsp&nbsp"+ub.getPhNo()+"<br>");
%>
<a href="edit">EditProfile</a>
<a href="logout">Logout</a>
</body>
</html>