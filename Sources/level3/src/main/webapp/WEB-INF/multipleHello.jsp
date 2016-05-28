<%-- 
    Document   : MultipleHello
    Created on : May 28, 2016, 5:56:39 PM
    Author     : Miroslava Voglova
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello there</title>
    </head>
    <body>

        <c:forEach begin="1" end="${sessionScope.repet}">
            <h1>Hello IBA!</h1>
        </c:forEach>
        <c:remove var="repet" scope="session"/>
    </body>
</html>
