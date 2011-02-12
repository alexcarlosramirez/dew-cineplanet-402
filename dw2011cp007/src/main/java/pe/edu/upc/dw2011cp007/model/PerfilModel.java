package pe.edu.upc.dw2011cp007.model;

import java.util.HashMap;

public class PerfilModel {

	/**
	 * Identificador del perfil en la BD
	 */
	private int idPerfil;

	/**
	 * Nombre código del perfil en el sistema.
	 */
	private String nombrePerfil;

	/**
	 * Explicación general del perfil
	 */
	private String descripcionPerfil;

	/**
	 * Se estimará en días.
	 */
	private int vigenciaPerfil;
	
	/**
	 * Almacenará las funciones asignadas al perfil
	 */
	private HashMap<Integer, String> listadofuncion; 

	/**
	 * Estado:
	 * <ul>
	 * <li>0: Cancelado</li>
	 * <li>1: Activo</li>
	 * <li>2: Bloqueado</li>
	 * </ul>
	 */
	private int estadoPerfil;
	
	/*	0= Exitoso
	 * 	1= Error en logitud NombrePerfil
	 * 	2= Funcion ya asignada
	 */
	private int retorno;
	
	//private ArrayList<FuncionesModel> listaFunciones;


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
			retorno=1;
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
	public int getEstadoPerfil() {
		return estadoPerfil;
	}
	public void setEstadoPerfil(int estadoPerfil) {
		this.estadoPerfil = estadoPerfil;
	}
	/**
	 * @param listadofuncion the listadofuncion to set
	 */
	public void setListadofuncion(HashMap<Integer, String> listadofuncion) {		
		this.listadofuncion = listadofuncion;
	}
	/**
	 * @return the listadofuncion
	 */
	public HashMap<Integer, String> getListadofuncion() {
		return listadofuncion;
	}
}