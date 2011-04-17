package pe.edu.upc.dw2011cp007.cartelera.service;

import java.util.ArrayList;
import java.util.List;

import pe.edu.upc.dw2011cp007.cartelera.model.HorarioModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.PeliculaModel;

/**
 * Permite la consulta de la proyección de peliculas, ya sea porque est&aacute;n en cartelera, estreno o se proyectan un d&iacute;a determinado.
 * @author <ul>
 *         <li>Romeo Maita</li>
 *         <li>Yonni Lopez</li>
 *         <li>Miguel Cosio</li>
 *         <li>Alexander Ramirez</li>
 *         </ul>
 */
public interface CarteleraService {

	/**
	 * Busca las pel&iacute;culas que se proyectan el d&iacute;a del sistema y los muestra hora por hora.
	 * @return
	 */
	ArrayList<HorarioModel> buscarListaPeliculaProyectarHoy();

	/**
	 * Busca el horario de proyecci&oacute; de una pel&iacute;cula determinada.
	 * @param peliculaSel - Clase pel&iacute;cula con los criterios a buscar
	 * @return
	 */
	ArrayList<HorarioModel> buscarHorarioPorPelicula(PeliculaModel peliculaSel);

	/**
	 * Busca la lista de pel&iacute;culas en cartelera.
	 * @return lista de peliculas en cartelera
	 */
	ArrayList<PeliculaModel> buscarListaPeliculaEnCartelera();

	/**
	 * Busca la lista que est&aacute;n en estreno.
	 * @return lista de peliculas en estreno
	 */
	ArrayList<PeliculaModel> buscarListaPeliculaEnEstreno();

	/**
	 * Busca las pel&iacute;culas que se proyectan en el d&iacute;a.
	 * @return
	 */
	List<PeliculaModel> buscarListaPeliculaHoy();
}
