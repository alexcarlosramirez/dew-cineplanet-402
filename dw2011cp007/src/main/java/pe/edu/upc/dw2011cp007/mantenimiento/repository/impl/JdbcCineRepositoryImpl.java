package pe.edu.upc.dw2011cp007.mantenimiento.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.edu.upc.dw2011cp007.mantenimiento.model.CineModel;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.CineRepository;

@Repository
public class JdbcCineRepositoryImpl implements CineRepository {

	@Autowired
	private DataSource dataSource;

	public boolean registrarCine(CineModel cineModel) {
		String sql = "insert into cp_tb_cine values (?, ?)";
		Connection conn = null;
		PreparedStatement ps = null;
		boolean res = false;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, cineModel.getIdCine());
			ps.setString(2, cineModel.getNombrecine());
			if (ps.executeUpdate() > 0) {
				res = true;
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

		return res;
	}

	public boolean modificarCine(CineModel cineModel) {
		return false;
	}

	public boolean eliminarCine(CineModel cineModel) {
		return false;
	}

	public ArrayList<CineModel> buscarListaCine() {
		String sql = "SELECT * FROM cp_tb_cine";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<CineModel> listaCineModel = new ArrayList<CineModel>();
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				CineModel cineModel = new CineModel();
				cineModel.setIdCine(rs.getInt("id_cine"));
				cineModel.setNombrecine(rs.getString("no_cine"));
				listaCineModel.add(cineModel);
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
		return listaCineModel;
	}

}
