<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

<%@include file="barralateral.jsp" %>
<div class="column3" style="text-align: center;">
  <span class="small_title">Presentamos hoy</span>
  <button onclick="dojo.publish('myRotator2/rotator/control', ['prev']);">
    &lt;&lt;
  </button>
  <button onclick="dojo.publish('myRotator2/rotator/control', ['next']);">
    &gt;&gt;
  </button>
  <div class="rotator" id="myRotator2">
    <c:forEach items="${listaPeliculaHoy}" var="pelicula">
      <div class="pane">
        <a href="<c:out value="publico_detallepelicula?idPelicula="/>
        <c:out value="${pelicula.idPelicula}"/>">
        <img src="<c:out value="resources/images/peliculas"/>/<c:out value="${pelicula.nombreimagen}"/>"
         style="width: 70px; height: 48; border: 0px none;" class="img_left" alt="" title=""/></a>
        <span class="offer_info"><c:out value="${pelicula.nombrepelicula}"/></span>
        <p class="offer">
        <c:out value="${pelicula.sinopsis}"/>
        </p>
        <span class="offer_info">TRAILER</span>
        <br/>
        <br/>
        Video no encontrado
      </div>
    </c:forEach>
  </div>
</div>
<div class="column3" style="text-align: center;">
  <span class="small_title">Cartelera</span>
  <div class="list_movie">
    <c:forEach items="${listaPelicula}" var="pelicula">
      <div class="offer_box">
        <a href="<c:out value="publico_detallepelicula?idPelicula="/>
        <c:out value="${pelicula.idPelicula}"/>">
        <img src="<c:out value="resources/images/peliculas"/>/<c:out value="${pelicula.nombreimagen}"/>"
         style="width: 70px; height: 48; border: 0px none;" class="img_left" alt="" title=""/></a>
        <div class="offer_info">
        <span><c:out value="${pelicula.nombrepelicula}"/></span>
        </div>
        <p class="offer">
        <c:out value="${pelicula.sinopsis}"/>
        </p>
      </div>
    </c:forEach>
  </div>
</div>