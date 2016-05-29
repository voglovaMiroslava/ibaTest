<%-- 
    Document   : form
    Created on : May 29, 2016, 4:54:22 PM
    Author     : Miroslava
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form</title>
    </head>
    <body>

        <h2>Zadejte nového studenta:</h2>
        <form:form method="POST" action="view" commandName="command">
            <table>
                <tr>
                    <td><form:label path="name">Jméno</form:label></td>
                    <td><form:input path="name" /></td>
                </tr>
                <tr>
                    <td><form:label path="nickname">Přezdívka</form:label></td>
                    <td><form:input path="nickname" /></td>
                </tr>
                <tr>
                    <td><form:label path="birthDate">Datum narození</form:label></td>
                    <td><form:input path="birthDate" /></td>
                </tr>
                <tr>
                    <td><form:label path="gender">Pohlaví</form:label></td>
                    <td><form:select path="gender" items="${genderValues}" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Potvrdit"/>
                    </td>
                </tr>
            </table>
        </form:form>

    </body>
</html>
