<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 5/31/2020
  Time: 10:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/calculate" method="post">
    <table>
        <tr>
            <td colspan="2"><input type="number" name="number1" placeholder="Input Number 1"></td>
            <td colspan="2"><input type="number" name="number2" placeholder="Input Number 2"></td>
        </tr>
        <tr>
            <td><input type="submit" name="action" value="add"></td>
            <td><input type="submit" name="action" value="sub"></td>
            <td><input type="submit" name="action" value="mul"></td>
            <td><input type="submit" name="action" value="div"></td>
        </tr>
        <tr>
            <td colspan="2">Result</td>
            <td colspan="2">
                <c:set var="warning" value="${warning}"/>
                <c:choose>
                    <c:when test="${warning.equals('')}">
                        ${result}
                    </c:when>
                </c:choose>
                    ${warning}</td>
        </tr>
    </table>
</form:form>
</body>
</html>
