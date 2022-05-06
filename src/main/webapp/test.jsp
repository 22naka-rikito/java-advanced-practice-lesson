<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String[] aa;
aa = new String[3];
aa[0] = "a";
aa[1] = "b";
aa[2] = "c";
String t = "";
String g=request.getParmerte("aaa");

if(session.getAttribute("a") == null){
	session.setAttribute("a", g);
}else{
	 t = (String)session.getAttribute("a");
}

out.println(t);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="test.jsp">
<input type="text" name="aaa">
<button type="submit"></button>
</form>
</body>
</html>