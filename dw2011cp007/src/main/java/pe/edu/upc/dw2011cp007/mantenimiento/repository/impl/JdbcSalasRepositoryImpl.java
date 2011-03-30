package pe.edu.upc.dw2011cp007.mantenimiento.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.edu.upc.dw2011cp007.mantenimiento.model.SalasModel;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.SalasRepository;

@Repository
public class JdbcSalasRepositoryImpl extends JdbcDaoSupport implements SalasRepository{
	@Autowired
	public JdbcSalasRepositoryImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}
	
	public boolean registrarSala(SalasModel salasModel) {
		String sql = "insert into cp_tb_salas (no_sala,id_cine) values (?,?)";
		int i = getJdbcTemplate().update(sql, salasModel.getNombreSala(), salasModel.getIdCine());
		return i>0?true:false;
	}

	public boolean modificarSala(SalasModel salasModel) {
		String sql = "update cp_tb_salas set no_sala = ? where id_sala = ?";
		System.out.println(salasModel.getNombreSala() + ", " + salasModel.getIdSala());
		int i = getJdbcTemplate().update(sql, salasModel.getNombreSala(), salasModel.getIdSala());
		System.out.println(i);
		return i>0?true:false;
	}

	public boolean eliminarSala(SalasModel salasModel) {
		String sql = "delete from cp_tb_salas where id_sala = ?";
		int i = getJdbcTemplate().update(sql, salasModel.getIdSala());
		return i>0?true:false;
	}

	public ArrayList<SalasModel> buscarListaSala() {
		String sql = "select * from cp_tb_salas";
		ArrayList<SalasModel> listaSalaModel = (ArrayList<SalasModel>) getJdbcTemplate().query(sql, new SalaRowMapper());
		return listaSalaModel;
	}

}

class SalaRowMapper implements ParameterizedRowMapper<SalasModel> {

	public SalasModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		SalasModel salasModel = new SalasModel();
		salasModel.setIdSala(rs.getInt("id_sala"));
		salasModel.setNombreSala(rs.getString("no_Sala"));
		salasModel.setIdCine(rs.getInt("id_Cine"));
		System.out.println(salasModel);
		return salasModel;
	}
}
