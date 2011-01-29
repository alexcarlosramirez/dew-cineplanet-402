package pe.edu.upc.dw2011cp007.model;

public class UsuarioModel {

	private int idUsuario;
	private String nombreUsuario;
	private String apellidoUsuario;
	private String loginUsuario;
	private String passwordUsuario;
	private PerfilModel perfilModel;

	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getApellidoUsuario() {
		return apellidoUsuario;
	}
	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}
	public String getLoginUsuario() {
		return loginUsuario;
	}
	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}
	public String getPasswordUsuario() {
		return passwordUsuario;
	}
	public void setPasswordUsuario(String passwordUsuario) {
		this.passwordUsuario = passwordUsuario;
	}
	public PerfilModel getPerfilModel() {
		return perfilModel;
	}
	public void setPerfilModel(PerfilModel perfilModel) {
		this.perfilModel = perfilModel;
	}
}
