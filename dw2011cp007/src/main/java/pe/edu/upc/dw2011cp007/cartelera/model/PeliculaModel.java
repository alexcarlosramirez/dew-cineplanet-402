package pe.edu.upc.dw2011cp007.cartelera.model;

import pe.edu.upc.dw2011cp007.mantenimiento.model.PaisModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.TipopeliculaModel;


public class PeliculaModel {

	private int idPelicula;
	private String nombrepelicula;
	private TipopeliculaModel tipopeliculaModel;
	private PaisModel paisModel;

	/**
	 * <ul style="list-style: decimal;">
	 * <li>solo subtitulada</li>
	 * <li>solo doblada</li>
	 * <li>subtitulada/doblada</li>
	 * </ul>
	 */
	private int subtitulopelicula;

	/**
	 * <ul style="list-style: decimal;">
	 * <li>2D</li>
	 * <li>3D</li>
	 * </ul>
	 */
	private int tipoemisionpelicula;

	/**
	 * <ul style="list-style: decimal;">
	 * <li>Infantil</li>
	 * <li>P&uacute;blico en general</li>
	 * <li>+14</li>
	 * <li>+18</li>
	 * </ul>
	 */
	private int clasificacionPelicula;

	public int getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getNombrepelicula() {
		return nombrepelicula;
	}

	public void setNombrepelicula(String nombrepelicula) {
		this.nombrepelicula = nombrepelicula;
	}

	public TipopeliculaModel getTipopeliculaModel() {
		return tipopeliculaModel;
	}

	public void setTipopeliculaModel(TipopeliculaModel tipopeliculaModel) {
		this.tipopeliculaModel = tipopeliculaModel;
	}

	public PaisModel getPaisModel() {
		return paisModel;
	}

	public void setPaisModel(PaisModel paisModel) {
		this.paisModel = paisModel;
	}

	public int getSubtitulopelicula() {
		return subtitulopelicula;
	}

	public void setSubtitulopelicula(int subtitulopelicula) {
		this.subtitulopelicula = subtitulopelicula;
	}

	public int getTipoemisionpelicula() {
		return tipoemisionpelicula;
	}

	public void setTipoemisionpelicula(int tipoemisionpelicula) {
		this.tipoemisionpelicula = tipoemisionpelicula;
	}

	public int getClasificacionPelicula() {
		return clasificacionPelicula;
	}

	public void setClasificacionPelicula(int clasificacionPelicula) {
		this.clasificacionPelicula = clasificacionPelicula;
	}
}
