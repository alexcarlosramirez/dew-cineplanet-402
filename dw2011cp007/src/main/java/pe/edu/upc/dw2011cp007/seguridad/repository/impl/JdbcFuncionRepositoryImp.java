package pe.edu.upc.dw2011cp007.seguridad.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.edu.upc.dw2011cp007.seguridad.model.FuncionModel;
import pe.edu.upc.dw2011cp007.seguridad.repository.FuncionRepository;

@Repository
public class JdbcFuncionRepositoryImp 
		extends JdbcDaoSupport implements FuncionRepository {
	
	
	@Autowired
	public JdbcFuncionRepositoryImp(DataSource dataSource) {
		setDataSource(dataSource);
		// TODO Auto-generated constructor stub
	}

	public List<FuncionModel> obtenerListaFunciones() {
		// TODO Auto-generated method stub
		String sql="select * from cp_tb_funcion";
		List<FuncionModel> listaFunciones;
		try{
			listaFunciones=getJdbcTemplate().query(sql, new FuncionRowMapper());
		}catch (EmptyResultDataAccessException e) {
			// TODO: handle exception
			return null;
		}
		
		return listaFunciones;
	}
	
	class FuncionRowMapper implements ParameterizedRowMapper<FuncionModel> {

		public FuncionModel mapRow(ResultSet rs, int rowNum) throws SQLException {
			FuncionModel funcionModel = new FuncionModel();
			funcionModel.setIdFuncion(rs.getInt("idfuncion"));
			funcionModel.setNombreFuncion(rs.getString("nofuncion"));
			funcionModel.setDescripcionFuncion(rs.getString("txtdescripcion"));
			return funcionModel;
		}
	}
}
