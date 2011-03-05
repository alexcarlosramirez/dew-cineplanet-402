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
	 * <li>INF: Infantil</li>
	 * <li>TOD: P&uacute;blico en general</li>
	 * <li>+14: mayores de 14</li>
	 * <li>+18: Mayores de 18</li>
	 * </ul>
	 */
	private String clasificacionPelicula;

	/**
	 * <ul style="list-style: decimal;">
	 * <li>True: subtitulada/doblada</li>
	 * <li>Flase: solo subtitulada</li>
	 * </ul>
	 */
	private boolean subtitulopelicula;

	/**
	 * <ul style="list-style: decimal;">
	 * <li>True: Con 3D</li>
	 * <li>Flase: Sin 3D</li>
	 * </ul>
	 */
	private boolean tipoemisionpelicula;

	private boolean enestreno;

	private boolean encartelera;

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

	public String getClasificacionPelicula() {
		return clasificacionPelicula;
	}

	public void setClasificacionPelicula(String clasificacionPelicula) {
		this.clasificacionPelicula = clasificacionPelicula;
	}

	public boolean isSubtitulopelicula() {
		return subtitulopelicula;
	}

	public void setSubtitulopelicula(boolean subtitulopelicula) {
		this.subtitulopelicula = subtitulopelicula;
	}

	public boolean isTipoemisionpelicula() {
		return tipoemisionpelicula;
	}

	public void setTipoemisionpelicula(boolean tipoemisionpelicula) {
		this.tipoemisionpelicula = tipoemisionpelicula;
	}

	public boolean isEnestreno() {
		return enestreno;
	}

	public void setEnestreno(boolean enestreno) {
		this.enestreno = enestreno;
	}

	public boolean isEncartelera() {
		return encartelera;
	}

	public void setEncartelera(boolean encartelera) {
		this.encartelera = encartelera;
	}

	@Override
	public String toString() {
		return idPelicula + " - " + nombrepelicula;
	}
}
