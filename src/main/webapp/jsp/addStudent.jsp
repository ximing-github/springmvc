<%--
  Created by IntelliJ IDEA.
  User: 惜名
  Date: 2021/5/13
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>注册学生</title>
    </head>
    <body>
        <div align="center">
            <form action="${pageContext.request.contextPath}/addStudent.do" method="post">
                学生姓名<input type="text" name="name"><br/>
                学生年龄<input type="text" name="age"><br/>
                       <input type="submit" value="提交">

            </form>
        </div>
    </body>
</html>
