package com.pixelware.spring.modelo;

public class Login {
	private String nombreUsuario;
	private String pass;

	public Login() {
	}

	public Login(String nombreUsuario, String pass) {

		this.nombreUsuario = nombreUsuario;
		this.pass = pass;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Login [nombreUsuario=" + nombreUsuario + ", pass=" + pass + "]";
	}

}
