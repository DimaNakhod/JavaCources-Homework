<%@ page language="java" contentType="text/html; charset=utf-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link href="css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <c:import url="/jspf/Header.jspf"></c:import>

    <div class="authorize">
        <form action="login" method="post">
            <fmt:message key="enterLogin"/>
            <input type="text" name="name">
            <fmt:message key="enterPassword"/>
            <input type="text" name="password">
            <input type="submit">
        </form>
    </div>

        <div class="error">
        ${invalid}
        </div>

</body>
</html>