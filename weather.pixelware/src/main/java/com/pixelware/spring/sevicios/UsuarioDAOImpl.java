package com.pixelware.spring.sevicios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.pixelware.spring.modelo.Login;
import com.pixelware.spring.modelo.Usuario;

@Service
@Repository
public class UsuarioDAOImpl implements UsuarioDAO {



	JdbcTemplate jdbcTemplate;

	


	/*DataSource datasource;
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}*/

	@Override
	public void registrarUsuario(Usuario usuario) {

		String sql = "INSERT INTO usuarios VALUES (?,?,?,?,?,?)";

		jdbcTemplate.update(
				sql, new Object[] { 
						usuario.getNombreUsuario(), 
						usuario.getPass(), 
						usuario.getNombre(),
						usuario.getEmail(), 
						usuario.getFnacimiento(), 
						usuario.getPais() });
	}

	@Override
	public Usuario validarUsuario(Login login) {

		String sql = "SELECT * FROM  usuarios WHERE nombreUsuario ='" 
				+ login.getNombreUsuario() + "'AND pass='"
				+ login.getPass() + "'";

		List<Usuario> usuario = jdbcTemplate.query(sql, new UsuarioMapper());

		return usuario.size() > 0 ? usuario.get(0) : null;
	}

}

class UsuarioMapper implements RowMapper<Usuario> {

	@Override
	public Usuario mapRow(ResultSet rs, int arg1) throws SQLException {
		Usuario usuario = new Usuario();

		usuario.setNombreUsuario(rs.getString("nombreUsuario"));
		usuario.setNombreUsuario(rs.getString("pass"));
		usuario.setNombreUsuario(rs.getString("nombre"));
		usuario.setNombreUsuario(rs.getString("email"));
		usuario.setNombreUsuario(rs.getString("pais"));
		usuario.setNombreUsuario(rs.getString("fNacimiento"));

		return usuario;
	}

}