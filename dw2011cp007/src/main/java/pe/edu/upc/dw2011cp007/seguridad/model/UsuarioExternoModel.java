package pe.edu.upc.dw2011cp007.seguridad.model;

import java.util.HashMap;


public class UsuarioExternoModel {


	private String email;
	private String clave;
	private String nombres;
	

	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

}