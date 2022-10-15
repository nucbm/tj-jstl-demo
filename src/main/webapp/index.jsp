<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<a href="hello-servlet">Hello Servlet</a><br/>

<form action="hello-servlet" method="post">
    <input name="name" id="name" value="students"/>
    <input type="submit" name="Submit">
</form>

<c:if test="${not empty name}">
    <h1>Hello, ${name}</h1>
</c:if>

<ul>
    <c:forEach items="${persons}" var="person">
        <li>${person.firstName} </li>
    </c:forEach>
</ul>
</body>
</html>