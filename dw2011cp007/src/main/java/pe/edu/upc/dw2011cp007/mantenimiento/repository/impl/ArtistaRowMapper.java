package pe.edu.upc.dw2011cp007.mantenimiento.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import pe.edu.upc.dw2011cp007.mantenimiento.model.ArtistaModel;

public class ArtistaRowMapper implements ResultSetExtractor <ArtistaModel> { 

	public ArtistaModel extractData(ResultSet arg0) throws SQLException,
			DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

}
