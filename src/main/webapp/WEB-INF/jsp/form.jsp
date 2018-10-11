<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Form</title>
</head>
<body>
<form:form action="processEmpForm" modelAttribute="employee">
Employee Name : <form:input path="empName"/><br>
Company : <form:input path="empComp"/><br><br>
<form:errors path="empName" cssStyle="color:red;"></form:errors>
<input type="submit" value = "Submit">
</form:form>
</body>
</html>