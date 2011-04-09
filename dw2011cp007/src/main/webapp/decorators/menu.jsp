<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<div class="menu">
  <ul>
    <li><a href="<c:url value="/publico_inicio" />">Inicio</a></li>
    <li><a href="<c:url value="/publico_cartelera" />">Cartelera</a></li>
    <li><a href="<c:url value="/publico_estrenos" />">Pr&oacute;ximos Estrenos</a></li>
    <li><a href="<c:url value="/publico_hoy" />">Presentamos hoy</a></li>
    <li><a href="<c:url value="/publico_cines" />">Nuestros Cines</a></li>
    <li><a href="http://localhost:8080/intranet/">Intranet</a></li>
  </ul>
</div>
<c:if test="${!empty session.usuarioLogueado}">
  <div class="menu">
    <ul>
      <li><a href="<c:url value="/publico_inicio" />">Inicio</a></li>
      <li><a href="index.html">Cartelera</a></li>
      <li><a href="login.html">Pr&oacute;ximos Estrenos</a></li>
      <li><a href="admin.html">Dulcer&iacute;a</a></li>
      <li><a href="list.html">Informaci&oacute;n Premium</a></li>
      <li><a href="#">Juegos</a></li>
      <li><a href="#">Reservaciones</a></li>
    </ul>
  </div>
</c:if>