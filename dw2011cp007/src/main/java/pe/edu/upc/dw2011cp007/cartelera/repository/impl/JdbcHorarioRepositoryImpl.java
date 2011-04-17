package pe.edu.upc.dw2011cp007.cartelera.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.edu.upc.dw2011cp007.cartelera.model.HorarioModel;
import pe.edu.upc.dw2011cp007.cartelera.repository.HorarioRepository;
import pe.edu.upc.dw2011cp007.mantenimiento.model.CineModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.PeliculaCineModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.PeliculaModel;
import pe.edu.upc.dw2011cp007.util.Fechas;

@Repository
public class JdbcHorarioRepositoryImpl extends JdbcDaoSupport implements HorarioRepository {

	@Autowired
	public JdbcHorarioRepositoryImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}

	public ArrayList<HorarioModel> buscarListaPeliculaProyectarHoy() {
		String sql = 
			"SELECT "
			+ "p.* "
			+ ", c.* "
			+ ", h.* "
			+ "FROM "
			+ "cp_tb_horario h "
			+ ", cp_tb_pelicula p "
			+ ", cp_tb_cine c "
			+ "WHERE fe_diahorario BETWEEN ? and ? "
			+ "AND p.id_pelicula = h.id_pelicula "
			+ "AND c.id_cine = h.id_cine";

		ArrayList<HorarioModel> listaHorarioModel = (ArrayList<HorarioModel>) getJdbcTemplate().query(sql, new Date[]{Fechas.parseSqlDate("dd/MM/yyyy HH:mm", Fechas.aFormato("dd/MM/yyyy") + " 00:00"), Fechas.parseSqlDate("dd/MM/yyyy HH:mm", Fechas.aFormato("dd/MM/yyyy") + " 23:59")}, new HorarioRowMapper());
		return listaHorarioModel;
	}

	public ArrayList<HorarioModel> buscarHorarioPorPelicula(PeliculaModel peliculaSel) {
		String sql = 
			"SELECT "
			+ "p.* "
			+ ", c.* "
			+ ", h.* "
			+ "FROM "
			+ "cp_tb_horario h "
			+ ", cp_tb_pelicula p "
			+ ", cp_tb_cine c "
			+ "WHERE p.id_pelicula = h.id_pelicula "
			+ "AND c.id_cine = h.id_cine "
			+ "AND h.id_pelicula = ?";

		ArrayList<HorarioModel> listaHorarioModel = (ArrayList<HorarioModel>) getJdbcTemplate().query(sql, new Integer[]{peliculaSel.getIdPelicula()}, new HorarioRowMapper());
		return listaHorarioModel;
	}
}

class HorarioRowMapper implements ParameterizedRowMapper<HorarioModel> {

	public HorarioModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		PeliculaModel peliculaModel = new PeliculaModel();
		peliculaModel.setIdPelicula(rs.getInt("id_pelicula"));
		peliculaModel.setNombrepelicula(rs.getString("no_pelicula"));

		CineModel cineModel = new CineModel();
		cineModel.setIdCine(rs.getInt("id_cine"));
		cineModel.setNombrecine(rs.getString("no_cine"));

		PeliculaCineModel peliculaCineModel = new PeliculaCineModel();
		peliculaCineModel.setPeliculaModel(peliculaModel);
		peliculaCineModel.setCineModel(cineModel);

		HorarioModel horarioModel = new HorarioModel();
		horarioModel.setIdHorario(rs.getInt("id_horario"));
		horarioModel.setDiahorario(rs.getDate("fe_diahorario"));
		horarioModel.setHorashorario(rs.getString("no_horashorario"));
		horarioModel.setPeliculaCineModel(peliculaCineModel);
		return horarioModel;
	}
}