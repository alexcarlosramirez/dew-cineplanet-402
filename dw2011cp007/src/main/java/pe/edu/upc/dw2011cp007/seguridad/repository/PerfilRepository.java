package pe.edu.upc.dw2011cp007.seguridad.repository;


import pe.edu.upc.dw2011cp007.seguridad.model.PerfilModel;

public interface PerfilRepository {

	public boolean grabarperfil(PerfilModel perfilmodel);
	public PerfilModel buscarperfil(String perfil);
	public boolean actualizarPerfil(PerfilModel perfilModel);
	public boolean eliminarPerfil(String perfil);
	
	public int buscarfuncion(PerfilModel perfilmodel,String funcion);
	public int asignarfuncion(String perfil, String funcion);

}