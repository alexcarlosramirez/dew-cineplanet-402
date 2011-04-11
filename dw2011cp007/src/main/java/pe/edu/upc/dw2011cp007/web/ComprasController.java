package pe.edu.upc.dw2011cp007.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ComprasController {
	@RequestMapping("/carritocompra")
	
	public ModelAndView show() {
		return new ModelAndView("restringido/compras");	
	}
	

}
