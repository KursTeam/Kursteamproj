<%--
  Created by IntelliJ IDEA.
  User: Ivan
  Date: 12/7/2019
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>
    <%
        java.util.Date now=new java.util.Date();
    for(int i=0;i<10;++i)
    out.println("<p>"+i+") "+now+"</p>");
    %>
</p>
<a href="/add">Click</a>
</body>
</html>
