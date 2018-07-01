<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
  String updateID = String.valueOf(session.getAttribute("updateID"));
  String updateNAME = String.valueOf(session.getAttribute("updateNAME"));
  String updateTEL = String.valueOf(session.getAttribute("updateTEL"));
  String updatePASS  = String.valueOf(session.getAttribute("updatePASS"));
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>更新内容入力画面</title>
<link href="css/commons.css" rel="stylesheet">
</head>
<body>
 <c:if test="${not empty msg}">
    <p>${msg}</p>
 </c:if>
<p>※IDは変更できません</p>

<form action="updateInput" method="post">
  <fieldset>
    <div>
      <label>ID</label><input type="text" name="id" value="<%= updateID%>" readonly>
    </div>
    <div>
      <label>名前</label><input type="text" name="newName" value="<%= updateNAME%>">
    </div>
    <div>
      <label>TEL</label><input type="text" name="newTel" value="<%= updateTEL%>">
    </div>
    <div>
      <label>PASS</label><input type="password" name="newPass" value="<%= updatePASS%>">
    </div>
  </fieldset>
  <div>
    <input type="submit" name="button" value="確認">
    <input type="submit" name="button" value="戻る" onclick="location.href='update.jsp'; return false;">
  </div>
</form>
<div>
  <a href="menu.jsp">メニューに戻る</a>
</div>
</body>
</html>
