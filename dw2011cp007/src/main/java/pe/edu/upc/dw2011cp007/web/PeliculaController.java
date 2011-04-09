package pe.edu.upc.dw2011cp007.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pe.edu.upc.dw2011cp007.cartelera.model.PeliculaModel;
import pe.edu.upc.dw2011cp007.cartelera.service.CarteleraService;
import pe.edu.upc.dw2011cp007.mantenimiento.model.CineModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.ProductoModel;
import pe.edu.upc.dw2011cp007.mantenimiento.service.MantenimientoService;

@Controller
public class PeliculaController {

	@Autowired
	CarteleraService carteleraService;
	@Autowired
	MantenimientoService mantenimientoService;

	@RequestMapping(value="/publico_buscarpelicula")
	public String buscarListaPelicula(
			@RequestParam("nombrepelicula") String nombrepelicula
			, @RequestParam(value="encartelera", required=false) String encartelera
			, @RequestParam(value="enestreno", required=false) String enestreno
			, @RequestParam("idCine") Integer idCine
			, Model model) {

		PeliculaModel peliculaModel = new PeliculaModel();
		peliculaModel.setNombrepelicula(nombrepelicula);
		peliculaModel.setEncartelera(encartelera!=null?true:false);
		peliculaModel.setEnestreno(enestreno!=null?true:false);
		CineModel cineModel = new CineModel();
		cineModel.setIdCine(idCine);
		List<PeliculaModel> listaPelicula = carteleraService.buscarListaPelicula(peliculaModel, cineModel);
		model.addAttribute("listaPeliculaFiltrada", listaPelicula);

		return "publico/buscarpelicula";
	}

	@RequestMapping(value="/publico_detallepelicula")
	public String buscarDetallePelicula(
			@RequestParam("idPelicula") Integer idPelicula
			, Model model) {
		PeliculaModel peliculaSel = new PeliculaModel();
		peliculaSel.setIdPelicula(idPelicula);

		PeliculaModel peliculaModel = carteleraService.buscarPelicula(peliculaSel);
		model.addAttribute("peliculaSelecccionada", peliculaModel);

		ArrayList<ProductoModel> listaMerchandising = mantenimientoService.buscarListaProductoPorPelicula(peliculaSel);
		model.addAttribute("listaMerchandising", listaMerchandising);

		return "publico/detallepelicula";
	}
}
