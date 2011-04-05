package pe.edu.upc.dw2011cp007.mantenimiento.model;

import java.io.Serializable;


@SuppressWarnings("serial")
public class CineModel implements Serializable {

	private Integer idCine;
	private String nombrecine;

	public Integer getIdCine() {
		return idCine;
	}
	public void setIdCine(Integer idCine) {
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
