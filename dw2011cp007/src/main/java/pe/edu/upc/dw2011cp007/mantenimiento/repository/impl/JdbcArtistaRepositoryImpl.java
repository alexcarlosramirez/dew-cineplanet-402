package pe.edu.upc.dw2011cp007.mantenimiento.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pe.edu.upc.dw2011cp007.mantenimiento.model.ArtistaModel;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.ArtistaRepository;


@Repository

public class JdbcArtistaRepositoryImpl extends JdbcDaoSupport implements ArtistaRepository {

	@Autowired
	public JdbcArtistaRepositoryImpl (DataSource dataSource){
		setDataSource(dataSource);
	}
	 
	public boolean registrarArtista(ArtistaModel artistaModel) {
		
		String sql = "insert into cp_tb_artista (no_artista) values (?)";
		int i = getJdbcTemplate().update(sql, artistaModel.getNombreartista());
		return i>0?true:false;
	}

	public boolean modificarArtista(ArtistaModel artistaModel) {
		
		String sql = "update cp_tb_artista set no_artista = ? where id_artista = ?";
		System.out.println(artistaModel.getNombreartista() + ", " + artistaModel.getIdArtista());
		int i = getJdbcTemplate().update(sql, artistaModel.getNombreartista(), artistaModel.getIdArtista());
		System.out.println(i);
		return i>0?true:false;
		
	}

	public boolean eliminarArtista(ArtistaModel artistaModel) {
		String sql = "delete from cp_tb_artista where id_artista = ?";
		int i = getJdbcTemplate().update(sql, artistaModel.getIdArtista());
		return i>0?true:false;
	}

	public ArrayList<ArtistaModel> buscarListaArtista() {
		String sql = "select * from cp_tb_artista";
		ArrayList<ArtistaModel> listaArtistaModel = (ArrayList<ArtistaModel>) getJdbcTemplate().query(sql, new ArtistaRowMapper());
		return listaArtistaModel;
	}
	
	class ArtistaRowMapper implements ParameterizedRowMapper<ArtistaModel> {

		public ArtistaModel mapRow(ResultSet rs, int rowNum) throws SQLException {
			ArtistaModel artistaModel = new ArtistaModel();
			artistaModel.setIdArtista(rs.getInt("id_Artista"));
			artistaModel.setNombreartista(rs.getString("no_artista"));
			System.out.println(artistaModel);
			return artistaModel;
		}
	
	
	
	
	
	}	

}



