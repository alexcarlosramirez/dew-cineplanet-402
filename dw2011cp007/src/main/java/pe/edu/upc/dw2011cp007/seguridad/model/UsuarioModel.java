package pe.edu.upc.dw2011cp007.seguridad.model;

import java.util.HashMap;

import pe.edu.upc.dw2011cp007.seguridad.repository.PerfilRepository;

public class UsuarioModel {

	private String idUsuario;	
	private String apellidoPaternoUsuario;
	private String apellidoMaternoUsuario;
	private String nombreUsuario;
	private String unidadTrabajo;
	private String telefonoAnexo;
	private String correo;
	private String jefeInmediato;
	private String tipoDocumento;
	private String numeroDocumento;
	private String PasswordUsuario;
	private String EstadoPassword;
	private String EstadoUsuario;
	private int NroVecesLoguedo;
	private PerfilRepository perfiles_asignados;
	
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getApellidoPaternoUsuario() {
		return apellidoPaternoUsuario;
	}
	public void setApellidoPaternoUsuario(String apellidoPaternoUsuario) {
		this.apellidoPaternoUsuario = apellidoPaternoUsuario;
	}
	public String getApellidoMaternoUsuario() {
		return apellidoMaternoUsuario;
	}
	public void setApellidoMaternoUsuario(String apellidoMaternoUsuario) {
		this.apellidoMaternoUsuario = apellidoMaternoUsuario;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getUnidadTrabajo() {
		return unidadTrabajo;
	}
	public void setUnidadTrabajo(String unidadTrabajo) {
		this.unidadTrabajo = unidadTrabajo;
	}
	public String getTelefonoAnexo() {
		return telefonoAnexo;
	}
	public void setTelefonoAnexo(String telefonoAnexo) {
		this.telefonoAnexo = telefonoAnexo;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getJefeInmediato() {
		return jefeInmediato;
	}
	public void setJefeInmediato(String jefeInmediato) {
		this.jefeInmediato = jefeInmediato;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getPasswordUsuario() {
		return PasswordUsuario;
	}
	public void setPasswordUsuario(String passwordUsuario) {
		PasswordUsuario = passwordUsuario;
	}
	public String getEstadoPassword() {
		return EstadoPassword;
	}
	public void setEstadoPassword(String estadoPassword) {
		EstadoPassword = estadoPassword;
	}
	public String getEstadoUsuario() {
		return EstadoUsuario;
	}
	public void setEstadoUsuario(String estadoUsuario) {
		EstadoUsuario = estadoUsuario;
	}
	public int getNroVecesLoguedo() {
		return NroVecesLoguedo;
	}
	public void setNroVecesLoguedo(int nroVecesLoguedo) {
		NroVecesLoguedo = nroVecesLoguedo;
	}
	public void setPerfiles_asignados(PerfilRepository perfiles_asignados) {
		this.perfiles_asignados = perfiles_asignados;
	}
	public PerfilRepository getPerfiles_asignados() {
		return perfiles_asignados;
	}


	
	
}
