<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

<div style="float: left; margin-left: 90px">
  <a href="<c:url value="/carritocompra" />">
    <embed type="application/x-shockwave-flash" src="resources/swf/venta_online.swf" width="180" height="90"  bgcolor="#666666" quality="high" wmode="transparent" menu="false"/>
  </a>
</div>    
<div class="login">
  <table border=0 style="width: 400px; height: 50px;margin: 0;padding-left: 23px">
    <tr>
      <td style="border-width:0;padding: 0;margin: 0;">
        <form action="j_spring_security_check" method="post">
          <table border="0"><tr>
          <td style="border-width:0;padding: 0;margin: 0"><span class="login2">Login</span></td>
          
          <td style="border-width:0;padding: 0;margin: 0"><input type="text" maxlength="20" tabindex="1"
          style="width: 100px; height: 18px; border: 1px solid #C8D2D9 ; background-color:#FFFFFF;" />
          </td>
          <td style="border-width:0;padding: 0"><input type="password" name="textfield" tabindex="2"
          style="width: 100px; height: 18px; border: 1px solid #C8D2D9 ; background-color:#FFFFFF;" />
          </td>
          <td valign="middle" style="border-width:0;padding:0;margin: 0 ">
          <input type="image" src="resources/images/login_up.jpg" />
          </td>
          </tr>
          <tr>
            <td style="border-width:0;padding: 0"></td>
            <td style="border-width:0;padding: 0;margin: 0;color: white;font-weight: bold">
            <a href="<c:url value="newuser" />">Registrarse</a></td>
          </tr>
          </table>
        </form>
      </td>
    </tr>
  </table>
</div>