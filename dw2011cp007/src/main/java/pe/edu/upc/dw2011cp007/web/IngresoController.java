package pe.edu.upc.dw2011cp007.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import pe.edu.upc.dw2011cp007.compras.service.CompraService;
import pe.edu.upc.dw2011cp007.mantenimiento.model.UsuarioExternoModel;
import pe.edu.upc.dw2011cp007.mantenimiento.service.MantenimientoService;

@SessionAttributes({"usuariologueado"})

@Controller
public class IngresoController {

	@Autowired
	MantenimientoService mantenimientoService;
	@Autowired
	CompraService compraService;

	@RequestMapping("/carritocompra")
	public ModelAndView entrar(Authentication authentication) {
		UsuarioExternoModel usuariologueado = new UsuarioExternoModel();
		usuariologueado.setUserGenCodigo(authentication.getName());
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("usuariologueado", usuariologueado);
		return new ModelAndView("restringido/compras", map);	
	}
}
