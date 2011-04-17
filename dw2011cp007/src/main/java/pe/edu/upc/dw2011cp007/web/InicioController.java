package pe.edu.upc.dw2011cp007.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import pe.edu.upc.dw2011cp007.cartelera.service.CarteleraService;
import pe.edu.upc.dw2011cp007.mantenimiento.model.CineModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.PeliculaModel;
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

		List<PeliculaModel> listaPeliculaHoy = carteleraService.buscarListaPeliculaHoy();
		model.addAttribute("listaPeliculaHoy", listaPeliculaHoy);

		List<CineModel> listaCine = mantenimientoService.buscarListaCine();
		model.addAttribute("listaCine", listaCine);

		return "publico/inicio";
	}

	@RequestMapping(value="/publico_cartelera")
	public String buscarListaCartelera(Model model) {
		List<PeliculaModel> listaPelicula = carteleraService.buscarListaPeliculaEnCartelera();
		model.addAttribute("listaPeliculaFiltrada", listaPelicula);

		return "publico/buscarpelicula";
	}

	@RequestMapping(value="/publico_estrenos")
	public String buscarListaEstrenos(Model model) {
		List<PeliculaModel> listaPelicula = carteleraService.buscarListaPeliculaEnEstreno();
		model.addAttribute("listaPeliculaFiltrada", listaPelicula);

		return "publico/buscarpelicula";
	}

	@RequestMapping(value="/publico_hoy")
	public String buscarListaHoy(Model model) {
		List<PeliculaModel> listaPeliculaHoy = carteleraService.buscarListaPeliculaHoy();
		model.addAttribute("listaPeliculaFiltrada", listaPeliculaHoy);

		return "publico/buscarpelicula";
	}

	@RequestMapping(value="/publico_cines")
	public String buscarListaCines(Model model) {
		List<PeliculaModel> listaPelicula = carteleraService.buscarListaPeliculaEnEstreno();
		model.addAttribute("listaPelicula", listaPelicula);

		return "publico/buscarcine";
	}
}
