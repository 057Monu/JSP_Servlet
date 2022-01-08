<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%--<h1><%= "Hello World!" %></h1>--%>
<%--<form action="addAlien">--%>

<%--    <input type="text" name="aid" placeholder="Enter aid"><br/><br/>--%>
<%--    <input type="text" name="aname" placeholder="Enter name"><br/><br/>--%>

<%--    <input type="submit">--%>
<%--</form>--%>

<form action="upload" method="POST" enctype="multipart/form-data">
    <input type="file" name="file" multiple><br/>
    <input type="submit" value="Submit">
</form>
<br/>

<%--<a href="hello-servlet">Hello Servlet</a>--%>
</body>
</html>