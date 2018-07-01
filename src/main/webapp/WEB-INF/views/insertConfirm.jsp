<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
  String insertName = String.valueOf(session.getAttribute("insertNAME"));
  String insertTel  = String.valueOf(session.getAttribute("insertTEL"));
  String insertPass  = String.valueOf(session.getAttribute("insertPASS"));
  if ("".equals(insertName) || "".equals(insertTel) || "".equals(insertPass) ||
		  insertName == null || insertTel == null || insertPass == null) {
	  request.getRequestDispatcher("insert.jsp").forward(request, response);
  }
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録確認画面</title>
<link href="css/commons.css" rel="stylesheet">
</head>
<body>
<c:if test="${not empty msg}">
    <p>${msg}</p>
</c:if>
<p>これでよろしいですか？</p>

<form action="insertConfirm" method="post">
  <fieldset class="label-110">
    <div>
      <label>名前</label><input type="text" name="name" value="<%= insertName%>" readonly>
    </div>
    <div>
      <label>TEL</label><input type="text" name="tel" value="<%= insertTel%>" readonly>
    </div>
    <div>
      <label>PASS（再入力）</label><input type="password" name="rePass" value="${fn:escapeXml(param.pass2)}">
    </div>
  </fieldset>
  <div>
    <input type="submit" name="button" value="登録">
    <input type="submit" name="button" value="戻る" onclick="location.href='insert.jsp'; return false;">
  </div>
</form>
<div>
  <a href="menu.jsp">メニューに戻る</a>
</div>
</body>
</html>