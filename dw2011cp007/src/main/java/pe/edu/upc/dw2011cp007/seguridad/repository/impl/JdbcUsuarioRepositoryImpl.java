package pe.edu.upc.dw2011cp007.seguridad.repository.impl;
import static org.junit.Assert.assertNotNull;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.edu.upc.dw2011cp007.mantenimiento.model.CineModel;
import pe.edu.upc.dw2011cp007.seguridad.model.UsuarioModel;
import pe.edu.upc.dw2011cp007.seguridad.repository.UsuarioRepository;

@Repository
public class JdbcUsuarioRepositoryImpl extends JdbcDaoSupport implements UsuarioRepository{


	@Autowired
	public JdbcUsuarioRepositoryImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}
	

	
	public boolean registrarUsuario(UsuarioModel usuarioModel) {
		
		/*
		if (GeneraCodigoUsuario(usuarioModel)==1){
			return false ;
		}
		*/
		if (ValidamosIngresoUsuario(usuarioModel,2)==1){
			return false ;
		}
		

		String sql = "insert into cp_tb_userinterno (id_usuario,no_apepaterno,no_apematerno,no_nombreusuario,no_unidadtrabajo,no_puestolaboral,nu_telefono,nu_anexo,no_email,id_jefeinmediato,no_tipodoc,no_numdoc,no_password,no_estadousuario) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		int i = getJdbcTemplate().update(sql, 
				usuarioModel.getIdUsuario(),
				usuarioModel.getApellidoPaternoUsuario(),
				usuarioModel.getApellidoMaternoUsuario(),
				usuarioModel.getNombreUsuario(),
				usuarioModel.getUnidadTrabajo(),
				usuarioModel.getPuestoLaboral(),
				usuarioModel.getTelefonoAnexo(),
				usuarioModel.getNroAnexo(),
				usuarioModel.getCorreo(),
				usuarioModel.getJefeInmediato(),
				usuarioModel.getTipoDocumento(),
				usuarioModel.getNumeroDocumento(),
				usuarioModel.getPasswordUsuario(),
				usuarioModel.getEstadoUsuario()
				);
		return i>0?true:false;
	}

	public boolean modificarUsuario(UsuarioModel usuarioModel) {
		String sql = "update cp_tb_userinterno set no_nombreusuario = ? where id_usuario = ?";
		System.out.println(usuarioModel.getNombreUsuario() + ", " + usuarioModel.getIdUsuario());
		int i = getJdbcTemplate().update(sql, usuarioModel.getNombreUsuario(), usuarioModel.getIdUsuario());
		System.out.println(i);
		return i>0?true:false;
	}

	
	public boolean eliminarUsuario(UsuarioModel usuarioModel) {
		String sql = "delete from cp_tb_userinterno where id_usuario = ?";
		int i = getJdbcTemplate().update(sql, usuarioModel.getIdUsuario());
		return i>0?true:false;
	}

	public ArrayList<UsuarioModel> buscarListaUsuario() {
		String sql = "select * from cp_tb_userinterno";
		ArrayList<UsuarioModel> listaUsuarioModel = (ArrayList<UsuarioModel>) getJdbcTemplate().query(sql, new UsuarioRowMapper());
		return listaUsuarioModel;
	}


class UsuarioRowMapper implements ParameterizedRowMapper<UsuarioModel> {

	public UsuarioModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		UsuarioModel usuarioModel = new UsuarioModel();
		usuarioModel.setIdUsuario(rs.getString("id_usuario"));
		usuarioModel.setNombreUsuario(rs.getString("no_nombreusuario"));
		System.out.println(usuarioModel);
		return usuarioModel;
	}
}
public boolean generaCodigoUsuario(UsuarioModel usuario) {
	
	if  (ValidamosIngresoUsuario(usuario,1) ==1) {
		return false;
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
	
	return true;
	
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

}
