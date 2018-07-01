<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
  String oldID = String.valueOf(session.getAttribute("updateID"));
  String oldNAME  = String.valueOf(session.getAttribute("updateNAME"));
  String oldTEL = String.valueOf(session.getAttribute("updateTEL"));
  String oldPASS  = String.valueOf(session.getAttribute("updatePASS"));

  String newNAME  = String.valueOf(session.getAttribute("newNAME"));
  String newTEL = String.valueOf(session.getAttribute("newTEL"));

  String pass2 = request.getParameter("rePass");
  String lastPASS  = String.valueOf(session.getAttribute("lastPASS"));
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>更新内容確認画面</title>
<link href="css/commons.css" rel="stylesheet">
<style>
.col {
  float: left;
}

.col-clear {
  clear: both;
}

#arrow {
  margin-top: 60px;
}
</style>
</head>
<body>
<c:if test="${not empty msg}">
    <p>${msg}</p>
</c:if>
<p>これでよろしいですか？</p>

<form action="updateConfirm" method="post">
  <fieldset>
    <div>
      <label>ID</label><input type="text" name="id" value="<%= oldID%>" readonly>
    </div>
  </fieldset>

  <fieldset class="col">
    <legend>変更前</legend>
    <div>
      <label>名前</label><input type="text" value="<%= oldNAME%>" disabled>
    </div>
    <div>
      <label>TEL</label><input type="text" value="<%= oldTEL%>" disabled>
    </div>
    <div>
      <label>PASS</label><input type="password" value="<%= oldPASS%>" disabled>
    </div>
  </fieldset>

  <div id="arrow" class="col">⇒</div>

  <fieldset class="col label-110">
    <legend>変更後</legend>
    <div>
      <label>名前</label><input type="text" name="newName" value="<%= newNAME%>" readonly>
    </div>
    <div>
      <label>TEL</label><input type="text" name="newTel" value="<%= newTEL%>" readonly>
    </div>
    <div>
      <label>PASS(再入力)</label><input type="password" name="rePass" value="<%= lastPASS%>">
    </div>
  </fieldset>

  <div class="col-clear">
    <input type="submit" name="button" value="更新">
    <input type="submit" name="button" value="戻る" onclick="location.href='updateInput.jsp'; return false;">
  </div>
</form>
<div>
  <a href="menu.jsp">メニューに戻る</a>
</div>
</body>
</html>
