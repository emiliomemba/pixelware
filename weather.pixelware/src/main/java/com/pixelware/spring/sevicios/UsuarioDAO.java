package com.pixelware.spring.sevicios;

import org.springframework.stereotype.Service;

import com.pixelware.spring.modelo.Login;
import com.pixelware.spring.modelo.Usuario;

@Service
public interface UsuarioDAO {

	public void registrarUsuario(Usuario usuario);

	Usuario validarUsuario(Login login);

}
