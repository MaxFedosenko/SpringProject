<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>SaveBook</title>
</head>
<body>
<form method="post" action="/SpringProject/books/saveBook">
    <input name="name" type="text"> <br>
    <select name="author">
        <option>Dostoevskiy</option>
        <option>Pushkin</option>
        <option>Kolas</option>
        <option>Kupala</option>
    </select> <br>
    <input type="submit" value="Submit">
</form>
${book}
    <br>
</body>
</html>