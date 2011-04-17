package pe.edu.upc.dw2011cp007.mantenimiento.service;

import java.util.ArrayList;

import pe.edu.upc.dw2011cp007.mantenimiento.model.ArtistaModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.CineModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.PeliculaModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.ProductoModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.SalasModel;

/**
 * 
 * @author <ul>
 *         <li>Romeo Maita</li>
 *         <li>Yonni Lopez</li>
 *         <li>Miguel Cosio</li>
 *         <li>Alexander Ramirez</li>
 *         </ul>
 */
public interface MantenimientoService {

	//MANTENIMIENTO DE CINE
	/**
	 * Registra un cine.
	 * @param cineModel - Clase cine con los nuevos datos
	 * @return
	 */
	boolean registrarCine(CineModel cineModel);

	/**
	 * Actualiza un cine determinado.
	 * @param cineModel - Clase cine con los datos a actualizar
	 * @return
	 */
	boolean actualizarCine(CineModel cineModel);

	/**
	 * Elimina un cine determinado.
	 * @param cineModel - Clase cine con el id del cine a eliminar
	 * @return
	 */
	boolean eliminarCine(CineModel cineModel);

	/**
	 * Busca un cine por su id
	 * @param idCine - Id del Cine
	 * @return
	 */
	CineModel buscarCinePorId(int idCine);

	/**
	 * Busca todos los cines
	 * @return
	 */
	ArrayList<CineModel> buscarListaCine();

	/**
	 * Busca un cine por su nombre
	 * @param nombrecine - nombre del cine
	 * @return
	 */
	CineModel buscarCinePorNombre(String nombrecine);

	//MANTENIMIENTO DE ARTISTAS

	/**
	 * Registra un artista.
	 * @param artistaModel - Clase artista con los datos a registrar
	 * @return
	 */
	boolean registrarArtista(ArtistaModel artistaModel);

	/**
	 * Buscar artista por su Id.
	 * @param idArtista - Id del artista
	 * @return
	 */
	ArtistaModel buscarartistaPorId(int idArtista);

	/**
	 * Actualiza un artista determinado.
	 * @param artistaModel - Clase artista con los datos a actualizar
	 * @return
	 */
	boolean actualizarArtista(ArtistaModel artistaModel);

	/**
	 * Elimina una artista determinado.
	 * @param artistaModel - Clase artista con el Id del artista a eliminar
	 * @return
	 */
	boolean eliminarCine(ArtistaModel artistaModel);

	//MANTENIMIENTO DE SALAS DE CINE

	/**
	 * Registra una sala de cine.
	 * @param salasModel - Clase sala con los datos a registrar
	 * @return
	 */
	boolean registrarSala(SalasModel salasModel);

	/**
	 * Busca una sala de cine determinado por su nombre
	 * @param nombresala - Nombre de la sala de cine a buscar
	 * @return
	 */
	SalasModel buscarSalaPorNombre(String nombresala);

	/**
	 * Actualiza los datos de una sala de cine determinado.
	 * @param salasModel - Clase sala con los datos a eliminar
	 * @return
	 */
	boolean actualizarSala(SalasModel salasModel);

	/**
	 * Elimina una sala de cine determinado
	 * @param salasModel - Clase sala con el Id del sala a eliminar
	 * @return
	 */
	boolean eliminarSala(SalasModel salasModel);

	//MANTENIMIENTO DE PRODUCTOS

	/**
	 * Busca el merchandising de una pelicula.
	 * @param peliculaModel - Pelicula elejida
	 * @return
	 */
	ArrayList<ProductoModel> buscarListaProductoPorPelicula(
			PeliculaModel peliculaModel);

	/**
	 * Busca la lista de todos los productos.
	 * @return
	 */
	ArrayList<ProductoModel> buscarListaProducto();

	/**
	 * Busca un productos por cualquier parametro.
	 * @param productoModel - Clase producto con los criteros por los cuales buscar.
	 * @return
	 */
	ProductoModel buscarProducto(ProductoModel productoModel);

	//MANTENIMIENTO DE PELICULAS

	/**
	 * Busca una pel&iacute;cula por cualquier parametro.
	 * @param peliculaSel - Clase pel&iacute;cula con criterios a buscar
	 * @return
	 */
	PeliculaModel buscarPelicula(PeliculaModel peliculaSel);

	/**
	 * Registra una pel&iacute;cula.
	 * @param peliculaModel - Clase pel&iacute;cula con los datos a registrar
	 * @return
	 */
	boolean registrarPelicula(PeliculaModel peliculaModel);

	/**
	 * Actualiza los datos una pel&iacute;cula determinada.
	 * @param peliculaModel - Clase pel&iacute;cula con los datos a actualizar.
	 * @return
	 */
	boolean modificarPelicula(PeliculaModel peliculaModel);

	/**
	 * Elimina una pel&iacute;cula determinada.
	 * @param peliculaModel - Clase pel&iacute;cula con el Id de la pel&iacute;cula a eliminar
	 * @return
	 */
	boolean eliminarPelicula(PeliculaModel peliculaModel);

	/**
	 * Busca las pel&iacute;culas por cualquier criterio y/o cine donde se proyecta.
	 * @param peliculaBuscar - Clase pel&iacute;cula con los criterios para buscar
	 * @param cineModel - Clase cine donde se proyecta la pel&iacute;cula
	 * @return
	 */
	ArrayList<PeliculaModel> buscarListaPelicula(PeliculaModel peliculaBuscar, CineModel cineModel);

	/**
	 * Busca la lista de artista de una pel&iacute;cula determinada.
	 * @param peliculaSel - Pel&iacute;cula donde actuan los artistas
	 * @return
	 */
	ArrayList<ArtistaModel> buscarListaArtistaPorPelicula(PeliculaModel peliculaSel);
}
