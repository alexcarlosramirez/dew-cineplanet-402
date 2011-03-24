package pe.edu.upc.dw2011cp007.mantenimiento.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.dw2011cp007.mantenimiento.model.UsuarioInternoModel;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.UsuarioInternoRepository;
import pe.edu.upc.dw2011cp007.mantenimiento.service.AdministraUserInternoService;

@Service

public class AdministraUserInternoServiceImpl implements AdministraUserInternoService {

	private UsuarioInternoRepository usuarioInternoRepository;

	@Autowired
	public AdministraUserInternoServiceImpl(UsuarioInternoRepository usuarioInternoRepository) {
		this.usuarioInternoRepository = usuarioInternoRepository;
	}

	public boolean registrarUsuario(UsuarioInternoModel usuarioInternoModel) {
		return usuarioInternoRepository.grabarUsuario(usuarioInternoModel);
	}

	public boolean actualizarUsuario(UsuarioInternoModel usuarioInternoModel) {
		return usuarioInternoRepository.actualizarUsuario(usuarioInternoModel);
	}

	public boolean eliminarUsuario(UsuarioInternoModel usuarioInternoModel) {
		return usuarioInternoRepository.eliminarUsuario(usuarioInternoModel.getUserGenCodigo());
	}
	
	public UsuarioInternoModel buscarUsuarioPorId(String idUsuario) {

		return usuarioInternoRepository.buscarUsuarioInternoPorCodigo(idUsuario); 
	}
	

}