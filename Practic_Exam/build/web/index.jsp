<%-- 
    Document   : index
    Created on : Jul 14, 2023, 1:10:47 PM
    Author     : xuant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="/WEB-INF/tlds/CustomAttribute.tld" prefix="my" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <table border = "1px" width = "40%">
            <tr>
                <th>Project ID</th>
                <th>Name</th>
                <th>Quality</th>
                <th>Feature</th>
            </tr>
            <%--ben kia dat ten la data nen .data--%>
            <c:forEach items="${requestScope.data}" var="p">
                <tr>
                    <td>${p.projectID}</td>
                    <td>${p.name}</td>
                    <td>${p.quality}</td>
                    <td>${p.feature}</td>                   
                </tr>
            </c:forEach>

        </table>
            <my:mytag/>
    </body>
</html>
