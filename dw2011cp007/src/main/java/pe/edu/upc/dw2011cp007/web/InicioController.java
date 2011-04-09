package pe.edu.upc.dw2011cp007.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import pe.edu.upc.dw2011cp007.cartelera.model.HorarioModel;
import pe.edu.upc.dw2011cp007.cartelera.model.PeliculaModel;
import pe.edu.upc.dw2011cp007.cartelera.service.CarteleraService;
import pe.edu.upc.dw2011cp007.mantenimiento.model.CineModel;
import pe.edu.upc.dw2011cp007.mantenimiento.service.MantenimientoService;

@SessionAttributes({"listaCine"})
@Controller
public class InicioController {

	@Autowired
	CarteleraService carteleraService;
	@Autowired
	MantenimientoService mantenimientoService;

	@RequestMapping(value="/publico_inicio", method=RequestMethod.GET)
	public String index(Model model){
		List<PeliculaModel> listaPelicula = carteleraService.buscarListaPeliculaEnCartelera();
		model.addAttribute("listaPelicula", listaPelicula);

		List<HorarioModel> listaPeliculaHoy = carteleraService.buscarListaPeliculaProyectarHoy();
		model.addAttribute("listaPeliculaHoy", null);

		List<CineModel> listaCine = mantenimientoService.buscarListaCine();
		model.addAttribute("listaCine", listaCine);

		return "publico/inicio";
	}
}
