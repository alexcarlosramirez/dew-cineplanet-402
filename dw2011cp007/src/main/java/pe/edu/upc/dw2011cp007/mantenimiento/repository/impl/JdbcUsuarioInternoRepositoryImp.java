package pe.edu.upc.dw2011cp007.mantenimiento.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.edu.upc.dw2011cp007.mantenimiento.model.UsuarioInternoModel;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.UsuarioInternoRepository;

@Repository
public class JdbcUsuarioInternoRepositoryImp extends JdbcDaoSupport implements UsuarioInternoRepository {

	@Autowired
	public JdbcUsuarioInternoRepositoryImp(DataSource dataSource) {
		setDataSource(dataSource);
		// TODO Auto-generated constructor stub
	}

	public boolean grabarUsuario(UsuarioInternoModel usuarioInterno) {
		// TODO Auto-generated method stub
		
		String sql = "INSERT INTO cp_tb_empleado (coCodigo,noApePaterno,noApeMaterno,noNombre,cotipodoc," +
				"nudocumento,txtemail,noUnidadTrabajo,noPuestoTrabajo,noTelefono,noAnexo,coJefeInmediato," +
				"noContrasena,coEstadoEmpleado,coEstadoPassword,feRegistro)" +
				" VALUES (?, ?, ?, ?, ?, ?, ?," +
				" ?, ?,?, ?, ?, ?, ?, ?, SYSDATE());";
		
		int i = getJdbcTemplate().update(sql 
				,usuarioInterno.getUserGenCodigo()
				,usuarioInterno.getUserGenApePaterno() 
				,usuarioInterno.getUserGenApeMaterno()
				,usuarioInterno.getUserGenNombre()
				,usuarioInterno.getUserGenTipoDocumento()
				,usuarioInterno.getUserGenNumeroDocumento()
				,usuarioInterno.getUserGenEmail()
				,usuarioInterno.getUserInternoUnidadTrabajo()
				,usuarioInterno.getUserInternoPuestotrabajo()
				,usuarioInterno.getUserGenTelefono()
				,usuarioInterno.getUserInternoAnexo()
				,usuarioInterno.getUserInternoJefeInmediato()
				,usuarioInterno.getUserGenUsuarioPassword()
				,usuarioInterno.getUserGenEstadoUsuario()
				,usuarioInterno.getUserGenEstadopassword()
				);
		return i>0?true:false;
	}

	public UsuarioInternoModel buscarUsuarioInternoPorCodigo(String codigousuario) {
		// TODO Auto-generated method stub
		String sql="Select * from cp_tb_empleado where coCodigo=?";
		UsuarioInternoModel usuarioInterno;
		
		try{
			usuarioInterno= getJdbcTemplate().queryForObject(sql, 
					new Object[]{codigousuario}, new UsuarioInternoRowMapper());
		}catch (EmptyResultDataAccessException e) {
			return null;
			// TODO: handle exception
		}
		
		return usuarioInterno;
	}

	public boolean eliminarUsuario(String codigousuario) {
		// TODO Auto-generated method stub
		String sql="delete from cp_tb_empleado where coCodigo=?";
		int i=getJdbcTemplate().update(sql, codigousuario);
		
		return i>0?true:false;
	}

	public boolean actualizarUsuario(UsuarioInternoModel usuarioInterno) {
		// TODO Auto-generated method stub
		String sql="update cp_tb_empleado set cotipodoc=?,nudocumento=?,txtemail=?," +
				"noUnidadTrabajo=?,noPuestoTrabajo=?,noTelefono=?,noAnexo=?,coJefeInmediato=?," +
				"coEstadoEmpleado=?,coEstadoPassword=? where coCodigo=?";
		
		int i=getJdbcTemplate().update(sql
				,usuarioInterno.getUserGenTipoDocumento()
				,usuarioInterno.getUserGenNumeroDocumento()
				,usuarioInterno.getUserGenEmail()
				,usuarioInterno.getUserInternoUnidadTrabajo()
				,usuarioInterno.getUserInternoPuestotrabajo()
				,usuarioInterno.getUserGenTelefono()
				,usuarioInterno.getUserInternoAnexo()
				,usuarioInterno.getUserInternoJefeInmediato()
				,usuarioInterno.getUserGenEstadoUsuario()
				,usuarioInterno.getUserGenEstadopassword()
				,usuarioInterno.getUserGenCodigo());
		return i>0?true:false;
	}
	
	private class UsuarioInternoRowMapper implements ParameterizedRowMapper<UsuarioInternoModel>{

		public UsuarioInternoModel mapRow(ResultSet rs, int rowNum) throws SQLException {
			UsuarioInternoModel usuario = new UsuarioInternoModel();
			usuario.setUserGenCodigo(rs.getString("coCodigo"));
			usuario.setUserGenApePaterno(rs.getString("noApePaterno"));
			usuario.setUserGenApeMaterno(rs.getString("noApeMaterno"));
			usuario.setUserGenNombre(rs.getString("noNombre"));
			usuario.setUserGenTipoDocumento(rs.getString("cotipodoc"));
			usuario.setUserGenNumeroDocumento(rs.getString("nudocumento"));
			usuario.setUserGenEmail(rs.getString("txtemail"));
			usuario.setUserInternoUnidadTrabajo(rs.getString("noUnidadTrabajo"));
			usuario.setUserInternoPuestotrabajo(rs.getString("noPuestoTrabajo"));
			usuario.setUserGenTelefono(rs.getString("noTelefono"));
			usuario.setUserInternoAnexo(rs.getString("noAnexo"));
			usuario.setUserInternoJefeInmediato(rs.getString("coJefeInmediato"));
			usuario.setUserGenUsuarioPassword(rs.getString("noContrasena"));
			usuario.setUserGenEstadoUsuario(rs.getString("coEstadoEmpleado"));
			usuario.setUserGenEstadopassword(rs.getString("coEstadoPassword"));
			usuario.setUserGenFechaRegistro(rs.getDate("feRegistro").toString());
			return usuario;
		}
		
	}
	

}
