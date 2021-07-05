<%-- 
    Document   : tellhistory
    Created on : Jul 4, 2021, 9:52:06 PM
    Author     : luisa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Último título</title>
        <link rel="stylesheet" href="./styles/styles.css">
    </head>
    <body>
        <jsp:useBean id="myBean" class="sports.SportsHistory"/>
        
        <div class="content-box">
            <h1>Último título</h1>
            <% String lang = request.getParameter("lang"); %>
            <jsp:setProperty name="myBean" property="msg" value="<%=lang%>"/>
            <jsp:getProperty name="myBean" property="msg"/>   
        </div>
    </body>
</html>
