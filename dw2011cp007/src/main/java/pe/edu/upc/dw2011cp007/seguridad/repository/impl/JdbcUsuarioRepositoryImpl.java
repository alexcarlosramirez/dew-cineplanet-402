package pe.edu.upc.dw2011cp007.seguridad.repository.impl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.edu.upc.dw2011cp007.seguridad.model.UsuarioModel;
import pe.edu.upc.dw2011cp007.seguridad.repository.UsuarioRepository;

@Repository
public class JdbcUsuarioRepositoryImpl extends JdbcDaoSupport implements UsuarioRepository{


	@Autowired
	public JdbcUsuarioRepositoryImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public boolean registrarUsuario(UsuarioModel usuarioModel) {
		String sql = "insert into cp_tb_cine (no_cine) values (?)";
		int i = getJdbcTemplate().update(sql, usuarioModel.getIdUsuario());
		return i>0?true:false;
	}

	public boolean modificarUsuario(UsuarioModel usuarioModel) {
		String sql = "update cp_tb_cine set no_cine = ? where id_cine = ?";
		System.out.println(usuarioModel.getNombreUsuario() + ", " + usuarioModel.getIdUsuario());
		int i = getJdbcTemplate().update(sql, usuarioModel.getNombreUsuario(), usuarioModel.getIdUsuario());
		System.out.println(i);
		return i>0?true:false;
	}

	public boolean eliminarUsuario(UsuarioModel usuarioModel) {
		String sql = "delete from cp_tb_cine where id_cine = ?";
		int i = getJdbcTemplate().update(sql, usuarioModel.getIdUsuario());
		return i>0?true:false;
	}

	public ArrayList<UsuarioModel> buscarListaUsuario() {
		String sql = "select * from cp_tb_cine";
		ArrayList<UsuarioModel> listaPeliculaModel = (ArrayList<UsuarioModel>) getJdbcTemplate().query(sql, new UsuarioRowMapper());
		return listaPeliculaModel;
	}


class UsuarioRowMapper implements ParameterizedRowMapper<UsuarioModel> {

	public UsuarioModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		UsuarioModel usuarioModel = new UsuarioModel();
		usuarioModel.setIdUsuario(rs.getString("id_cine"));
		usuarioModel.setNombreUsuario(rs.getString("no_cine"));
		System.out.println(usuarioModel);
		return usuarioModel;
	}
}


}
