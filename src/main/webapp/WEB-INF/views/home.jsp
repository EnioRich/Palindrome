<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<div>
    <a href="/add-block">Add Block</a>
</div>
<center>
    <a href="/home">Refresh</a>
</center>
<br>
<br>
History
<table border='2' width='50%'>
    <tr>
        <th>Id</th>
        <th>Start Number</th>
        <th>Palindrome Count</th>
        <th>First Palindrome</th>
        <th>Last Palindrome</th>
    </tr>
    <c:forEach items="${palindromeList}" var="p">
        <tr>
            <td><c:out value="${p.id}"/></td>
            <td><c:out value="${p.startNumber}"/></td>
            <td><c:out value="${p.palindromeCount}"/></td>
            <td><c:out value="${p.firstPalindrome}"/></td>
            <td><c:out value="${p.lastPalindrome}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>