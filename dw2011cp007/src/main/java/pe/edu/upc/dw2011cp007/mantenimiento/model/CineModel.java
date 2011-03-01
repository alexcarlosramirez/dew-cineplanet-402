package pe.edu.upc.dw2011cp007.mantenimiento.model;


public class CineModel {

	private int idCine;
	private String nombrecine;

	public int getIdCine() {
		return idCine;
	}
	public void setIdCine(int idCine) {
		this.idCine = idCine;
	}
	public String getNombrecine() {
		return nombrecine;
	}
	public void setNombrecine(String nombrecine) {
		this.nombrecine = nombrecine;
	}

	@Override
	public String toString() {
		return idCine + " = " + nombrecine;
	}
}
