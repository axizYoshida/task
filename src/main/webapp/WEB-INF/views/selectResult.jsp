<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>検索結果画面</title>
</head>
<body>
  検索結果<br>
  <table border="1">
    <tr>
      <th>user_id</th>
      <th>user_name</th>
      <th>telephone</th>
    </tr>
    <c:forEach var="user" items="${userList}">
      <tr>
        <td>${fn:escapeXml(user.userId)}</td>
        <td>${fn:escapeXml(user.userName)}</td>
        <td>${fn:escapeXml(user.telePhone)}</td>
      </tr>
    </c:forEach>
  </table>
   <div>
  <a href="menu.jsp">メニューに戻る</a>
	</div>
</body>
</html>