package pe.edu.upc.dw2011cp007.mantenimiento.model;

public class UsuarioInternoModel extends UsuarioGenericoModel {
		
	
	private String userInternoUnidadTrabajo;
	private String userInternoPuestotrabajo;
	private String userInternoAnexo;
	private String userInternoJefeInmediato;
	
	
	
	public UsuarioInternoModel(String userGenCodigo, String userGenApePaterno,
			String userGenApeMaterno, String userGenNombre,
			String userGenTipoDocumento, String userGenNumeroDocumento,
			String userGenTelefono, String userGenEmail,
			String userGenEstadoUsuario, String userGenUsuarioPassword,
			String userGenEstadopassword, String userGenFechaRegistro,String userInternoUnidadTrabajo,
			String userInternoPuestotrabajo, String userInternoAnexo,
			String userInternoJefeInmediato) {
		super(userGenCodigo, userGenApePaterno, userGenApeMaterno, userGenNombre,
				userGenTipoDocumento, userGenNumeroDocumento, userGenTelefono,
				userGenEmail, userGenEstadoUsuario, userGenUsuarioPassword,
				userGenEstadopassword, userGenFechaRegistro);
		this.userInternoUnidadTrabajo = userInternoUnidadTrabajo;
		this.userInternoPuestotrabajo = userInternoPuestotrabajo;
		this.userInternoAnexo = userInternoAnexo;
		this.userInternoJefeInmediato = userInternoJefeInmediato;
		// TODO Auto-generated constructor stub
	}



	public UsuarioInternoModel() {
		// TODO Auto-generated constructor stub
	}


	public String getUserInternoUnidadTrabajo() {
		return userInternoUnidadTrabajo;
	}



	public void setUserInternoUnidadTrabajo(String userInternoUnidadTrabajo) {
		this.userInternoUnidadTrabajo = userInternoUnidadTrabajo;
	}



	public String getUserInternoPuestotrabajo() {
		return userInternoPuestotrabajo;
	}



	public void setUserInternoPuestotrabajo(String userInternoPuestotrabajo) {
		this.userInternoPuestotrabajo = userInternoPuestotrabajo;
	}



	public String getUserInternoAnexo() {
		return userInternoAnexo;
	}



	public void setUserInternoAnexo(String userInternoAnexo) {
		this.userInternoAnexo = userInternoAnexo;
	}



	public String getUserInternoJefeInmediato() {
		return userInternoJefeInmediato;
	}



	public void setUserInternoJefeInmediato(String userInternoJefeInmediato) {
		this.userInternoJefeInmediato = userInternoJefeInmediato;
	}



	@Override
	public boolean setUserGenCodigo(String userGenCodigo) {
		// TODO Auto-generated method stub
		boolean ret=false;
		if (userGenCodigo.length()>=10) {
			super.setUserGenCodigo(userGenCodigo);
			ret=true;
		}
		return ret;
	}
	
	
	private String generacodigousuario(){
		String codigo="";
		if (getUserGenNombre().length()>0 || getUserGenApePaterno().length()>0){
			codigo=getUserGenNombre().substring(0, 1)+getUserGenApePaterno();
			if (codigo.length()<10){
				codigo=(codigo+ getUserGenApeMaterno());
				if (codigo.length()>=10){
					codigo=	codigo.substring(0,10);
				}else{
					codigo=(codigo+getUserGenNombre().substring(1));
					if (codigo.length()>=10){
						codigo=codigo.substring(0, 10);
					}
				}
			}
		}
		//System.out.println(codigo);
		return codigo;
	}
	
	
	public boolean setcodigoautogenerado(){
		
		String autocodigo=generacodigousuario();
		boolean ret=this.setUserGenCodigo(autocodigo);
		return ret;
		
	}

}
