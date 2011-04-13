<%@ page session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="admin_login">
<div class="left_box">
	<div class="top_left_box"></div>
	<div class="center_left_box">
		<div class="box_title"><span>Admin</span> login</div>
		<div class="form">
			<form id="loginForm" name="loginForm" action="j_spring_security_check"
			method="post">
				<div class="form_row"><label class="left">Username: </label> <input
					type="text" class="form_input" id="usernameField" name="j_username" /></div>
				<div class="form_row"><label class="left">Password: </label> <input
					type="password" class="form_input" id="passwordField" name="j_password" />
				</div>
				<div style="float: right; padding: 10px 25px 0 0;"><input
					type="image" src="resources/images/login.gif" /></div>
			</form>
		</div>
	</div>
	<div class="bottom_left_box"></div>
</div>
</div>
