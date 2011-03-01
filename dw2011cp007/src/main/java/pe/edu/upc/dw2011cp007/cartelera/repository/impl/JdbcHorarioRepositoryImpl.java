package pe.edu.upc.dw2011cp007.cartelera.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.edu.upc.dw2011cp007.cartelera.model.PeliculaModel;
import pe.edu.upc.dw2011cp007.cartelera.repository.HorarioRepository;
import pe.edu.upc.dw2011cp007.util.Fechas;

@Repository
public class JdbcHorarioRepositoryImpl implements HorarioRepository {

	@Autowired
	private DataSource dataSource;

	public ArrayList<PeliculaModel> buscarListaPeliculaEnCartelera() {
		String sql = "SELECT distinct p.* FROM cp_tb_horario h, cp_tb_pelicula p WHERE fe_diahorario BETWEEN ? and ? and p.id_pelicula = h.id_pelicula";
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
					// Close to prevent database cursor exhaustion
					ps.close();
				} catch (SQLException ex) {
				}
			}
			if (conn != null) {
				try {
					// Close to prevent database connection exhaustion
					conn.close();
				} catch (SQLException ex) {
				}
			}
		}
		return listaPeliculaModel;
	}
}
