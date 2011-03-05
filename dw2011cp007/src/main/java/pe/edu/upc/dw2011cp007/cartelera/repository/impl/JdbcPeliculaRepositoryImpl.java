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
import pe.edu.upc.dw2011cp007.cartelera.repository.PeliculaRepository;

@Repository
public class JdbcPeliculaRepositoryImpl implements PeliculaRepository {

	@Autowired
	private DataSource dataSource;

	public boolean registrarPelicula(PeliculaModel peliculamodel) {
		return false;
	}

	public boolean modificarPelicula(PeliculaModel peliculamodel) {
		return false;
	}

	public boolean eliminarPelicula(PeliculaModel peliculamodel) {
		return false;
	}

	public PeliculaModel buscarPelicula(PeliculaModel peliculamodel) {
		String sql = "SELECT p.* FROM cp_tb_pelicula p WHERE p.id_pelicula = ?";

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		PeliculaModel peliculaModel = null;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, peliculamodel.getIdPelicula());
			rs = ps.executeQuery();

			while (rs.next()) {
				peliculaModel = new PeliculaModel();
				peliculaModel.setIdPelicula(rs.getInt("id_pelicula"));
				peliculaModel.setNombrepelicula(rs.getString("no_pelicula"));
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
		return peliculaModel;
	}

	public ArrayList<PeliculaModel> buscarListaPeliculaEnCartelera() {
		String sql = 
			"SELECT p.* " +
			"FROM cp_tb_pelicula p " +
			"WHERE p.fl_escartelera = true";

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<PeliculaModel> listaPeliculaModel = new ArrayList<PeliculaModel>();
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
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

	public ArrayList<PeliculaModel> buscarListaPeliculaEnEstreno() {
		String sql = 
			"SELECT p.* " +
			"FROM cp_tb_pelicula p " +
			"WHERE p.fl_esestreno = true";

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<PeliculaModel> listaPeliculaModel = new ArrayList<PeliculaModel>();
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
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
}
