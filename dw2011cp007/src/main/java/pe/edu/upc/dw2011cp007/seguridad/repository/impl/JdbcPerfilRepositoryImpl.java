package pe.edu.upc.dw2011cp007.seguridad.repository.impl;


import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.edu.upc.dw2011cp007.seguridad.model.PerfilModel;
import pe.edu.upc.dw2011cp007.seguridad.repository.PerfilRepository;

@Repository
public class JdbcPerfilRepositoryImpl extends JdbcDaoSupport implements PerfilRepository {

	@Autowired
	public JdbcPerfilRepositoryImpl(DataSource datasource) {
		setDataSource(datasource);
		// TODO Auto-generated constructor stub
	}

	public PerfilModel buscarperfil(String perfil) {
		// TODO Auto-generated method stub
		String sql="select * from cp_tb_Perfil where noPerfil=?";
		PerfilModel perfilModel;
		try{
			perfilModel=getJdbcTemplate().queryForObject(sql,
					new Object[]{perfil},new PerfilRowMapper());
		}catch (EmptyResultDataAccessException e) {
			// TODO: handle exception
			return null;
		}
		return perfilModel;
	}

	public boolean actualizarPerfil(PerfilModel perfilModel) {
		// TODO Auto-generated method stub
		String sql="update cp_tb_Perfil set txtDescripcion=?,nuvigencia=?" +
				",coestadoPerfil=? where idPerfil=?";
		int i=getJdbcTemplate().update(sql, perfilModel.getDescripcionPerfil()
							,perfilModel.getVigenciaPerfil()
							,perfilModel.getEstadoPerfil()
							,perfilModel.getIdPerfil()
							);
		return i>0? true:false;
	}
	
	public boolean eliminarPerfil(String perfil) {
		// TODO Auto-generated method stub
		String sql="delete from cp_tb_Perfil where noPerfil=?";
		int i=getJdbcTemplate().update(sql, perfil);
		return i>0? true:false;
	}	
	
	public int buscarfuncion(PerfilModel perfilmodel, String funcion) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean grabarperfil(PerfilModel perfilmodel) {
		// TODO Auto-generated method stub
		String sql="insert into cp_tb_Perfil(noPerfil,txtDescripcion,nuvigencia" +
				",coestadoPerfil) VALUES(?,?,?,?)";
		int i = getJdbcTemplate().update(sql, perfilmodel.getNombrePerfil()
							,perfilmodel.getDescripcionPerfil()
							,perfilmodel.getVigenciaPerfil()
							,perfilmodel.getEstadoPerfil()
							);
		return i>0?true:false;
	}

	public int asignarfuncion(String perfil, String funcion) {
		// TODO Auto-generated method stub
		return 0;
	}

	private class PerfilRowMapper implements ParameterizedRowMapper<PerfilModel>{

		public PerfilModel mapRow(ResultSet rs, int rowNum) throws SQLException {
			PerfilModel perfil = new PerfilModel();
			perfil.setIdPerfil(rs.getInt("idPerfil"));
			perfil.setNombrePerfil(rs.getString("noPerfil"));
			perfil.setDescripcionPerfil(rs.getString("txtDescripcion"));
			perfil.setVigenciaPerfil(rs.getInt("nuvigencia"));
			perfil.setEstadoPerfil(rs.getString("coEstadoPerfil"));
			return perfil;
		}
		
	}


	
}
