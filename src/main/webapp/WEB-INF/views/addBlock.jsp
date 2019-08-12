<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Block</title>
</head>
<body>

<%--@elvariable id="block" type="com.evakule.model"--%>
<spring:form modelAttribute = "block" action = "/add-block" method = "post">

    <label for="startNumber">Start Number</label>
    <spring:input path="startNumber" id="startNumber"/>

    <label for="palindromeCount">Palindrome Count</label>
    <spring:input path="palindromeCount" id="palindromeCount"/>

    <button type="submit">Submit</button>
</spring:form>

</body>
</html>
