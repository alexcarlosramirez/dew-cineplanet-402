package pe.edu.upc.dw2011cp007.cartelera.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.edu.upc.dw2011cp007.cartelera.model.PeliculaModel;
import pe.edu.upc.dw2011cp007.cartelera.repository.PeliculaRepository;
import pe.edu.upc.dw2011cp007.mantenimiento.model.PaisModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.TipopeliculaModel;

@Repository
public class JdbcPeliculaRepositoryImpl extends JdbcDaoSupport implements PeliculaRepository {

	@Autowired
	public JdbcPeliculaRepositoryImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public boolean registrarPelicula(PeliculaModel peliculamodel) {
		String sql = "insert into cp_tb_pelicula (no_pelicula, id_pais, id_tipopelicula, co_clasificacionpelicula, fl_doblada, fl_en3d, fl_enestreno, fl_encartelera) values (?, ?, ?, ?, ?, ?, ?, ?)";
		getJdbcTemplate().update(sql
				, peliculamodel.getNombrepelicula()
				, peliculamodel.getPaisModel().getIdPais()
				, peliculamodel.getTipopeliculaModel().getIdTipopelicula()
				, peliculamodel.getClasificacionPelicula()
				, peliculamodel.isDoblada()
				, peliculamodel.isEn3d()
				, peliculamodel.isEnestreno()
				, peliculamodel.isEncartelera()
				);
		return false;
	}

	public boolean modificarPelicula(PeliculaModel peliculamodel) {
		String sql = 
			"update cp_tb_pelicula set " +
			"no_pelicula = ?" +
			", id_pais = ?" +
			", id_tipopelicula = ?" +
			", co_clasificacionpelicula = ?" +
			", fl_doblada = ?" +
			", fl_en3d = ?" +
			", fl_enestreno = ?" +
			", fl_encartelera = ? " +
			"where id_pelicula = ?";
		getJdbcTemplate().update(sql
				, peliculamodel.getNombrepelicula()
				, peliculamodel.getPaisModel().getIdPais()
				, peliculamodel.getTipopeliculaModel().getIdTipopelicula()
				, peliculamodel.getClasificacionPelicula()
				, peliculamodel.isDoblada()
				, peliculamodel.isEn3d()
				, peliculamodel.isEnestreno()
				, peliculamodel.isEncartelera()
				, peliculamodel.getIdPelicula()
				);
		return false;
	}

	public boolean eliminarPelicula(PeliculaModel peliculamodel) {
		String sql = "delete from cp_tb_pelicula where id_pelicula = ?";
		getJdbcTemplate().update(sql, peliculamodel.getIdPelicula());
		return false;
	}

	public PeliculaModel buscarPelicula(PeliculaModel peliculamodel) {
		ArrayList<Object> parametros = new ArrayList<Object>();
		String sql =
			"SELECT p.* " +
			"FROM cp_tb_pelicula p ";
		if (peliculamodel.getIdPelicula() == 0) {
			sql += "WHERE p.no_pelicula = ?";
			parametros.add(peliculamodel.getNombrepelicula());
		} else {
			sql += "WHERE p.id_pelicula = ?";
			parametros.add(peliculamodel.getIdPelicula());
		}

		try {
			PeliculaModel peliculaModel = getJdbcTemplate().queryForObject(sql, parametros.toArray(), new PeliculaRowMapper());
			return peliculaModel;
		} catch (Exception e) {
			return null;
		}
	}

	public ArrayList<PeliculaModel> buscarListaPeliculaEnCartelera() {
		String sql = 
			"SELECT p.* " +
			"FROM cp_tb_pelicula p " +
			"WHERE p.fl_encartelera = true";

		ArrayList<PeliculaModel> peliculaModel = (ArrayList<PeliculaModel>) getJdbcTemplate().query(sql, new PeliculaRowMapper());
		return peliculaModel;
	}

	public ArrayList<PeliculaModel> buscarListaPeliculaEnEstreno() {
		String sql = 
			"SELECT p.* " +
			"FROM cp_tb_pelicula p " +
			"WHERE p.fl_enestreno = true";

		ArrayList<PeliculaModel> peliculaModel = (ArrayList<PeliculaModel>) getJdbcTemplate().query(sql, new PeliculaRowMapper());
		return peliculaModel;
	}
}

class PeliculaRowMapper implements ParameterizedRowMapper<PeliculaModel> {

	public PeliculaModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		PeliculaModel peliculaModel = new PeliculaModel();
		peliculaModel.setIdPelicula(rs.getInt("id_pelicula"));
		peliculaModel.setNombrepelicula(rs.getString("no_pelicula"));
		peliculaModel.setClasificacionPelicula(rs.getString("co_clasificacionpelicula"));
		peliculaModel.setDoblada(rs.getBoolean("fl_doblada"));
		peliculaModel.setEn3d(rs.getBoolean("fl_en3d"));
		peliculaModel.setEnestreno(rs.getBoolean("fl_enestreno"));
		peliculaModel.setEncartelera(rs.getBoolean("fl_encartelera"));
		

		PaisModel paisModel = new PaisModel();
		paisModel.setIdPais(rs.getInt("id_pais"));
		peliculaModel.setPaisModel(paisModel);

		TipopeliculaModel tipopeliculaModel = new TipopeliculaModel();
		tipopeliculaModel.setIdTipopelicula(rs.getInt("id_tipopelicula"));
		peliculaModel.setTipopeliculaModel(tipopeliculaModel);
		return peliculaModel;
	}
}