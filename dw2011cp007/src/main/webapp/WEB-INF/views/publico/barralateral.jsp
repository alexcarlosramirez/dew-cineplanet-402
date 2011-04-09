<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<form action="<c:url value="/publico_buscarpelicula" />">
  <table>
    <tr><td colspan="2" class="box_title"><span>Busca</span> tu Pel&iacute;cula:</td></tr>
    <tr><td align="right" style="width: 70px;">Nombre: </td><td><input type="text" name="nombrepelicula" /></td></tr>
    <tr>
      <td align="right">Cine: </td>
      <td align="left">
        <select name="idCine" style="width: 150px;">
          <option value="0" selected="selected">--SELECCIONE--</option>
          <c:forEach items="${listaCine}" var="cine">
            <option value="${cine.idCine}">${cine.nombrecine}</option>
          </c:forEach>
        </select>
      </td>
    </tr>
    <tr><td align="right">Cartelera: </td><td align="left"><input type="checkbox" name="encartelera"/></td></tr>
    <tr><td align="right">Estreno: </td><td align="left"><input type="checkbox" name="enestreno"/></td></tr>
    <tr><td align="center" colspan="2"><input type="image" src="resources/images/find.gif" /></td></tr>
  </table>
</form>
<table border=0>
  <tr><td colspan="2" class="box_title"><span>Envia</span> tu consulta:</td></tr>
  <tr><td align="right">Email: </td><td align="left"><input type="text"></td></tr>
  <tr><td align="left" colspan="2"><textarea rows="10" cols="10" style="width: 200px"></textarea></td></tr>
  <tr><td align="center" colspan="2"><input type="image" src="resources/images/join.gif" /></td></tr>
</table>
<table border=0>
  <tr><td colspan="2" class="box_title"><span>Contacto</span> Cineplanet:</td></tr>
  <tr>
    <td align="left">
      <div class="contact_information">
        Email:
        info@cineplanet.com<br />
        Telephone: 0234 789 90<br />
        Mobile: 234 345 234534<br />
        Fax: 34534 3456 3456(54)<br />
      </div>
    </td>
    <td><img src="resources/images/contact_envelope.gif" style="width: 30px; height: 37; border: 0px none;" alt="" title="" /></td>
  </tr>
</table>