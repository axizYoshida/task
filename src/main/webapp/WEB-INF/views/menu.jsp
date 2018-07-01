<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	HttpSession name = request.getSession();
	String NAME = String.valueOf(session.getAttribute("name"));
%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>メニュー画面</title>
<link href="css/commons.css" rel="stylesheet">
</head>
<body>
	<p><%=NAME%>さん、こんにちは
	</p>
		<p>
			<a href="select">検索</a>
		</p>
		<p>
			<a href="insert">登録</a>
		</p>
		<p>
			<a href="update">更新</a>
		</p>
		<p>
			<a href="delete">削除</a>
		</p>
		<a href="logout">ログアウト</a>
</body>
</html>


