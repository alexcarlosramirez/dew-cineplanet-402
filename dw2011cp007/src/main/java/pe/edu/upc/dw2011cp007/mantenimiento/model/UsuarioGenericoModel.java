package pe.edu.upc.dw2011cp007.mantenimiento.model;

public class UsuarioGenericoModel {
	
	private String userGenCodigo;
	private String userGenApePaterno;
	private String userGenApeMaterno;
	private String userGenNombre;
	private String userGenTipoDocumento;
	private String userGenNumeroDocumento;
	private String userGenTelefono;
	private String userGenEmail;
	private String userGenEstadoUsuario;
	private String userGenUsuarioPassword;
	private String userGenEstadopassword;
	private String userGenFechaRegistro;
	
	public UsuarioGenericoModel(){
		
	}
	
	public UsuarioGenericoModel(String userGenCodigo, String userGenApePaterno,
			String userGenApeMaterno, String userGenNombre,
			String userGenTipoDocumento, String userGenNumeroDocumento,
			String userGenTelefono, String userGenEmail,
			String userGenEstadoUsuario, String userGenUsuarioPassword,
			String userGenEstadopassword, String userGenFechaRegistro) {
		super();
		this.userGenCodigo = userGenCodigo;
		this.userGenApePaterno = userGenApePaterno;
		this.userGenApeMaterno = userGenApeMaterno;
		this.userGenNombre = userGenNombre;
		this.userGenTipoDocumento = userGenTipoDocumento;
		this.userGenNumeroDocumento = userGenNumeroDocumento;
		this.userGenTelefono = userGenTelefono;
		this.userGenEmail = userGenEmail;
		this.userGenEstadoUsuario = userGenEstadoUsuario;
		this.userGenUsuarioPassword = userGenUsuarioPassword;
		this.userGenEstadopassword = userGenEstadopassword;
		this.userGenFechaRegistro = userGenFechaRegistro;
	}

	public String getUserGenCodigo() {
		return userGenCodigo;
	}

	public boolean setUserGenCodigo(String userGenCodigo) {
		this.userGenCodigo = userGenCodigo;
		return true;
	}

	public String getUserGenApePaterno() {
		return userGenApePaterno;
	}

	public void setUserGenApePaterno(String userGenApePaterno) {
		this.userGenApePaterno = userGenApePaterno;
	}

	public String getUserGenApeMaterno() {
		return userGenApeMaterno;
	}

	public void setUserGenApeMaterno(String userGenApeMaterno) {
		this.userGenApeMaterno = userGenApeMaterno;
	}

	public String getUserGenNombre() {
		return userGenNombre;
	}

	public void setUserGenNombre(String userGenNombre) {
		this.userGenNombre = userGenNombre;
	}

	public String getUserGenTipoDocumento() {
		return userGenTipoDocumento;
	}

	public void setUserGenTipoDocumento(String userGenTipoDocumento) {
		this.userGenTipoDocumento = userGenTipoDocumento;
	}

	public String getUserGenNumeroDocumento() {
		return userGenNumeroDocumento;
	}

	public void setUserGenNumeroDocumento(String userGenNumeroDocumento) {
		this.userGenNumeroDocumento = userGenNumeroDocumento;
	}

	public String getUserGenTelefono() {
		return userGenTelefono;
	}

	public void setUserGenTelefono(String userGenTelefono) {
		this.userGenTelefono = userGenTelefono;
	}

	public String getUserGenEmail() {
		return userGenEmail;
	}

	public void setUserGenEmail(String userGenEmail) {
		this.userGenEmail = userGenEmail;
	}

	public String getUserGenEstadoUsuario() {
		return userGenEstadoUsuario;
	}

	public void setUserGenEstadoUsuario(String userGenEstadoUsuario) {
		this.userGenEstadoUsuario = userGenEstadoUsuario;
	}

	public String getUserGenUsuarioPassword() {
		return userGenUsuarioPassword;
	}

	public void setUserGenUsuarioPassword(String userGenUsuarioPassword) {
		this.userGenUsuarioPassword = userGenUsuarioPassword;
	}

	public String getUserGenEstadopassword() {
		return userGenEstadopassword;
	}

	public void setUserGenEstadopassword(String userGenEstadopassword) {
		this.userGenEstadopassword = userGenEstadopassword;
	}

	public String getUserGenFechaRegistro() {
		return userGenFechaRegistro;
	}

	public void setUserGenFechaRegistro(String userGenFechaRegistro) {
		this.userGenFechaRegistro = userGenFechaRegistro;
	}
	
	
		
	
	
}
