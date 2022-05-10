<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
</head>
<body>
	<c:if test="${id eq 'miss'}">
		IDまたはPASSが間違っています
	</c:if>
	<form action="login" method="POST">
		<p>
			ID:
			<input type="text" name="id">
			<c:if test="${id eq 'none'}">
				idは必須です。
			</c:if>
		</p>
		<p>
			PASS:
			<input type="text" name="pass">
			<c:if test="${pass eq 'none'}">
				PASSは必須です。
			</c:if>
		</p>
		<button type="submit">ログイン</button>
	</form>
</body>
</html>