<%-- 
    Document   : test
    Created on : Mar 30, 2017, 10:24:29 AM
    Author     : Karthi
--%>

<%@page import="com.jlmd.simpleneuralnetwork.example.Main2"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        The Estimated Price: 
<%
Main2 a = new Main2();
a.estValue();
out.println(a.estValue());
%>
<BR>
    </body>
</html>
