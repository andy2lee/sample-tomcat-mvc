<%--
  Created by IntelliJ IDEA.
  User: andylee
  Date: 2017/9/8
  Time: 下午 06:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>first tomcat server page</title>
  </head>
  <body>
    <h1>hello!! world</h1>
    <p>my first tomcat server!!</p>
    <form action="/sign_in" method="post">
      name: <input type="text" name="name_input" width="30"/>
      password: <input type="password" name="password" width="10"/>
      <input type="submit" value="sign_in"/>
    </form>
    <p style="color: red;">${errormessage}</p>
    <p>Time: ${date_set}</p>
  </body>
</html>
