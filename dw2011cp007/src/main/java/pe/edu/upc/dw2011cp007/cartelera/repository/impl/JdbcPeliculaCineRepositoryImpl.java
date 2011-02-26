package pe.edu.upc.dw2011cp007.cartelera.repository.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcPeliculaCineRepositoryImpl {


	@Autowired
	private DataSource dataSource;
}
