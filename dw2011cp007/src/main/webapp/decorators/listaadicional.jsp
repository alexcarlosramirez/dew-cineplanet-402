<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>

<table style="width:100%;">
  <tr>
    <td colspan="2" class="title">Visita nuestros cines</td>
  </tr>
  <tr>
    <c:forEach items="${listaCine}" var="cine">
      <td class="offer_box_wide">
        <img src="resources/images/p1.jpg" style="width: 130px; height: 98; border: 0px none;" alt="" title=""/>
        <span style="color: red;"><c:out value="${cine.nombrecine}"/></span>
        <p class="offer">
          LOCAL DE <c:out value="${cine.nombrecine}"/>
        </p>
      </td>
    </c:forEach>
  </tr>
</table>