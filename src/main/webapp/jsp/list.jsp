<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hey guy ${sname}</h1>
	Name : ${wearer.name}
	<br> Weight : ${wearer.weight}

	<c:if test="${wearer.name==''}">
		ไม่มีค่า
	</c:if>
	<c:if test="${wearer.name!=''}">
		มีค่าเป็น ${wearer.name}
	</c:if>
	<br>
	<img src="../dog.jpg" width="500">
</body>
</html>