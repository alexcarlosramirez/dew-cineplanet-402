package pe.edu.upc.dw2011cp007.repository;

import java.util.HashMap;

import pe.edu.upc.dw2011cp007.model.UsuarioExternoModel;
import pe.edu.upc.dw2011cp007.model.UsuarioModel;



public class UsuarioExternoRepository {

	private HashMap<Integer,UsuarioExternoModel> CtrlUsuarioExterno=new HashMap<Integer, UsuarioExternoModel>();
	
	public int grabarUsuarioExterno(int operacion, UsuarioExternoModel usuarioExterno) {
		CtrlUsuarioExterno.put(operacion, usuarioExterno);
		System.out.println("Se registro satisfactoriamente el Usuario " + operacion);
		//MOSTRAMOS LO GRABADO
		return 0;
	}

}
