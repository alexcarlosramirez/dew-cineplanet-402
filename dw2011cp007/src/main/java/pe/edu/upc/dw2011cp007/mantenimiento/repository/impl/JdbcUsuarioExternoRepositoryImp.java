package pe.edu.upc.dw2011cp007.mantenimiento.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.edu.upc.dw2011cp007.mantenimiento.model.UsuarioExternoModel;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.UsuarioExternoRepository;

@Repository
public class JdbcUsuarioExternoRepositoryImp extends JdbcDaoSupport implements
		UsuarioExternoRepository {

	
	@Autowired
	public JdbcUsuarioExternoRepositoryImp(DataSource datasource) {
		// TODO Auto-generated constructor stub
		setDataSource(datasource);
	}

	public boolean grabarUsuario(UsuarioExternoModel usuarioExterno) {
		String sql="INSERT INTO cp_tb_Cliente (nologin,noApePaterno,noApeMaterno,noNombre," +
				"flPremium,txtemail,cotipodoc,nudocumento,noTelefono,txtDireccion,noContrasena," +
				"coEstadoUsuario,coEstadoPassword,feRegistro) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,SYSDATE()) ";
		int i= getJdbcTemplate().update(sql, usuarioExterno.getUserGenCodigo()
							,usuarioExterno.getUserGenApePaterno()
							,usuarioExterno.getUserGenApeMaterno()
							,usuarioExterno.getUserGenNombre()
							,usuarioExterno.isUsuarioExternoPremium()
							,usuarioExterno.getUserGenEmail()
							,usuarioExterno.getUserGenTipoDocumento()
							,usuarioExterno.getUserGenNumeroDocumento()
							,usuarioExterno.getUserGenTelefono()
							,usuarioExterno.getUsuarioExternoDireccion()
							,usuarioExterno.getUserGenUsuarioPassword()
							,usuarioExterno.getUserGenEstadoUsuario()
							,usuarioExterno.getUserGenEstadopassword()
							);
		// TODO Auto-generated method stub
		return i>0?true:false;
	}

	public UsuarioExternoModel buscarUsuarioExternoPorUsuario(
			String loginusuario) {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM cp_tb_Cliente where nologin=?";
		UsuarioExternoModel usuarioExterno;
		try{
			usuarioExterno= getJdbcTemplate().queryForObject(sql, 
					new Object[]{loginusuario}, new UsuarioExternoRowMapper());
		}catch (EmptyResultDataAccessException e) {
			return null;
			// TODO: handle exception
		}
		
		return usuarioExterno;
	}

	public boolean eliminarUsuario(String codigousuario) {
		String sql="delete from cp_tb_Cliente where nologin=?";
		int i=getJdbcTemplate().update(sql, codigousuario);
		// TODO Auto-generated method stub
		return i>0?true:false;
	}

	public boolean actualizarUsuario(UsuarioExternoModel usuarioExterno) {
		// TODO Auto-generated method stub
		String sql="update cp_tb_Cliente set noApePaterno=?,noApeMaterno=?,noNombre=?,cotipodoc=?," +
				"nudocumento=?,txtemail=?,flPremium=?,txtDireccion=?,noTelefono=?,noContrasena=?," +
				"coEstadoUsuario=?,coEstadoPassword=? where nologin=?";
		int i= getJdbcTemplate().update(sql, usuarioExterno.getUserGenApeMaterno()
							,usuarioExterno.getUserGenApeMaterno()
							,usuarioExterno.getUserGenNombre()
							,usuarioExterno.getUserGenTipoDocumento()
							,usuarioExterno.getUserGenNumeroDocumento()
							,usuarioExterno.getUserGenEmail()
							,usuarioExterno.isUsuarioExternoPremium()
							,usuarioExterno.getUsuarioExternoDireccion()
							,usuarioExterno.getUserGenTelefono()
							,usuarioExterno.getUserGenUsuarioPassword()
							,usuarioExterno.getUserGenEstadoUsuario()
							,usuarioExterno.getUserGenEstadopassword()
							,usuarioExterno.getUserGenCodigo()
							);
		return i>0?true:false;
	}
	
	private class UsuarioExternoRowMapper implements ParameterizedRowMapper<UsuarioExternoModel>{

		public UsuarioExternoModel mapRow(ResultSet rs, int rowNum) throws SQLException {
			UsuarioExternoModel usuarioex = new UsuarioExternoModel();
			usuarioex.setUserGenCodigo(rs.getString("nologin"));
			usuarioex.setUserGenApePaterno(rs.getString("noApePaterno"));
			usuarioex.setUserGenApeMaterno(rs.getString("noApeMaterno"));
			usuarioex.setUserGenNombre(rs.getString("noNombre"));
			usuarioex.setUserGenTipoDocumento(rs.getString("cotipodoc"));
			usuarioex.setUserGenNumeroDocumento(rs.getString("nudocumento"));
			usuarioex.setUserGenEmail(rs.getString("txtemail"));
			usuarioex.setUsuarioExternoPremium(rs.getBoolean("flPremium"));
			usuarioex.setUsuarioExternoDireccion(rs.getString("txtDireccion"));
			usuarioex.setUserGenTelefono(rs.getString("noTelefono"));
			usuarioex.setUserGenUsuarioPassword(rs.getString("noContrasena"));
			usuarioex.setUserGenEstadoUsuario(rs.getString("coEstadoUsuario"));
			usuarioex.setUserGenEstadopassword(rs.getString("coEstadoPassword"));
			usuarioex.setUserGenFechaRegistro(rs.getDate("feRegistro").toString());
			return usuarioex;
		}
	}	
}
