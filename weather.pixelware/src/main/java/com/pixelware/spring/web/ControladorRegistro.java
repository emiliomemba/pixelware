package com.pixelware.spring.web;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pixelware.spring.modelo.Usuario;
import com.pixelware.spring.sevicios.UsuarioDAO;

@Controller
public class ControladorRegistro {

	private UsuarioDAO usuarioDAO;
	
	@Autowired
	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}
	
	@RequestMapping(value="/registrar",method=RequestMethod.GET)
	public ModelAndView registro( HttpServletRequest request,
			HttpServletResponse response) {
		
		ModelAndView mw = new ModelAndView("registrar");
		mw.addObject("usuario", new Usuario());
		
		return mw;
		
	}
	
	@RequestMapping(value="/registrarProceso",method=RequestMethod.POST)
	public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
			  @ModelAttribute("usuario") Usuario usuario) {
		
		usuarioDAO.registrarUsuario(usuario);
		
		return new ModelAndView("welcome","nombreUsuario",usuario.getNombre());
	}
}
