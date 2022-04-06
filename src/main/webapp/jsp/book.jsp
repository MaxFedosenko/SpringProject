<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>ListOfBooks</title>
</head>
<body>
<form method="get" action="/SpringProject/books/searchBook">
    <input name="authorName" type="text"><br>
    <input type="submit">
</form><br>
<c:forEach var="books" items="${books}">
    ${books}
    <br>
</c:forEach>
</body>
</html>