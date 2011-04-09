<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<table style="width: 100%;">
  <tr>
    <td class="column1">
      <%@include file="barralateral.jsp" %>
    </td>
    <td valign="top" style="height: 469px; clip: rect(0px,100%,469px,0px);">
      <table style="width: 100%;">
        <tr><td class="box_title"><span>Te recomendamos</span></td></tr>
        <c:forEach items="${listaPeliculaHoy}" var="peliculaHoy">
          <tr>
            <td class="elemento_cartelera">
              <img src="<c:out value="resources/images/peliculas"/>/<c:out value="${peliculaHoy.nombreimagen}"/>" style="width: 130px; height: 98; border: 0px none;" alt="" title=""/>
              <br/>
              <hr/>
            </td>
          </tr>
        </c:forEach>
      </table>
    </td>
    <td class="column1" valign="top">
      <span class="box_title"><span>Cartelera</span></span>
      <div style="height: 469px; overflow: auto;">
        <table style="width: 100%;">
          <c:forEach items="${listaPelicula}" var="pelicula">
            <tr>
              <td class="elemento_cartelera">
                <a href="<c:out value="publico_detallepelicula?idPelicula="/><c:out value="${pelicula.idPelicula}"/>"><img src="<c:out value="resources/images/peliculas"/>/<c:out value="${pelicula.nombreimagen}"/>" style="width: 130px; height: 98; border: 0px none;" alt="" title=""/></a>
                <br/>
                <hr/>
              </td>
            </tr>
          </c:forEach>
        </table>
      </div>
    </td>
  </tr>
</table>
