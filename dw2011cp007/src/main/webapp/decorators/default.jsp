<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html version="-//W3C//DTD XHTML 1.1//EN" xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Cine Planet</title>
    <script src="http://ajax.googleapis.com/ajax/libs/dojo/1.6/dojo/dojo.xd.js" type="text/javascript"></script>
    <link rel="stylesheet" type="text/css" href="http://ajax.googleapis.com/ajax/libs/dojo/1.6/dijit/themes/claro/claro.css" />
    <link rel="stylesheet" type="text/css" href="http://ajax.googleapis.com/ajax/libs/dojo/1.6/dojox/image/resources/image.css" />
    <link rel="stylesheet" type="text/css" href="<c:url value="resources/css/style.css" />" />
  </head>
  <body>
    <div id="main_container">
      <div id="header">
          <div id="logo">
            <object style="width: 212px; height: 150px;" data="resources/swf/logo-cineplanet-web.swf">
              <param name="movie" value="resources/swf/logo-cineplanet-web.swf" />
              <param name="quality" value="high" />
              <param name="wmode" value="transparent" />
            </object>
          </div>
          <div class="banner_adds">
          	<div class="login">
          		<table border=0 style="height: 50px;width: 370px">
          			<tr><td style="border-width: 0">
          				<form>
            				<h2 class="login2">Login</h2>
              				<input type="text" maxlength="20" tabindex="1" style="width:100px;height:18px;border-style: groove;margin-right: 3px"/>
		    				<input type="password" name="textfield" tabindex="2" style="width:100px;height:18px;float: left;margin-right: 3px;border:1px solid #C8D2D9;" />
		    				<!-- <input type="submit" name="Submit" value="Ir" /> -->
		    				<img src="resources/images/login_up.jpg">
						</form>
					</td></tr>
				</table>
			</div>
		  </div>
		  <div class="menu">
            <jsp:include page="menu.jsp" />
          </div>
  	</div>      
  <div id="main_content" >
    <decorator:body/>            
  	<jsp:include page="listaadicional.jsp" />
  </div>
  <div id="footer">
    <jsp:include page="piepagina.jsp" />
  </div>
  </div> 
  </body>
</html>
