package pe.edu.upc.dw2011cp007.seguridad.service.impl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.stereotype.Service;

import pe.edu.upc.dw2011cp007.mantenimiento.model.CineModel;
import pe.edu.upc.dw2011cp007.seguridad.model.UsuarioModel;
import pe.edu.upc.dw2011cp007.seguridad.repository.UsuarioRepository;
import pe.edu.upc.dw2011cp007.seguridad.service.SeguridadService;

@Service

public class SeguridadServiceImpl implements SeguridadService {

	private UsuarioRepository usuarioRepository;

	@Autowired
	public SeguridadServiceImpl(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	public boolean registrarUsuario(UsuarioModel usuarioModel) {
		return usuarioRepository.registrarUsuario(usuarioModel);
	}

	public boolean actualizarUsuario(UsuarioModel usuarioModel) {
		return usuarioRepository.modificarUsuario(usuarioModel);
	}

	public boolean eliminarUsuario(UsuarioModel usuarioModel) {
		return usuarioRepository.eliminarUsuario(usuarioModel);
	}
	public boolean generaCodigoUsuario(UsuarioModel usuarioModel) {
		return usuarioRepository.generaCodigoUsuario(usuarioModel);
	}
	
	
	public UsuarioModel buscarUsuarioPorId(String idUsuario) {
		ArrayList<UsuarioModel> listaUsuarioModel = usuarioRepository.buscarListaUsuario();
		for (UsuarioModel usuarioModel : listaUsuarioModel) {
			if (usuarioModel.getIdUsuario() == idUsuario)
				return usuarioModel;
		}
		return null;
	}
	public UsuarioModel buscarUsuarioPorNombre(String usuarioNombre) {
		ArrayList<UsuarioModel> listaUsuarioModel = usuarioRepository.buscarListaUsuario();
		for (UsuarioModel usuarioModel : listaUsuarioModel) {
			if (usuarioModel.getNombreUsuario().equals(usuarioNombre))
				return usuarioModel;
		}
		return null;
	}


}