<%@ page language="java" contentType="text/html; charset=utf-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link href="css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <c:import url="/jspf/Header.jspf"></c:import>

    <div class="object">
    <c:forEach items="${films}" var="film">
            ${film}
            <br>
    </c:forEach>
    </div>

</body>
</html>
