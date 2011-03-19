package pe.edu.upc.dw2011cp007.seguridad.repository;

import pe.edu.upc.dw2011cp007.seguridad.model.PerfilModel;

public interface PerfilDbRepository {

	public PerfilModel buscarperfil(String perfil);
	
	public int actualizarvigencia(String perfil, int vigencia)	;
	
	public String buscarfuncion(PerfilModel perfilmodel,String funcion);
	
	public int grabarperfil(PerfilModel perfilmodel);
	
	public int asignarfuncion(String perfil, String funcion);
	
}
