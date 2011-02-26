package pe.edu.upc.dw2011cp007.mantenimiento.model;

public class SalaModel {

	private int idSala;
	private String nombreSala;
	private CineModel cineModel;
	public int getIdSala() {
		return idSala;
	}
	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}
	public String getNombreSala() {
		return nombreSala;
	}
	public void setNombreSala(String nombreSala) {
		this.nombreSala = nombreSala;
	}
	public CineModel getCineModel() {
		return cineModel;
	}
	public void setCineModel(CineModel cineModel) {
		this.cineModel = cineModel;
	}
}
