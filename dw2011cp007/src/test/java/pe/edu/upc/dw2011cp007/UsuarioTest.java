package pe.edu.upc.dw2011cp007;

import java.util.Iterator;
import java.util.Map;

import org.junit.*;

import pe.edu.upc.dw2011cp007.model.PerfilModel;
import pe.edu.upc.dw2011cp007.model.UsuarioModel;
import pe.edu.upc.dw2011cp007.repository.UsuarioRepository;
import static org.junit.Assert.*;//importar todos los metodos estaticos
  
public class UsuarioTest {

	UsuarioRepository repository = new UsuarioRepository();
	
	@Test //recordar que esto identifica que es un metodo de prueba
	public void grabarUsuario() {
		
		
		
		//DATOS A ENVIAR PARA EL INGRESO DE USUARIO
		UsuarioModel usuario = new UsuarioModel();
		usuario.setApellidoPaternoUsuario("Lopez");
		usuario.setApellidoMaternoUsuario("Vitor")	;	
		usuario.setNombreUsuario("Yonni");
		usuario.setUnidadTrabajo("Unidad 1");
		usuario.setTelefonoAnexo("4261591-116");
		usuario.setCorreo("u201021071@upc.edu.pe");
		usuario.setJefeInmediato("Loquillo");
		usuario.setTipoDocumento("DNI");
		usuario.setNumeroDocumento("43689535");
		usuario.setPasswordUsuario("");
		usuario.setEstadoPassword("Vencida");
		usuario.setEstadoUsuario("Activo");  //Activo, Suspendido o Bloqueado. 
		usuario.setNroVecesLoguedo(0);//numero de veces logueado

		//se llama al metodo grabar
		int retorno=0;
		retorno=repository.grabarUsuario(1,usuario);
		assertTrue("No se grabo el Usuario error: "+ retorno,retorno==0);
		
		//////INGRESO DE USUARIO 2 //////////
		//DATOS A ENVIAR PARA EL INGRESO DE USUARIO
		UsuarioModel usuario2 = new UsuarioModel();
		usuario2.setApellidoPaternoUsuario("Maita");
		usuario2.setApellidoMaternoUsuario("xxxx")	;	
		usuario2.setNombreUsuario("Romeo");
		usuario2.setUnidadTrabajo("Unidad 2");
		usuario2.setTelefonoAnexo("4261591-116");
		usuario2.setCorreo("Uxxxxxx@upc.edu.pe");
		usuario2.setJefeInmediato("Chayane");
		usuario2.setTipoDocumento("DNI");
		usuario2.setNumeroDocumento("45497987");
		usuario2.setPasswordUsuario("");
		usuario2.setEstadoPassword("Vencida");
		usuario2.setEstadoUsuario("Activo");  //Activo, Suspendido o Bloqueado. 
		usuario2.setNroVecesLoguedo(0);//numero de veces logueado

		//se llama al metodo grabar
		retorno=0;
		retorno=repository.grabarUsuario(2,usuario2);
		assertTrue("No se grabo el Usuario error: "+ retorno,retorno==0);
			
		
	}
	
	@Test
	public void loguearusuario(){
	/////LOGUEAR UDUARIO
		int retorno;
		retorno=0;
		grabarUsuario();
		//*LOGUEARUSUARIO (INTENTO NRO,USUARIO,PASSWORD)*//
		String idUsuarioant="";
		int i=0;
		int numIntentos=0;
		
			while ( i<4 ) {
		
			i++;
			String idUsuario="YLopezVito";
			String password="YLopezVito";
			if (numIntentos > 0 && idUsuario==idUsuarioant){
				numIntentos++;
			}
			else	{
				numIntentos=1;
			}
			retorno=repository.loguearUsuario(numIntentos,idUsuario,password);
			if (retorno==0){
				i=4;
			}
			idUsuarioant=idUsuario;
			if (retorno==2){
				retorno=0;
			}
			assertTrue("Fin Logueo: "+ retorno,retorno==0);

		} 
	}
	
}
