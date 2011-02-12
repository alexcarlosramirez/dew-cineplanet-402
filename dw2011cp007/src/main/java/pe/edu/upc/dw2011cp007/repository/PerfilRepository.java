package pe.edu.upc.dw2011cp007.repository;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import pe.edu.upc.dw2011cp007.model.PerfilModel;

public class PerfilRepository {

	/*	Errores
	 *  0= Exitoso
	 * 	1= Error en logitud NombrePerfil
	 * 	2= Funcion ya asignada
	 */
	private HashMap<Integer,PerfilModel> CtrlPerfil=new HashMap<Integer, PerfilModel>();
	HashMap<Integer, String> listafunciones;
	

	public int asignarfuncion(String perfil, String funcion){
		int retorno=0;
		PerfilModel buscado=new PerfilModel();
		buscado=buscarperfil(perfil);
		
		int vretornado= buscarfuncion(buscado, funcion);
		if (vretornado==0){
			buscado.getListadofuncion().put(buscado.getListadofuncion().size()+1, funcion);
			System.out.println(buscado.getListadofuncion().size()+" "+ funcion +" Registrado");
		}
		retorno=vretornado;
		return retorno;
	}
	public int grabarperfil(int operacion,PerfilModel perfilmodel) {
		
		// TODO Auto-generated method stub
		//listafunciones= new HashMap<Integer, String>();
		perfilmodel.setIdPerfil(operacion);
		String nomperfil= perfilmodel.getNombrePerfil();
		PerfilModel ret=buscarperfil(nomperfil);
		if (ret != null){
			System.out.println("Nombre de Perfil ya existe");
			return 1;
		}else{
			CtrlPerfil.put(perfilmodel.getIdPerfil(), perfilmodel);
			System.out.println("Se registro satisfactoriamente el perfil " + perfilmodel.getIdPerfil()+" - "+perfilmodel.getNombrePerfil());
			return 0;
		}
	}
	
	public int buscarfuncion(PerfilModel perfilmodel,String funcion){
		int retorno=0;
		listafunciones=perfilmodel.getListadofuncion();
		Iterator it= listafunciones.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<Integer, String> lf=(Map.Entry<Integer, String>)it.next();
			if (lf.getValue().equals(funcion)){
				retorno=2;
			}
		}
		return retorno;
	}
	
	public PerfilModel buscarperfil(String perfil){
		PerfilModel retorno=null;
		Iterator itbp= CtrlPerfil.entrySet().iterator();
		while(itbp.hasNext()){
			Map.Entry<Integer, PerfilModel> lp=(Map.Entry<Integer, PerfilModel>)itbp.next();
			if (lp.getValue().getNombrePerfil().equals(perfil)){
				retorno=lp.getValue();
			}
		}
		return retorno;
	}

	
}