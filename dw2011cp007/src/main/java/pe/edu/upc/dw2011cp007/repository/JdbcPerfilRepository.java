package pe.edu.upc.dw2011cp007.repository;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import pe.edu.upc.dw2011cp007.model.PerfilModel;

public class JdbcPerfilRepository implements PerfilDbRepository{

	JdbcTemplate jdbcTemplate;
	public PerfilModel buscarperfil(String perfil) {
		// TODO Auto-generated method stub
		String sql="select * from cp_tb_perfil where no_nombreperfil=?";
		/*List matches= jdbcTemplate.query(sql,
				new Object[]{perfil},newRowMapper(){
					public Object mapRow(ResultSet rs,int rowNum) throws SQLException,DataAccessException{
					}
					});*/
					
		/*PerfilModel retorno=null;
		Iterator itbp= CtrlPerfil.entrySet().iterator();	
		while(itbp.hasNext()){
			Map.Entry<Integer, PerfilModel> lp=(Map.Entry<Integer, PerfilModel>)itbp.next();
			if (lp.getValue().getNombrePerfil().equals(perfil)){
				retorno=lp.getValue();
			}
		}*/
		return null;
	}

	public int actualizarvigencia(String perfil, int vigencia) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String buscarfuncion(PerfilModel perfilmodel, String funcion) {
		// TODO Auto-generated method stub
		return null;
	}

	public int grabarperfil(PerfilModel perfilmodel) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int asignarfuncion(String perfil, String funcion) {
		// TODO Auto-generated method stub
		return 0;
	}

}
