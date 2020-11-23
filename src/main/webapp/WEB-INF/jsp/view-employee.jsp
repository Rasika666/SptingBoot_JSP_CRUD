<%--
  Created by IntelliJ IDEA.
  User: rasika
  Date: 23/11/2020
  Time: 14:47
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
            <h2 class="text-secondary">Employee Info</h2>
            <a class="btn btn-dark" href="<c:url value="/"/>" role="button">&laquo; back to Home</a>
        </div>
    </div>

    <div class="row justify-content-md-center mt-5">
        <div class="col-md-8">
            <div class="row justify-content-md-center">
                <div class="col-md-5">
                    <div class="card text-left">
                        <div class="card-header">
                            Basic User Info
                        </div>
                        <div class="card-body">
                            <div class="row">
                                <div class="col-md-6">
                                    <p class="card-title text-secondary">First Name:</p>
                                    <ul>
                                        <li class="font-weight-bold text-success">${employee.firstName}</li>
                                    </ul>
                                </div>
                                <div class="col-md-6">
                                    <p class="card-title text-secondary">Last Name:</p>
                                    <ul>
                                        <li class="font-weight-bold text-success">${employee.lastName}</li>
                                    </ul>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-md-12">
                                    <p class="card-title text-secondary">Email</p>
                                    <ul>
                                        <li class="font-weight-bold text-success">${employee.email}</li>
                                    </ul>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-md-12">
                                    <p class="card-title text-secondary">Address</p>
                                    <ul>
                                        <li class="font-weight-bold text-success">${employee.address}</li>
                                    </ul>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-md-6">
                                    <p class="card-title text-secondary">Age</p>
                                    <ul>
                                        <li class="font-weight-bold text-success">${employee.age}</li>
                                    </ul>
                                </div>
                                <div class="col-md-6">
                                    <p class="card-title text-secondary">Gender</p>
                                    <ul>
                                        <li class="font-weight-bold text-success">${employee.gender}</li>
                                    </ul>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-md-6">
                                    <p class="card-title text-secondary">Designation</p>
                                    <ul>
                                        <li class="font-weight-bold text-success">${employee.designation}</li>
                                    </ul>
                                </div>
                                <div class="col-md-6">
                                    <p class="card-title text-secondary">Fraction</p>
                                    <ul>
                                        <li class="font-weight-bold text-success">${employee.fraction.fractionName}</li>
                                    </ul>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>

                <div class="col-md-3">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="card text-left">
                                <div class="card-header">
                                    Assign Departments
                                </div>
                                <div class="card-body">
                                    <ul class="list-group">
                                        <c:forEach var="dep" items="${employee.departments}">
                                            <li class="list-group-item">${dep.departmentName}</li>
                                        </c:forEach>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="row mt-2 mb-4">
                        <div class="col-md-12">
                            <div class="card text-left">
                                <div class="card-header">
                                    Assigns Sbus
                                </div>
                                <div class="card-body">
                                    <ul class="list-group">
                                        <c:forEach var="sbu" items="${employee.sbus}">
                                            <li class="list-group-item">${sbu.sbuName}</li>
                                        </c:forEach>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>

                    <a href="<c:url value="/employee/edit/${employee.employeeId}"/>"><button type="button" class="btn btn-primary btn-block">Edit</button></a>

                </div>


            </div>
        </div>


    </div>



<%@ include file="./common/footer.jsp"%>
</body>
</html>
