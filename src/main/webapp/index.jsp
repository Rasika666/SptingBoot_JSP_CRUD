<%--
  Created by IntelliJ IDEA.
  User: rasika
  Date: 18/11/2020
  Time: 13:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <%@ include file="WEB-INF/jsp/common/header.jsp"%>
    <title>HR Management</title>
</head>
<body>

    <div class="container">
        <div class="jumbotron mt-3">
            <h1>HR Management System</h1>
            <p class="lead">World Leading top class HR Management System By hsenidbiz</p>
            <a class="btn btn-primary" href="employees" role="button">View all employee &raquo;</a>
            <a class="btn btn-info" href="employee/add" role="button">Add New Employee &raquo;</a>
        </div>
    </div>

    <%@ include file="WEB-INF/jsp/common/footer.jsp"%>

</body>
</html>
