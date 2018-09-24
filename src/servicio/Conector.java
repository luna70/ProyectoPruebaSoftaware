package servicio;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class Conector {
	JdbcTemplate db;

	@Autowired
	public void setJdbcTemplate(DataSource dataSource) throws SQLException {
		db = new JdbcTemplate(dataSource);
	}
	
	
}
