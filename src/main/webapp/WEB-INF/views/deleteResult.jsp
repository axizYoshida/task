<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String NAME = String.valueOf(session.getAttribute("loginNAME"));%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>削除結果確認画面</title>
<link href="css/commons.css" rel="stylesheet">
</head>
<body>
<p>実行者：<%= NAME %></p>
<p>正常に削除されました</p>
<form action="select.jsp" method="post">
  <input type="submit" value="検索">
</form>
<div>
  <a href="menu.jsp">メニューに戻る</a>
</div>
</body>
</html>