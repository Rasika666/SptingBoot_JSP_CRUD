<%--
  Created by IntelliJ IDEA.
  User: rasika
  Date: 17/11/2020
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <%@ include file="./common/header.jsp"%>
    <title>HR Management System</title>
</head>
<body>
    <div class="container">
        <div class="d-flex justify-content-between align-items-center mt-2">
            <h2 class="text-secondary">Dashboard</h2>
            <a class="btn btn-dark" href="<c:url value="/"/>" role="button">&laquo; back to Home</a>
        </div>

        <div class="row justify-content-md-center mt-5">
            <div class="col-md-8">
                <table class="table">
                    <thead>
                    <tr>
                        <th scope="col">Employee ID</th>
                        <th scope="col">First Name</th>
                        <th scope="col">Last Name</th>
                        <th scope="col">Gender</th>
                        <th scope="col">Designation</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="emp" items="${employees}">
                        <tr>
                            <td>${emp.employeeId}</td>
                            <td>${emp.firstName}</td>
                            <td>${emp.lastName}</td>
                            <td>${emp.gender}</td>
                            <td>${emp.designation}</td>
                            <td><a href="<c:url value="/employee/view/${emp.employeeId}"/>"><button type="button" class="btn btn-success">more...</button></a></td>
                            <td><a href="<c:url value='/employee/delete/${emp.employeeId}' />"><button type="button" class="btn btn-danger">delete</button></a></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>


    </div>




    <%@ include file="./common/footer.jsp"%>

</body>
</html>
