package pe.edu.upc.dw2011cp007.mantenimiento.model;

import java.io.Serializable;



@SuppressWarnings("serial")
public class PeliculaModel implements Serializable {

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

	private String sinopsis;
	private String nombreimagen;

	/**
	 * <ul style="list-style: decimal;">
	 * <li>True: subtitulada/doblada</li>
	 * <li>Flase: solo subtitulada</li>
	 * </ul>
	 */
	private boolean doblada;

	/**
	 * <ul style="list-style: decimal;">
	 * <li>True: Con 3D</li>
	 * <li>Flase: Sin 3D</li>
	 * </ul>
	 */
	private boolean en3d;

	private boolean enestreno;

	private boolean encartelera;

	public PeliculaModel() {
	}
	

	public PeliculaModel(int idPelicula, String nombrepelicula,
			TipopeliculaModel tipopeliculaModel, PaisModel paisModel,
			String clasificacionPelicula, boolean doblada, boolean en3d,
			boolean enestreno, boolean encartelera) {
		super();
		this.idPelicula = idPelicula;
		this.nombrepelicula = nombrepelicula;
		this.tipopeliculaModel = tipopeliculaModel;
		this.paisModel = paisModel;
		this.clasificacionPelicula = clasificacionPelicula;
		this.doblada = doblada;
		this.en3d = en3d;
		this.enestreno = enestreno;
		this.encartelera = encartelera;
	}


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

	public boolean isDoblada() {
		return doblada;
	}

	public void setDoblada(boolean doblada) {
		this.doblada = doblada;
	}

	public boolean isEn3d() {
		return en3d;
	}

	public void setEn3d(boolean en3d) {
		this.en3d = en3d;
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

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public String getNombreimagen() {
		return nombreimagen;
	}

	public void setNombreimagen(String nombreimagen) {
		this.nombreimagen = nombreimagen;
	}


	@Override
	public String toString() {
		return 
		"PELICULA - idPelicula: " + idPelicula
		+ "\t\n - clasificacionPelicula: " + clasificacionPelicula
		+ "\t\n - doblada: " + doblada
		+ "\t\n - en3d: " + en3d
		+ "\t\n - encartelera: " + encartelera
		+ "\t\n - enestreno: " + enestreno
		+ "\t\n - nombrepelicula: " + nombrepelicula
		+ "\t\n - paisModel: " + (paisModel==null?"null":paisModel.getIdPais())
		+ "\t\n - tipopeliculaModel: " + (tipopeliculaModel==null?"null":tipopeliculaModel.getIdTipopelicula());
	}
}
