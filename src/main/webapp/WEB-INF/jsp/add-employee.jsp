<%--
  Created by IntelliJ IDEA.
  User: rasika
  Date: 17/11/2020
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <%@ include file="./common/header.jsp"%>
    <title>HR Management System</title>
</head>
<body>
<div class="container">
    <div class="d-flex justify-content-between align-items-center mt-2">
        <h2 class="text-secondary">Add New User</h2>
        <a class="btn btn-dark" href="/" role="button">&laquo; back to Home</a>
    </div>

    <div class="row justify-content-md-center mt-5">
        <div class="col-md-8">
            <form:form method="post" modelAttribute="employee">
                <form:input type="hidden" path="employeeId"/>
                <div class="form-row">
                    <div class="form-group col-md-6">
                        <label for="first_name">First Name</label>
                        <form:input type="text" class="form-control" id="first_name"  path="firstName" />
                        <form:errors path="firstName" element="div" cssClass="text-danger"/>
                    </div>
                    <div class="form-group col-md-6">
                        <label for="last_name">Last Name</label>
                        <form:input type="text" class="form-control" id="last_name" path="lastName" />
                        <form:errors path="lastName" element="div" cssClass="text-danger"/>
                    </div>
                </div>

                <div class="form-row">
                    <div class="form-group col-md-12">
                        <label for="address">Address</label>
                        <form:input type="text" class="form-control" id="address" placeholder="1234 Main St" path="address" />
                        <form:errors path="address" element="div" cssClass="text-danger"/>
                    </div>
                </div>

                <div class="form-row">
                    <div class="form-group col-md-12">
                        <label for="email">Email</label>
                        <form:input type="email" class="form-control" id="email" path="email" />
                        <form:errors path="email" element="div" cssClass="text-danger"/>
                    </div>
                </div>

                <div class="form-row">
                    <div class="form-group col-md-6">
                        <label for="age">Age</label>
                        <form:input type="text" class="form-control" id="age" path="age" />
                        <form:errors path="age" element="div" cssClass="text-danger"/>
                    </div>
                    <div class="form-group col-md-6">
                        <label for="designation">Designation</label>
                        <form:input type="text" class="form-control" id="designation" path="designation" />
                        <form:errors path="designation" element="div" cssClass="text-danger"/>
                    </div>
                </div>

                <div class="form-row">
                    <div class="form-group col-md-6">
                        <label for="tel">Mobile Number</label>
                        <form:input type="tel" class="form-control" id="tel" path="mobileNumber" />
                        <form:errors path="mobileNumber" element="div" cssClass="text-danger"/>
                    </div>

                    <div class="form-group col-md-3">
                        <div>Gender: </div>
                        <div class="form-check">
                            <form:radiobutton class="form-check-input" id="male" value="Male" path="gender"/>
                            <label class="form-check-label" for="male">
                                Male
                            </label>
                        </div>
                        <div class="form-row">
                            <div class="form-check">
                                <form:radiobutton class="form-check-input" id="female" value="Female" path="gender"/>
                                <label class="form-check-label" for="female">
                                    Female
                                </label>
                            </div>
                        </div>

                    </div>
                    <div class="form-group col-md-3">
                        <div>Fraction: </div>
                        <form:select class="custom-select" path="fraction"
                                     items="${fractions}" multiple="false" itemLabel="fractionName"/>
                        <form:errors path="fraction" element="div" cssClass="text-danger"/>
                    </div>
                </div>
                <div class="form-row mb-5">
                    <div class="col-md-6">
                        <div>Department: </div>
                        <form:select class="custom-select" path="departments"
                                     items="${departments}" itemLabel="departmentName" multiple="true"/>
                        <form:errors path="departments" element="div" cssClass="text-danger"/>

                    </div>
                    <div class="col-md-6">
                        <div>SBUs: </div>
                        <form:select class="custom-select" path="sbus"
                                     items="${sbus}" itemLabel="sbuName" multiple="true"/>
                        <form:errors path="sbus" element="div" cssClass="text-danger"/>

                    </div>
                </div>

                <c:choose>
                    <c:when test="${edit}">
                        <button type="submit" class="btn btn-primary btn-block mt-5">Update Employee</button>
                    </c:when>
                    <c:otherwise>
                        <button type="submit" class="btn btn-primary btn-block mt-5">Add New Employee</button>
                    </c:otherwise>
                </c:choose>
            </form:form>

        </div>
    </div>






</div>




<%@ include file="./common/footer.jsp"%>

</body>
</html>
