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
          <tr>
            <td>
              <img src="<c:out value="resources/images/peliculas"/>/<c:out value="${peliculaSelecccionada.nombreimagen}"/>" style="width: 130px; height: 98; border: 0px none;" alt="" title=""/>
            </td>
          </tr>
          <tr>
            <td class="elemento_cartelera">
              Pel&iacute;cula: <c:out value="${peliculaSelecccionada.nombrepelicula}"/>  <br/>
              Sinopsis: <c:out value="${peliculaSelecccionada.sinopsis}"/>  <br/>
              Clasificaci&oacute;n: <c:out value="${peliculaSelecccionada.clasificacionPelicula}"/>  <br/>
              Doblada: <c:out value="${peliculaSelecccionada.doblada}"/>  <br/>
              3D: <c:out value="${peliculaSelecccionada.en3d}"/>  <br/>
             <hr/>
            </td>
          </tr>
          <c:forEach items="${listaMerchandising}" var="merchandising">
            <tr>
              <td class="elemento_cartelera">
                <img src="<c:out value="resources/images/productos"/>/<c:out value="${merchandising.rutaimagen}"/>" style="width: 130px; height: 98; border: 0px none;" alt="" title=""/><br/>
                Precio: <c:out value="${merchandising.nombreproducto}"/><br/>
                Precio: <c:out value="${merchandising.precioproducto}"/><br/>
                <hr/>
              </td>
            </tr>
          </c:forEach>
        </table>
      </div>
    </td>
  </tr>
</table>