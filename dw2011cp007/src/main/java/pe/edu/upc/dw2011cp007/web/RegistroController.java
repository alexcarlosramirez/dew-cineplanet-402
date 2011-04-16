package pe.edu.upc.dw2011cp007.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pe.edu.upc.dw2011cp007.mantenimiento.model.UsuarioExternoModel;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.UsuarioExternoRepository;

@Controller
public class RegistroController {

	@Autowired
	UsuarioExternoRepository usuarioExternoRepository;
	@RequestMapping(value="/publico_registraruser")
	
	public String registrarUsuarioExterno(
		@RequestParam("txtemail") String userGenEmail
		,@RequestParam(value="txtpass1") String userGenUsuarioPassword
		, @RequestParam("txtpaterno") String userGenApePaterno
		, @RequestParam("txtmaterno") String userGenApeMaterno
		, @RequestParam(value="txtnombre") String userGenNombre
		, @RequestParam("txtdireccion") String usuarioExternoDireccion
		, @RequestParam("txtdni") String userGenNumeroDocumento
		, @RequestParam("txttelefono") String userGenTelefono
		, Model model) {
		
		UsuarioExternoModel usuarioExternoModel= new UsuarioExternoModel();
		usuarioExternoModel.setUserGenCodigo("PRUEBA01");
		usuarioExternoModel.setUserGenApePaterno(userGenApePaterno);
		usuarioExternoModel.setUserGenApeMaterno(userGenApeMaterno);
		usuarioExternoModel.setUserGenNombre(userGenNombre);
		usuarioExternoModel.setUserGenTelefono(userGenTelefono);
		usuarioExternoModel.setUsuarioExternoDireccion(usuarioExternoDireccion);
		usuarioExternoModel.setUserGenEmail(userGenEmail);
		usuarioExternoModel.setUserGenTipoDocumento("1");
		usuarioExternoModel.setUserGenNumeroDocumento(userGenNumeroDocumento);
		usuarioExternoModel.setUsuarioExternoPremium(false);
		usuarioExternoModel.setUserGenUsuarioPassword(userGenUsuarioPassword);
		usuarioExternoModel.setUserGenEstadopassword("2");
		usuarioExternoModel.setUserGenEstadoUsuario("0");
		usuarioExternoRepository.grabarUsuario(usuarioExternoModel);
		
	return "publico/registro_ok";
	}	
}