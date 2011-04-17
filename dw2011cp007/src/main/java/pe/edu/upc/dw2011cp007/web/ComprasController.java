package pe.edu.upc.dw2011cp007.web;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import pe.edu.upc.dw2011cp007.compras.model.CompraModel;
import pe.edu.upc.dw2011cp007.compras.model.DetalleCompraModel;
import pe.edu.upc.dw2011cp007.compras.service.CompraService;
import pe.edu.upc.dw2011cp007.mantenimiento.model.ProductoModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.UsuarioExternoModel;
import pe.edu.upc.dw2011cp007.mantenimiento.service.MantenimientoService;
import pe.edu.upc.dw2011cp007.util.Fechas;

@SessionAttributes({"usuariologueado"})

@Controller
public class ComprasController {

	@Autowired
	MantenimientoService mantenimientoService;
	@Autowired
	CompraService compraService;

	@RequestMapping("/restringido_reservas")
	public String reservas() {
		return "restringido/reservas";
	}

	@RequestMapping("/restringido_productos")
	public String productos(Model model) {
		ArrayList<ProductoModel> listaProducto = mantenimientoService.buscarListaProducto();

		model.addAttribute("listaProductoNoSel", listaProducto);
		return "restringido/productos_seleccion";
	}

	@RequestMapping("/restringido_productoscarrito")
	public String productoscarrito(Model model, @RequestParam("idProducto") Integer[] idProducto, @RequestParam("cantidadcomprar") Integer[] cantidadcomprar) {
		Integer[] idProductoSel = idProducto;
		Integer[] cantidadcomprarSel = cantidadcomprar;
		double preciototal = 0.0;

		ArrayList<DetalleCompraModel> listaCompra = new ArrayList<DetalleCompraModel>();

		for (int i=0; i<idProductoSel.length; i++) {
			ProductoModel productoModel = mantenimientoService.buscarProducto(new ProductoModel(idProductoSel[i]));
			DetalleCompraModel detalleCompraModel = new DetalleCompraModel();
			detalleCompraModel.setProductoModel(productoModel);
			detalleCompraModel.setPreciopagado(cantidadcomprarSel[i]*productoModel.getPrecioproducto());
			detalleCompraModel.setCantidadcomprada(cantidadcomprarSel[i]);
			listaCompra.add(detalleCompraModel);
			preciototal += detalleCompraModel.getPreciopagado();
		}
		model.addAttribute("listaCompra", listaCompra);
		model.addAttribute("preciototal", preciototal);

		return "restringido/productos_carrito";
	}

	@SuppressWarnings("unchecked")
	@RequestMapping("/restringido_comprarproductos")
	public String comprarProductos(Model model) {
		UsuarioExternoModel usuarioExternoModel = (UsuarioExternoModel) model.asMap().get("usuariologueado");
		Date fechacompra = new Date();
		String codigoticket = usuarioExternoModel.getUserGenCodigo() + Fechas.aFormato(fechacompra,"yyMMdd");

		CompraModel compraModel = new CompraModel();
		compraModel.setUsuarioModel(usuarioExternoModel);
		compraModel.setFechacompra(fechacompra);
		compraModel.setCodigoticket(codigoticket);
		ArrayList<DetalleCompraModel> listaCompra = (ArrayList<DetalleCompraModel>) model.asMap().get("usuariologueado");

		boolean res = compraService.registrarCompra(compraModel, listaCompra);
		if (res) {
			return "restringido/productos_ticket";
		} else {
			return "restringido/productos_compraerror";
		}
	}

	@RequestMapping("/restringido_merchandising")
	public String merchandising() {
		return "restringido/merchandising";
	}
}
