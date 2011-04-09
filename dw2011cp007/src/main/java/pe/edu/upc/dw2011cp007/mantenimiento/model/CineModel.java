package pe.edu.upc.dw2011cp007.mantenimiento.model;

import java.io.Serializable;


@SuppressWarnings("serial")
public class CineModel implements Serializable {

	private Integer idCine;
	private String nombrecine;
	private String observacion;
	private String direccion;
	private String telefono;
	private String rutaimagen;

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

	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getRutaimagen() {
		return rutaimagen;
	}
	public void setRutaimagen(String rutaimagen) {
		this.rutaimagen = rutaimagen;
	}
	@Override
	public String toString() {
		return idCine + " = " + nombrecine;
	}
}
