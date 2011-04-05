<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<table style="width: 100%">
  <tr>
    <td class="column1" valign="top">
      <%@include file="barralateral.jsp" %>
    </td>
    <td valign="top">
      <div style="height: 469px; overflow: auto;">
        <table style="width: 100%;">
          <tr>
            <td class="box_title"><span>Resultados</span> de busqueda:</td>
          </tr>
          <c:forEach items="${listaPeliculaFiltrada}" var="pelicula">
            <tr>
              <td class="elemento_cartelera">
                Pel&iacute;cula:  <c:out value="${pelicula.nombrepelicula}"/>  <br/>  
                Clasificaci&oacute;n:  <c:out value="${pelicula.clasificacionPelicula}"/>  <br/>
                Doblada: <c:out value="${pelicula.doblada}"/>  <br/>
                3D:   <c:out value="${pelicula.en3d}"/>  <br/>
               <hr/>
              </td>
            </tr>
          </c:forEach>
        </table>
      </div>
    </td>
  </tr>
</table>