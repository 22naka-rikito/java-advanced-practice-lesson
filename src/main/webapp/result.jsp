<%@ page import="entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
//必要な処理を記述してください。
String[] date = new String[3];
date[0] = request.getParameter("userId");
date[1] = request.getParameter("userName");
date[2] = request.getParameter("age");

User users[] = new User[5];

if(session.getAttribute("array") == null){
	users[0] = new User(date[0],date[1],Integer.parseInt(date[2]));
	session.setAttribute("array",users);
}else{
	users = (User[])session.getAttribute("array");
	if(int i = 0; i < 5; i++){
		
	}
}

String result = "ユーザーを登録しました。";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java応用_演習問題1(発展)</title>
<style>
body {
	border: solid 2px #000080;
	padding: 5px;
}

.result {
	background: #fffacd;
	display: inline-block;
	margin: 5px;
	padding: 10px;
}

a.button {
	background-color: #ddeeff;
	border: 1px solid #ccc;
	padding: 5px;
	cursor: pointer;
}
</style>
</head>
<body>

	<h1>Java応用 - 演習問題1(発展)</h1>

	<h2>登録結果</h2>

	<div class="result">
		<h3>実行結果</h3>
		<p><%=result%></p>
	</div>

	<p>

		<span>現在の登録ユーザー</span><br>

		<%
		// 現在のユーザー情報を表示
		/*for (User tempUser : users) {
			if (tempUser != null) {
				// ユーザー情報を取得
				// todo:
				// 現在は変数のみ定義している。
				// Userクラスの情報取得用メソッドを呼んだ値をセットするように修正。
				String msg = "";

				// ユーザー情報表示
				out.println(msg);
				out.println("<br>");
			}
		}*/
		%>
	</p>

	<form action="input.jsp">
		<button type="submit" name="btn" value="back">戻る</button>
		<button type="submit" name="btn" value="reset">リセット</button>
	</form>
</body>
</html>