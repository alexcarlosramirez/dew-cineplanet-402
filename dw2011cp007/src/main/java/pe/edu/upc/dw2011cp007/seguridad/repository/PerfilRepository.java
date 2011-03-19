package pe.edu.upc.dw2011cp007.seguridad.repository;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import pe.edu.upc.dw2011cp007.seguridad.model.PerfilModel;

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
		if (buscado==null){
			
			return 1;
		}
		int vretornado= buscarfuncion(buscado, funcion);
		if (vretornado==0){
			buscado.getListadofuncion().put(buscado.getListadofuncion().size()+1, funcion);
			System.out.println(buscado.getListadofuncion().size()+" "+ funcion +" Registrado");
		}
		retorno=vretornado;
		return retorno;
	}
	public HashMap<Integer, PerfilModel> getCtrlPerfil() {
		return CtrlPerfil;
	}
	public void setCtrlPerfil(HashMap<Integer, PerfilModel> ctrlPerfil) {
		CtrlPerfil = ctrlPerfil;
	}
	public int grabarperfil(PerfilModel perfilmodel) {
		
		// TODO Auto-generated method stub
		
		String nomperfil= perfilmodel.getNombrePerfil();
		PerfilModel ret=new PerfilModel();
		ret=buscarperfil(nomperfil);
		if (ret != null){
			System.out.println("Nombre de Perfil ya existe");
			return 1;
		}else{
			int id=CtrlPerfil.size()+1;
			perfilmodel.setIdPerfil(id);
			CtrlPerfil.put(id, perfilmodel);
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
	public int actualizarvigencia(String perfil, int vigencia) {
		// TODO Auto-generated method stub
		int retorno=0;
		PerfilModel buscado;
		buscado=buscarperfil(perfil);
		if (buscado==null){
			retorno=1;
		}
		buscado.setVigenciaPerfil(vigencia);
		return retorno;
	}

	
}