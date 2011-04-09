<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>

<table style="width:100%;">
  <tr>
    <td colspan="2" class="title">Visita nuestros cines</td>
  </tr>
  <tr>
    <td>
      <c:forEach items="${listaCine}" var="cine">
        <div class="offer_box_wide">
          <img src="<c:out value="resources/images/cine"/>/<c:out value="${cine.rutaimagen}"/>" style="width: 130px; height: 98; border: 0px none;" alt="" title=""/>
          <span style="color: red;"><c:out value="${cine.nombrecine}"/></span>
          <p class="offer">
            <c:out value="${cine.observacion}"/><br/>
            Direccion: <c:out value="${cine.direccion}"/><br/>
            Telefono: <c:out value="${cine.telefono}"/><br/>
          </p>
        </div>
      </c:forEach>
    </td>
  </tr>
</table>