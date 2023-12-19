<%@ page language="java" contentType="text/html; charset=utf-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link href="css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <c:import url="/jspf/Header.jspf"></c:import>

    <form action="actorsByNumberOfFilms" method="post">
            <input type="text" name="number"> <input type="submit">
    </form>

    <div class="object">
    <c:forEach items="${actors}" var="actor">
        ${actor}
        <br>
    </c:forEach>
    </div>

</body>
</html>