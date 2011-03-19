package pe.edu.upc.dw2011cp007.seguridad.repository;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


import pe.edu.upc.dw2011cp007.seguridad.model.PerfilModel;
import pe.edu.upc.dw2011cp007.seguridad.model.UsuarioModel;

/**
 * Clase encargada de la administración del UsuarioModel
 * @author u201021418
 *
 */
public class UsuarioRepository {
	private HashMap<Integer,UsuarioModel> CtrlUsuario=new HashMap<Integer, UsuarioModel>();
	/**
	 * Graba usuario
	 * @param usuario
	 */
	
	public int GeneraCodigoUsuario(UsuarioModel usuario) {
	
		if  (ValidamosIngresoUsuario(usuario,1) ==1) {
			return 1;
		}
		
		String generaCodigo=(usuario.getNombreUsuario().substring(0,1) ) + usuario.getApellidoPaternoUsuario() ;

		
		if (generaCodigo.length()< 10) {
			generaCodigo=(generaCodigo + usuario.getApellidoMaternoUsuario()).substring(0,10);
		};
		
		if (generaCodigo.length()< 10) {
			generaCodigo=(generaCodigo + (usuario.getNombreUsuario().substring(1,usuario.getNombreUsuario().length()))).substring(0,10);
		};
		
		usuario.setIdUsuario(generaCodigo);
		usuario.setPasswordUsuario(generaCodigo);
		
		return 0;
		
	}
	
	
	public HashMap<Integer, UsuarioModel> getCtrlUsuario() {
		return CtrlUsuario;
	}


	public int ValidamosIngresoUsuario(UsuarioModel usuario,int tipo) {
	
		
		if  (tipo==1) {

			if (usuario.getNombreUsuario().equals("")) {
				System.out.println("Debe ingresar Nombre de Usuario" );
				return 1;
			}
			if (usuario.getApellidoPaternoUsuario().equals("")) {
				System.out.println("Debe ingresar Apellido Paterno" );
				return 1;
			}			
			if (usuario.getApellidoMaternoUsuario().equals("")) {
				System.out.println("Debe ingresar Apellido Materno" );
				return 1;
			}			
			
		}
		

		
		if  (tipo==2) {
			if (usuario.getIdUsuario().length()< 10) {
				System.out.println("El codigo contiene menos de 10 Caracteres" );
				return 1;
			}
			
			if (usuario.getIdUsuario().equals("")) {
				System.out.println("El codigo no cumple con las condciones especificadas" );
				return 1;
			}
		}
		
		return 0;
	}	
	
	
	
	public int verificaDuplicidadUsuario(String nroDocumento,String nomApeUsuario){
		//System.out.println("buscar " + nroDocumento);
		
		Iterator itbp= CtrlUsuario.entrySet().iterator();
		while(itbp.hasNext()){
			Map.Entry<Integer, UsuarioModel> lp=(Map.Entry<Integer, UsuarioModel>)itbp.next();
			
			if (lp.getValue().getNumeroDocumento().equals(nroDocumento) )    {
				System.out.println("El Numero de Documento ya existe");
				return 1;
			}
			 if ((lp.getValue().getNombreUsuario() + lp.getValue().getApellidoPaternoUsuario() + lp.getValue().getApellidoPaternoUsuario()).equals(nomApeUsuario)) {
				 System.out.println("El Nombre y apellido del usuario ya existe");
				 return 1;
			 }

		}
		return 0;
	}
	
	public int grabarUsuario(int operacion,UsuarioModel usuario) {

		String nroDocumento= usuario.getNumeroDocumento();
		String nomApeUsuario= (usuario.getNombreUsuario() + usuario.getApellidoPaternoUsuario() + usuario.getApellidoPaternoUsuario());
		
		if  (verificaDuplicidadUsuario(nroDocumento,nomApeUsuario)==1){
			return 1 ;
		}
		if (GeneraCodigoUsuario(usuario)==1){
			return 1 ;
		}
		if (ValidamosIngresoUsuario(usuario,2)==1){
			return 1 ;
		}		

			CtrlUsuario.put(operacion, usuario);
			System.out.println("Se registro satisfactoriamente el Usuario " + operacion);
			//MOSTRAMOS LO GRABADO
			System.out.println("Codigo Usuario      :" + usuario.getIdUsuario());		
			System.out.println("Usuario             :" + usuario.getNombreUsuario() + " " + usuario.getApellidoPaternoUsuario() + " " + usuario.getApellidoMaternoUsuario()     );
			System.out.println("Unidad de trabajo   :" + usuario.getUnidadTrabajo ());
			System.out.println("Telefono y Anexo    :" + usuario.getTelefonoAnexo ());
			System.out.println("Correo              :" + usuario.getCorreo());
			System.out.println("jefe Inmediato      :" + usuario.getJefeInmediato());
			System.out.println("Tipo de Documento   :" + usuario.getTipoDocumento());
			System.out.println("Nro. Documento      :" + usuario.getNumeroDocumento());
			System.out.println("Password            :" + usuario.getPasswordUsuario());
			System.out.println("Estado Password     :" + usuario.getEstadoPassword());
			System.out.println("Estado Usuario      :" + usuario.getEstadoUsuario());
			System.out.println("Nro de Ingresos     :" + usuario.getNroVecesLoguedo());	
			System.out.println("--------------------------------");
			return 0;

	}

	
	public int VerificarLogueo(String idUsuario) {
		
		Iterator itbp= CtrlUsuario.entrySet().iterator();
		while(itbp.hasNext()){
			
			Map.Entry<Integer, UsuarioModel> lp=(Map.Entry<Integer, UsuarioModel>)itbp.next();
			if (lp.getValue().getIdUsuario().equals(idUsuario) )    {
				return lp.getValue().getNroVecesLoguedo();
			}
			
		}
		return 0;
	}
	

	public int ValidarPassword(String idUsuario,String Password){
		//System.out.println("buscar " + nroDocumento);

		Iterator itbp= CtrlUsuario.entrySet().iterator();
		while(itbp.hasNext()){
			Map.Entry<Integer, UsuarioModel> lp=(Map.Entry<Integer, UsuarioModel>)itbp.next();
			
			if (lp.getValue().getIdUsuario().equals(idUsuario) )     {
				if (lp.getValue().getPasswordUsuario().equals(Password) )     {
					return 0;
				}
				else {
					  return 1;
				}
			}

		}
		
			  return 2;
	}
	
	
	
	public int loguearUsuario(int i, String idUsuario, String Password) {
		// TODO Auto-generated method stub
		
		
		
		if (ValidarPassword(idUsuario,Password)==1){
			System.out.println("contraseña Incorrecta -- intento " + i);
			
			if (i==4){
				System.out.println("ha superado el limite de intentos, su cuenta sera bloqueda ");	
				return 1;
			}
			
			return 2;
		}
		
		if (ValidarPassword(idUsuario,Password)==2){
			System.out.println("id No existe");
			return 1;
		}
		if (ValidarPassword(idUsuario,Password)==0){
			System.out.println("Usuario y clave correcta");
			if (VerificarLogueo(idUsuario)==0){
				System.out.println("Debe Cambiar su clave");
			}

			return 0;
		}		

		return 0;
	}
	
}
