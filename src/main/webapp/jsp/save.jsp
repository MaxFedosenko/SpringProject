<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>SaveBook</title>
</head>
<body>
<form method="post" action="/SpringProject/books/saveBook">
    <input name="name" type="text"><br>
    <input name="author" type="text"><br>
    <input type="submit" value="Submit">
</form>
${book}
    <br>
</body>
</html>