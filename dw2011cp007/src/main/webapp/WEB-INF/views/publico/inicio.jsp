<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<table style="width: 100%;">
  <tr>
    <td class="column1">
      <%@include file="barralateral.jsp" %>
    </td>
    <td valign="top" style="height: 469px; clip: rect(0px,100%,469px,0px);">
      <table style="width: 100%;">
        <tr><td class="box_title"><span>Te recomendamos</span></td></tr>
        <tr><td>IMG</td></tr>
      </table>
    </td>
    <td class="column1" valign="top">
      <span class="box_title"><span>Cartelera</span></span>
      <div style="height: 469px; overflow: auto;">
        <table style="width: 100%;">
          <c:forEach items="${listaPelicula}" var="pelicula">
            <tr>
              <td class="elemento_cartelera">
                Pel&iacute;cula: <c:out value="${pelicula.nombrepelicula}"/>  <br/>  
                Clasificaci&oacute;n: <c:out value="${pelicula.clasificacionPelicula}"/>  <br/>
                Doblada: <c:out value="${pelicula.doblada}"/>  <br/>
                3D: <c:out value="${pelicula.en3d}"/>  <br/>
                <hr/>
              </td>
            </tr>
          </c:forEach>
        </table>
      </div>
    </td>
  </tr>
</table>