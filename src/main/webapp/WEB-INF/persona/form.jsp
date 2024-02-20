<%--
  Created by IntelliJ IDEA.
  User: jmads
  Date: 19/02/2024
  Time: 07:39 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form persona</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/PersonaServlet" method="post">
  <p>
    <label for="nombre">Nombre</label>
    <input id="nombre" name="nombre" type="text">
  </p>

  <p>
    <label for="semblanza">Semblanza</label>
    <textarea id="semblanza" name="semblanza" type="text"></textarea>
  </p>
  <button type="submit">Enviar</button>
</form>
</body>
</html>
