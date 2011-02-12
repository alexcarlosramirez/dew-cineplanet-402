package pe.edu.upc.dw2011cp007.repository;

import java.util.HashMap;
import java.util.Iterator;

import pe.edu.upc.dw2011cp007.model.PerfilModel;

public class PerfilRepository {
	private HashMap<Integer,PerfilModel> CtrlPerfil=new HashMap<Integer, PerfilModel>();
	private HashMap<Integer, String> listafunciones;
	private PerfilModel perfil;

	public void grabarperfil(PerfilModel perfilmodel) {
		
		// TODO Auto-generated method stub
		//listafunciones= new HashMap<Integer, String>();
		perfilmodel.setIdPerfil(1);
		CtrlPerfil.put(perfilmodel.getIdPerfil(), perfilmodel);
		System.out.println("Se registro satisfactoriamente el perfil" + perfilmodel.getIdPerfil()+" - "+perfilmodel.getNombrePerfil());
	}
	
	public int buscarfuncion(String funcion){
		int retorno=0;
		listafunciones=perfil.getListadofuncion();
		Iterator it= listafunciones.entrySet().iterator();
		while(it.hasNext()){
			
		}
		
		return retorno;
	}

}