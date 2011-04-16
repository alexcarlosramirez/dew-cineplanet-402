<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

    
      <%@include file="barralateral.jsp" %>
    
   
    <div class="column3">
      <div class="small_title" style="padding-left: 0;padding-right: 0">&nbsp;&nbsp;&nbsp;&nbsp;
      &nbsp;&nbsp;Cartelera</div>
      <div style="height: 469px; overflow: auto;">
        
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
