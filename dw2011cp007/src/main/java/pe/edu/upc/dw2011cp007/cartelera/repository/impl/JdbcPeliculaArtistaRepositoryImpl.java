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
import pe.edu.upc.dw2011cp007.cartelera.repository.PeliculaArtistaRepository;
import pe.edu.upc.dw2011cp007.mantenimiento.model.ArtistaModel;


@Repository
public class JdbcPeliculaArtistaRepositoryImpl implements PeliculaArtistaRepository {

	@Autowired
	private DataSource dataSource;

	public ArrayList<ArtistaModel> buscarListaArtistaPorPelicula(PeliculaModel peliculaModel) {
		String sql = 
			"SELECT a.* " +
			"FROM cp_tb_peliculaartista pa, cp_tb_artista a " +
			"WHERE pa.id_artista = a.id_artista " +
			"AND pa.id_pelicula = ?";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<ArtistaModel> listaArtistaModel = new ArrayList<ArtistaModel>();
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, peliculaModel.getIdPelicula());
			rs = ps.executeQuery();

			while (rs.next()) {
				ArtistaModel artistaModel = new ArtistaModel();
				artistaModel.setIdArtista(rs.getInt("id_artista"));
				artistaModel.setNombreartista(rs.getString("no_artista"));
				listaArtistaModel.add(artistaModel);
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
		return listaArtistaModel;
	}
}
