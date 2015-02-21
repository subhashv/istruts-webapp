<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<div style="color: red;">
<html:errors/>
</div>
<html:form action="/login.do">

<div width="100%" height="100%" align="center">
	<table>
		<tr>
			<td><bean:message key="loginpage.label.username"/></td>
			<td><html:text property="userName"/></td>
		</tr>
		<tr>
			<td><bean:message key="loginpage.label.password"/></td>
			<td><html:password property="password"/></td>
		</tr>
		<tr>
			<td colspan="2"><html:submit><bean:message key="loginpage.label.loginbutton"/></html:submit></td>
		</tr>
		
	</table>
</div>
</html:form>
</body>
</html>