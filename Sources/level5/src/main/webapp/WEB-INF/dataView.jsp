<%-- 
    Document   : dataView
    Created on : May 29, 2016, 4:54:38 PM
    Author     : Miroslava
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View data</title>
    </head>
    <body>
        <h1>Student:</h1>
        <table>
            <tr>
                <td>Jméno</td>
                <td>${name}</td>
            </tr>
            <tr>
                <td>Přezdívka</td>
                <td>${nickname}</td>
            </tr>
           <tr>
                <td>Datum narození</td>
                <td><fmt:formatDate value="${birthDate}" pattern="dd.MM.yyyy" /></td>
            </tr>
            <tr>
                <td>Pohlaví</td>
                <td>${gender}</td>
            </tr>
        </table>  
    </body>
</html>
