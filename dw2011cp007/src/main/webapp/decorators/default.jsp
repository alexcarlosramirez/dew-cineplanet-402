<%@taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html version="-//W3C//DTD XHTML 1.1//EN" xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Cine Planet</title>
    <script src="http://ajax.googleapis.com/ajax/libs/dojo/1.6/dojo/dojo.xd.js" type="text/javascript"></script>
    <link rel="stylesheet" type="text/css" href="http://ajax.googleapis.com/ajax/libs/dojo/1.6/dijit/themes/claro/claro.css" />
    <link rel="stylesheet" type="text/css" href="http://ajax.googleapis.com/ajax/libs/dojo/1.6/dojox/image/resources/image.css" />
    <link rel="stylesheet" type="text/css" href="<c:url value="resources/css/style.css" />" />
    <style type="text/css">
      .rotator{
        background-color:#fff;
        border:solid 1px #e5e5e5;
        width:320px;
        height:450px;
        overflow:hidden;
      }
      .pane{
        background-color:#fff;
        width:100%;
        height:100%;
        overflow:hidden;
      }
    </style>
    <script type="text/javascript">
      dojo.require("dojox.widget.Rotator");
      dojo.require("dojox.widget.rotator.Fade");
      dojo.addOnLoad(function() {
          new dojox.widget.Rotator({
              transition: "dojox.widget.rotator.fade"
          },
          dojo.byId("myRotator2"));
        });
      </script>
  </head>
  <body class="claro">
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
          <jsp:include page="cabecera_login.jsp" />
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
