package pe.edu.upc.dw2011cp007.seguridad.model;

import java.util.List;

public class PerfilModel {

	private int idPerfil;
	private String nombrePerfil;
	private String descripcionPerfil;
	private int vigenciaPerfil;
	private List<FuncionModel> funciones;
	private String estadoPerfil;
	
	private int retorno;
	
	public int getIdPerfil() {
		return idPerfil;
	}
	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
		
	}
	public String getNombrePerfil() {
		return nombrePerfil;
	}
	public int setNombrePerfil(String nombrePerfil) {
		retorno=0;
		if (nombrePerfil.length()>=5 && nombrePerfil.length()<=30 ){
			this.nombrePerfil = nombrePerfil;
			
		}else{
			retorno=-1;
		}
		return retorno;
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
	public String getEstadoPerfil() {
		return estadoPerfil;
	}
	
	/**
	 * Estado:
	 * <ul>
	 * <li>0: Cancelado</li>
	 * <li>1: Activo</li>
	 * <li>2: Bloqueado</li>
	 * </ul>
	 */
	public void setEstadoPerfil(String estadoPerfil) {
		this.estadoPerfil = estadoPerfil;
	}
	public List<FuncionModel> getFunciones() {
		return funciones;
	}
	public void setFunciones(List<FuncionModel> funciones) {
		this.funciones = funciones;
	}
	
}