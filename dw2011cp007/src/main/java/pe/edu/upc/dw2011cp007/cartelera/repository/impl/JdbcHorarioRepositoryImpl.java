package pe.edu.upc.dw2011cp007.cartelera.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.edu.upc.dw2011cp007.cartelera.model.HorarioModel;
import pe.edu.upc.dw2011cp007.cartelera.model.PeliculaCineModel;
import pe.edu.upc.dw2011cp007.cartelera.model.PeliculaModel;
import pe.edu.upc.dw2011cp007.cartelera.repository.HorarioRepository;
import pe.edu.upc.dw2011cp007.mantenimiento.model.CineModel;
import pe.edu.upc.dw2011cp007.util.Fechas;

@Repository
public class JdbcHorarioRepositoryImpl implements HorarioRepository {

	@Autowired
	private DataSource dataSource;

	public ArrayList<PeliculaModel> buscarListaPeliculaProyectarHoy() {
		String sql = 
			"SELECT distinct p.* FROM cp_tb_horario h, cp_tb_pelicula p " +
			"WHERE fe_diahorario BETWEEN ? and ? " +
			"AND p.id_pelicula = h.id_pelicula";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<PeliculaModel> listaPeliculaModel = new ArrayList<PeliculaModel>();
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setDate(1, Fechas.parseSqlDate("dd/MM/yyyy HH:mm", Fechas.aFormato("dd/MM/yyyy") + " 00:00"));
			ps.setDate(2, Fechas.parseSqlDate("dd/MM/yyyy HH:mm", Fechas.aFormato("dd/MM/yyyy") + " 23:59"));
			rs = ps.executeQuery();

			while (rs.next()) {
				PeliculaModel peliculaModel = new PeliculaModel();
				peliculaModel.setIdPelicula(rs.getInt("id_pelicula"));
				peliculaModel.setNombrepelicula(rs.getString("no_pelicula"));
				listaPeliculaModel.add(peliculaModel);
			}
		} catch (SQLException e) {
			throw new RuntimeException("SQL exception occured inserting reward record", e);
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException ex) {
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException ex) {
				}
			}
		}
		return listaPeliculaModel;
	}

	public ArrayList<HorarioModel> buscarHorarioPorPelicula(PeliculaModel peliculaSel) {
		String sql = 
			"SELECT p.id_pelicula, p.no_pelicula, c.id_cine, c.no_cine, h.id_horario, h.fe_diahorario, h.no_horashorario, h.fl_essubtitulado, h.fl_esen3d " +
			"FROM cp_tb_horario h, cp_tb_pelicula p, cp_tb_cine c " +
			"WHERE p.id_pelicula = h.id_pelicula " +
			"AND c.id_cine = h.id_cine " +
			"AND h.id_pelicula = ?";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<HorarioModel> listaHorarioModel = new ArrayList<HorarioModel>();
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, peliculaSel.getIdPelicula());
			rs = ps.executeQuery();

			while (rs.next()) {
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
				listaHorarioModel.add(horarioModel);
			}
		} catch (SQLException e) {
			throw new RuntimeException("SQL exception occured inserting reward record", e);
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException ex) {
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException ex) {
				}
			}
		}
		return listaHorarioModel;
	}
}
