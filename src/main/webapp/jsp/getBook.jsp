<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>ListOfBooksByPart</title>
</head>
<body>
<form method="get" action="/SpringProject/books/searchBookByPart">
    <input name="nameBook" type="text"><br>
    <input type="submit">
</form><br>
<c:forEach var="books" items="${books}">
    ${books}
    <br>
</c:forEach>
</body>
</html>