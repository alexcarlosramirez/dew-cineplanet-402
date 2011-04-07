<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html version="-//W3C//DTD XHTML 1.1//EN" xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Cine Planet</title>
    <script src="http://ajax.googleapis.com/ajax/libs/dojo/1.6/dojo/dojo.xd.js" type="text/javascript"></script>
    <link rel="stylesheet" type="text/css" href="http://ajax.googleapis.com/ajax/libs/dojo/1.6/dijit/themes/claro/claro.css" />
    <link rel="stylesheet" type="text/css" href="http://ajax.googleapis.com/ajax/libs/dojo/1.6/dojox/image/resources/image.css" />
    <link rel="stylesheet" type="text/css" href="<c:url value="resources/css/style.css" />" />
  </head>
  <body>
    <table id="main_container" cellpadding="0" cellspacing="0" border="1">
      <thead id="header">
        <tr>
          <td id="logo" rowspan="2">
            <object style="width: 212px; height: 150px;" data="resources/swf/logo-cineplanet-web.swf">
              <param name="movie" value="resources/swf/logo-cineplanet-web.swf" />
              <param name="quality" value="high" />
              <param name="wmode" value="transparent" />
            </object>
          </td>
          <td class="login">
            <form action="/login">
              <table>
                <tr>
                  <td>Login</td>
                  <td><input type="text" maxlength="20" tabindex="1" /></td>
                  <td><input type="text" name="textfield" tabindex="2" /></td>
                  <td><input type="submit" name="Submit" value="Ir" /></td>
                </tr>
              </table>
            </form>
          </td>
        </tr>
        <tr>
          <td class="banner_adds" style="height: 20px;">
            <jsp:include page="menu.jsp" />
          </td>
        </tr>
      </thead>
      <tfoot id="footer">
        <tr>
          <td colspan="2">
            <jsp:include page="piepagina.jsp" />
          </td>
        </tr>
      </tfoot>
      <tbody id="main_content">
        <tr>
          <td colspan="2">
            <decorator:body/>
          </td>
        </tr>
        <tr>
          <td colspan="2" class="column4">
            <jsp:include page="listaadicional.jsp" />
          </td>
        </tr>
      </tbody>
    </table>
  </body>
</html>
