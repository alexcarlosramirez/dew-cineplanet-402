package pe.edu.upc.dw2011cp007.model;

public class PerfilModel {

	/**
	 * Identificador del perfil en la BD
	 */
	private int idPerfil;

	/**
	 * Nombre c�digo del perfil en el sistema.
	 */
	private String nombrePerfil;

	/**
	 * Explicaci�n general del perfil
	 */
	private String descripcionPerfil;

	/**
	 * Se estimar� en d�as.
	 */
	private int vigenciaPerfil;

	/**
	 * Estado:
	 * <ul>
	 * <li>0: Cancelado</li>
	 * <li>1: Activo</li>
	 * <li>2: Bloqueado</li>
	 * </ul>
	 */
	private int estadoPerfil;
	//private ArrayList<FuncionesModel> listaFunciones;

	public int getIdPerfil() {
		return idPerfil;
	}
	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}
	public String getNombrePerfil() {
		return nombrePerfil;
	}
	public void setNombrePerfil(String nombrePerfil) {
		this.nombrePerfil = nombrePerfil;
	}
	public String getDescripcionPerfil() {
		return descripcionPerfil;
	}
	public void setDescripcionPerfil(String descripcionPerfil) {
		this.descripcionPerfil = descripcionPerfil;
	}
	public int getVigenciaPerfil() {
		return vigenciaPerfil;
	}
	public void setVigenciaPerfil(int vigenciaPerfil) {
		this.vigenciaPerfil = vigenciaPerfil;
	}
	public int getEstadoPerfil() {
		return estadoPerfil;
	}
	public void setEstadoPerfil(int estadoPerfil) {
		this.estadoPerfil = estadoPerfil;
	}
}
