<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update.do" method="post">
		<pre>
Name:<input type="text" name="name" value="${dto.name}">
Email:<input type="text" name="email" value="${dto.email}" readonly="readonly">
Phone:<input type="text" name="phone" value="${dto.phone}">
Age:<input type="text" name="age" value="${dto.age}">
City:<input type="text" name="city" value="${dto.city}">
Country:<input type="text" name="country" value="${dto.country}">
Password:<input type="password" name="password" value="${dto.password}">
<input type="submit" value="update">
</pre>
	</form>
</body>
</html>