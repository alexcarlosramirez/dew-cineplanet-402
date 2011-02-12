package pe.edu.upc.dw2011cp007.repository;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import pe.edu.upc.dw2011cp007.model.PerfilModel;

public class PerfilRepository {
	private HashMap<Integer,PerfilModel> CtrlPerfil=new HashMap<Integer, PerfilModel>();
	private HashMap<Integer, String> listafunciones;
	private PerfilModel perfil;

	public int grabarperfil(int operacion,PerfilModel perfilmodel) {
		
		// TODO Auto-generated method stub
		//listafunciones= new HashMap<Integer, String>();
		perfilmodel.setIdPerfil(operacion);
		String nomperfil= perfilmodel.getNombrePerfil();
		int ret=buscarperfil(nomperfil);
		
		if (ret==1){
			System.out.println("Nombre de Perfil ya existe");
			return 1;
		}else{
			CtrlPerfil.put(perfilmodel.getIdPerfil(), perfilmodel);
			System.out.println("Se registro satisfactoriamente el perfil " + perfilmodel.getIdPerfil()+" - "+perfilmodel.getNombrePerfil());
			return 0;
		}
	}
	
	public int buscarfuncion(String funcion){
		int retorno=0;
		listafunciones=perfil.getListadofuncion();
		Iterator it= listafunciones.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<Integer, String> lf=(Map.Entry<Integer, String>)it.next();
			
		}
		
		return retorno;
	}
	
	public int buscarperfil(String perfil){
		//System.out.println("buscar " + perfil);
		int retorno=0;
		Iterator itbp= CtrlPerfil.entrySet().iterator();
		while(itbp.hasNext()){
			Map.Entry<Integer, PerfilModel> lp=(Map.Entry<Integer, PerfilModel>)itbp.next();
		//	System.out.println("recorre " + lp.getValue().getNombrePerfil());
			if (lp.getValue().getNombrePerfil().equals(perfil)){
				retorno=1;
			}
		}
		return retorno;
	}

}