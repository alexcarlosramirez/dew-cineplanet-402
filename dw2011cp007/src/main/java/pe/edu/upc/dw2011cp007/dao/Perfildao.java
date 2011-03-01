package pe.edu.upc.dw2011cp007.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class Perfildao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
}
