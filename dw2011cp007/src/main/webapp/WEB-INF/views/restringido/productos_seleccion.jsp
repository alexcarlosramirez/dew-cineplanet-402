<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

<form action="<c:url value="/restringido_productoscarrito"/>">
  <table>
    <tr>
      <td colspan="6" style="text-align: right !important;">
        <input type="submit" value="VER CARRITO" />
      </td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td><span>Producto</span></td>
      <td><span>Precio</span></td>
      <td><span>Existencias</span></td>
      <td><span>Precio/unidad</span></td>
      <td>Cantidad a comprar</td>
    </tr>
    <c:forEach varStatus="i" items="${listaProductoNoSel}" var="producto">
      <tr>
        <td><input type="checkbox" name="idProducto" value="${producto.idProducto}" onclick="habilitar(<c:out value="${i.index}"/>, this.checked)"></td>
        <td><span><c:out value="${producto.nombreproducto}"/></span></td>
        <td><span><c:out value="${producto.precioproducto}"/></span></td>
        <td><span><c:out value="${producto.stockproducto}"/></span></td>
        <td><span><c:out value="${producto.precioproducto}"/></span></td>
      <td><input type="text" name="cantidadcomprar" disabled="disabled"></td>
    </c:forEach>
  </table>
  <script type="text/javascript">
    function habilitar(indice, checked) {
      if (checked == true) {
        document.forms[0].cantidadcomprar[indice].removeAttribute("disabled");
      } else {
        document.forms[0].cantidadcomprar[indice].setAttribute("disabled", "disabled");
      }
    }
    </script>
</form>