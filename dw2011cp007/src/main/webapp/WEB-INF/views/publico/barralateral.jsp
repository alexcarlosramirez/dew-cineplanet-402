<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<div class="column1">
<div class="left_box">
<div class="top_left_box"></div>
<div class="center_left_box">
    <div class="box_title"><span>Busca</span> tu Pel&iacute;cula:</div>
    <form action="<c:url value="/publico_buscarpelicula" /> ">
    <div class="form_row">
    <label class="left">Nombre: </label><input type="text" name="nombrepelicula" />
    </div>
    <div class="form_row">
      <label class="left">Cine: </label>
        <select name="idCine" style="width: 150px;">
          <option value="0" selected="selected">--SELECCIONE--</option>
          <c:forEach items="${listaCine}" var="cine">
            <option value="${cine.idCine}">${cine.nombrecine}</option>
          </c:forEach>
        </select>
     </div>
    <div class="form_row">
    	<label class="left">Cartelera: </label>
    	<input type="checkbox" name="encartelera"/>
    </div>
    <div class="form_row">
    <label class="left">Estreno: </label><input type="checkbox" name="enestreno"/>
    </div>
    <div style="float: right;padding: 10px,25px 0 0;">
    <input type="image" src="resources/images/find.gif" />
    </div>
</form>
</div>
<div class="bottom_left_box"></div>
</div>
<div class="left_box">
	<div class="top_left_box"></div>
	<div class="center_left_box">
  		<div class="box_title"><span>Envia</span> tu consulta:</div>
  		<div class="form_row"><label class="left">Email: </label><input type="text" class="form_input"></div>
  		<div class="form_row" style="padding-left: 25px"><textarea rows="10" cols="10" style="width: 200px"></textarea></div>
  		<div style="float: right;padding: 10px,25px 0 0;"><input type="image" src="resources/images/join.gif" /></div>
  	</div>
  	<div class="bottom_left_box"></div>
</div>
<div class="left_box">
	<div class="top_left_box"></div>
	<div class="center_left_box">
  		<div class="box_title"><span>Contacto</span> Cineplanet:</div>
  		<div class="form_row">
  		<img src="resources/images/contact_envelope.gif" style="width: 50px; height: 47; border: 0px none;" class="img_right" alt="" title="" />
      		<div class="contact_information">
        	Email:
        	info@cineplanet.com<br />
        	Telephone: 0234 789 90<br />
        	Mobile: 234 345 234534<br />
        	Fax: 34534 3456 3456(54)<br />
      		</div>
    	</div>
    </div>
    <div class="bottom_left_box"></div>
</div>

</div>