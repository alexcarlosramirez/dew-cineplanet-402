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
    <tr><td align="right" colspan="2"><input type="image" src="resources/images/find.gif" /></td></tr>
  </table>
</form>
<table>
  <tr><td colspan="2" class="box_title"><span>Envia</span> tu consulta:</td></tr>
  <tr><td align="right">Email: </td><td align="left"><input type="text"/></td></tr>
  <tr><td align="right" colspan="2"><input type="image" src="resources/images/join.gif" /></td></tr>
</table>
<table>
  <tr><td colspan="2" class="box_title"><span>Contacto</span> Cineplanet:</td></tr>
  <tr>
    <td colspan="2">
      <img src="resources/images/contact_envelope.gif" style="width: 50px; height: 47; border: 0px none;" alt="" title="" />
      <div class="contact_information">
        Email:
        info@comapnyname.com<br />
        Telephone: 0234 789 90<br />
        Mobile: 234 345 234534<br />
        Fax: 34534 3456 3456(54)<br />
        <br />
        <span>www.companyname.com</span>
      </div>
    </td>
  </tr>
</table>