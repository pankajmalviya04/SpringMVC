<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link href="/css/main.css" rel="stylesheet"></link>

<title>Spring Validation</title>
</head>
<body>

    <form:form action="/success" method="post" modelAttribute="employee">
        <table>
            <tr>
                <td>Username:</td>
                <td><form:input path="username" /></td>
                <td><form:errors path="username"/></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><form:input path="password"/></td>
                <td><form:errors path="password"/></td>                
            </tr>
             <tr>
                <td>Email:</td>
                <td><form:input path="email" /></td>
                <td><form:errors path="email"/></td>
            </tr>
            <tr>
                <td>age:</td>
                <td><form:input path="age" /></td>
                <td><form:errors path="age"/></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Submit"></td>
            </tr>
        </table>
    </form:form>

</body>
</html>