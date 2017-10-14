package com.pixelware.spring.modelo;

import java.util.Date;

public class Usuario {

	private String nombre;
	private String email;
	private Date fnacimiento;
	private String pais;
	private String nombreUsuario;
	private String pass;

	
	public Usuario() {
	
	}

	public Usuario(String nombre, String email, Date fnacimiento,
			String pais, String pass, String nombreUsuario) {

		this.nombre = nombre;
		this.email = email;
		this.fnacimiento = fnacimiento;
		this.pais = pais;
		this.pass = pass;
		this.nombreUsuario = nombreUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFnacimiento() {
		return fnacimiento;
	}

	public void setFnacimiento(Date fnacimiento) {
		this.fnacimiento = fnacimiento;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", email=" + email + ", fnacimiento=" + fnacimiento + ", pais=" + pais
				+ ", pass=" + pass + ", username=" + nombreUsuario + "]";
	}


}
