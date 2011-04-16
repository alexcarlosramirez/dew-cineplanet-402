<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@page session="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>

<div class="column4">
  
    <div class="title">Visita nuestros cines</div>
      <c:forEach items="${listaCine}" var="cine">
        <div class="offer_box_wide">
          <img src="<c:out value="resources/images/cine"/>/<c:out value="${cine.rutaimagen}"/>" style="width: 130px; height: 98; border: 0px none;" class="img_left" alt="" title=""/>
          <div class="offer_info">
          <span style="color: red;"><c:out value="${cine.nombrecine}"/></span>
          <p class="offer">
            <c:out value="${cine.observacion}"/><br/>
            Direccion: <c:out value="${cine.direccion}"/><br/>
            Telefono: <c:out value="${cine.telefono}"/><br/>
          </p>
        </div>  
        </div>
      </c:forEach>

</div>