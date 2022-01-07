<%--
  Created by IntelliJ IDEA.
  User: Monu Neolia
  Date: 06-01-2022
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Videos</title>
</head>
<body>
    <%

        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");     //HTTP 1.1

        response.setHeader("Pragma", "no-cache");   //HTTP 1.0

        response.setHeader("Expires", "0");     //Proxies

        if(session.getAttribute("username") == null)
            response.sendRedirect("login.jsp");
    %>

    <p>Welcome to videos</p>
</body>
</html>
