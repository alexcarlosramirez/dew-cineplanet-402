<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

<div style="float: left; margin-left: 90px">
	<a href="<c:url value="/carritocompra" />">
		<embed type="application/x-shockwave-flash" src="resources/swf/venta_online.swf" width="180" height="90"  bgcolor="#666666" quality="high" wmode="transparent" menu="false">
	</a>
</div>    
<div class="login">
<table border=0 style="height: 50px; width: 370px">
	<tr>
		<td style="border-width: 0">
		<form>
		<h2 class="login2">Login</h2>
		<input type="text" maxlength="20" tabindex="1"
			style="width: 100px; height: 18px; border-style: groove; margin-right: 3px" />
		<input type="password" name="textfield" tabindex="2"
			style="width: 100px; height: 18px; float: left; margin-right: 3px; border: 1px solid #C8D2D9;" />
			<img src="resources/images/login_up.jpg"></form>
		</td>
	</tr>
</table>
</div>