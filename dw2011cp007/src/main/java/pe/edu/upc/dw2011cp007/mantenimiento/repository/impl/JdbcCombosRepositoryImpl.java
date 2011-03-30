package pe.edu.upc.dw2011cp007.mantenimiento.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.edu.upc.dw2011cp007.mantenimiento.model.CombosModel;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.CombosRepository;

@Repository

public class JdbcCombosRepositoryImpl extends JdbcDaoSupport implements CombosRepository {
	@Autowired
	public JdbcCombosRepositoryImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}
	
	public boolean registrarCombo(CombosModel combosModel) {
		String sql = "insert into cp_tb_combos (no_combo) values (?)";
		int i = getJdbcTemplate().update(sql, combosModel.getNombreCombo());
		return i>0?true:false;
	}

	public boolean modificarCombo(CombosModel combosModel) {
		String sql = "update cp_tb_combos set no_combo = ? where id_combo = ?";
		System.out.println(combosModel.getNombreCombo() + ", " + combosModel.getIdCombo());
		int i = getJdbcTemplate().update(sql, combosModel.getNombreCombo(), combosModel.getIdCombo());
		System.out.println(i);
		return i>0?true:false;
	}

	public boolean eliminarCombo(CombosModel combosModel) {
		String sql = "delete from cp_tb_combos where id_combo = ?";
		int i = getJdbcTemplate().update(sql, combosModel.getIdCombo());
		return i>0?true:false;
	}

	public ArrayList<CombosModel> buscarListaCombo() {
		String sql = "select * from cp_tb_combos";
		ArrayList<CombosModel> listaComboModel = (ArrayList<CombosModel>) getJdbcTemplate().query(sql, new ComboRowMapper());
		return listaComboModel;
	}

}

class ComboRowMapper implements ParameterizedRowMapper<CombosModel> {

	public CombosModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		CombosModel combosModel = new CombosModel();
		combosModel.setIdCombo(rs.getInt("id_combo"));
		combosModel.setNombreCombo(rs.getString("no_combo"));
		System.out.println(combosModel);
		return combosModel;
	}
}
