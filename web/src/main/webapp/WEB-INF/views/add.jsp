<%--
  Created by IntelliJ IDEA.
  User: lusi
  Date: 2016/4/24
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生管理系统</title>
</head>
<body>
   <h1>添加学生</h1>
   <hr>
   <form name="registerForm" method="post" action="${website}/new">
       <p>序号:<input name="id" type="text" /></p>
       <p>学号:<input name="studentNumber" type="text" /></p>
       <p>姓名:<input name="studentName" type="text" /></p>
       <p>性别:<input name="sex" type="text" /></p>
       <p>年级:<input name="grade" type="text" /></p>
       <p>班级:<input name="classNumber" type="text" /></p>
       <p>学院:<input name="college" type="text" /></p>
       <p>出生日期:<input name="birthday" type="date"/></p>
       <p>是否好学生:<input name="isGoodStudent" type="text" /></p>
       <p>密码:<input name="password" type="password" /></p>
       <p><input type="submit" value="保存" /><input type="reset" value="取消"/></p>
   </form>
</body>
</html>
