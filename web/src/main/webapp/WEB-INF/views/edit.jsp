<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!-- **********************************************************************************
*Description: 登录页
*author:      mayuan
*date:        2015.8.25
************************************************************************************************* -->
<!DOCTYPE html>
<html>
<head>
    <title>学生管理系统</title>
</head>
<body>
    <h1>修改页</h1>
    <hr>
    <form name="form" method="post" action="${website}/update">
        <p>序号:<input name="id" type="text" /></p>
        <p>学号:<input name="studentNumber" type="text" /></p>
        <p>姓名:<input name="studentName" type="text" /></p>
        <p>性别:<input name="sex" type="text" /></p>
        <p>年级:<input name="grade" type="text" /></p>
        <p>班级:<input name="classNumber" type="text" /></p>
        <p>学院:<input name="college" type="text" /></p>
        <p>是否好学生:<input name="isGoodStudent" type="text" /></p>
        <p>密码:<input name="password" type="password" /></p>
        <p><input type="submit" value="保存" /><input type="reset" value="取消"/></p>
    </form>
</body>
</html>