<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Spring5 MVC Hibernate Demo</title>
    <style type="text/css">
        .error {
            color: red;
        }

        table {
            width: 50%;
            border-collapse: collapse;
            border-spacing: 0px;
        }

        table td {
            border: 1px solid #565454;
            padding: 20px;
        }
    </style>
</head>
<body>
<h1>Input Form</h1>
<form:form action="addUser" method="post" modelAttribute="user">
    <table>
        <tr>
            <td>Name</td>
            <td><form:input path="name"/> <br/> <form:errors
                    path="name" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><form:input path="email"/> <br/> <form:errors
                    path="email" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><form:password path="password"/> <br/> <form:errors
                    path="password" cssClass="error"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <button type="submit">Submit</button>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>