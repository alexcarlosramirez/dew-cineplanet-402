package pe.edu.upc.dw2011cp007.mantenimiento.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.edu.upc.dw2011cp007.mantenimiento.model.CineModel;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.CineRepository;

@Repository
public class JdbcCineRepositoryImpl extends JdbcDaoSupport implements CineRepository {

	@Autowired
	public JdbcCineRepositoryImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public boolean registrarCine(CineModel cineModel) {
		String sql = "insert into cp_tb_cine (no_cine) values (?)";
		int i = getJdbcTemplate().update(sql, cineModel.getNombrecine());
		return i>0?true:false;
	}

	public boolean modificarCine(CineModel cineModel) {
		String sql = "update cp_tb_cine set no_cine = ? where id_cine = ?";
		System.out.println(cineModel.getNombrecine() + ", " + cineModel.getIdCine());
		int i = getJdbcTemplate().update(sql, cineModel.getNombrecine(), cineModel.getIdCine());
		System.out.println(i);
		return i>0?true:false;
	}

	public boolean eliminarCine(CineModel cineModel) {
		String sql = "delete from cp_tb_cine where id_cine = ?";
		int i = getJdbcTemplate().update(sql, cineModel.getIdCine());
		return i>0?true:false;
	}

	public ArrayList<CineModel> buscarListaCine() {
		String sql = "select * from cp_tb_cine";
		ArrayList<CineModel> listaPeliculaModel = (ArrayList<CineModel>) getJdbcTemplate().query(sql, new CineRowMapper());
		return listaPeliculaModel;
	}

}

class CineRowMapper implements ParameterizedRowMapper<CineModel> {

	public CineModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		CineModel cineModel = new CineModel();
		cineModel.setIdCine(rs.getInt("id_cine"));
		cineModel.setNombrecine(rs.getString("no_cine"));
		cineModel.setDireccion(rs.getString("tx_direccion"));
		cineModel.setTelefono(rs.getString("tx_telefono"));
		cineModel.setObservacion(rs.getString("tx_observacion"));
		cineModel.setRutaimagen(rs.getString("tx_rutaimagen"));
		return cineModel;
	}
}