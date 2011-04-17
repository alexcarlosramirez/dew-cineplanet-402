<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

<form action="<c:url value="/restringido_comprarproductos"/>">
  <table border="1">
    <tr>
      <td colspan="6" style="text-align: right !important;">
        <input type="submit" value="REGRESAR A SELECCI&Oacute;N" />
        <input type="submit" value="COMPRAR" />
      </td>
    </tr>
    <tr>
      <th><span>Producto</span></th>
      <th><span>Precio</span></th>
      <th><span>Precio/unidad</span></th>
      <th><span>Cantidad comprada</span></th>
      <th><span>Pagar/unidad</span></th>
    </tr>
    <c:forEach items="${listaCompra}" var="detalleCompra">
      <tr>
        <td><c:out value="${detalleCompra.productoModel.nombreproducto}"/></td>
        <td><c:out value="${detalleCompra.productoModel.precioproducto}"/></td>
        <td><c:out value="${detalleCompra.productoModel.precioproducto}"/></td>
        <td><c:out value="${detalleCompra.cantidadcomprada}"/></td>
        <td><c:out value="${detalleCompra.preciopagado}"/></td>
      </tr>
    </c:forEach>
    <tr>
      <th colspan="4">&nbsp;</th>
      <th align="left"><c:out value="${preciototal}"/></th>
    </tr>
  </table>
</form>