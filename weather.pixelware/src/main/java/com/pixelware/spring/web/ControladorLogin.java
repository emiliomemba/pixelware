package com.pixelware.spring.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pixelware.spring.modelo.Login;
import com.pixelware.spring.modelo.Usuario;
import com.pixelware.spring.sevicios.UsuarioDAO;

@Controller
public class ControladorLogin {
	

	UsuarioDAO usuarioDAO;
	@Autowired
	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}


	@RequestMapping(value= {"/","/login"},method=RequestMethod.GET)
	public ModelAndView mostrarLogin(HttpServletRequest request,
			HttpServletResponse response) {

		ModelAndView mw = new ModelAndView("login");
		mw.addObject("login", new Login());
		
		return mw;
	}
	

	  @RequestMapping(value = "/loginProceso", method = RequestMethod.POST)
	  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("login") Login login) {
	    ModelAndView mw = null;
	    
	    Usuario usuario = usuarioDAO.validarUsuario(login);
	    
	    if (null != usuario) {
	    mw = new ModelAndView("welcome");
	    mw.addObject("nombre", usuario.getNombre());
	    } else {
	    mw = new ModelAndView("login");
	    mw.addObject("mensaje", "Usuario o Contraseña incorrectos!!");
	    }
	    
	    System.out.println("ESTADO HTTP REQUEST"+request);
	    System.out.println("ESTADO HTTP RESPONSE"+response);
	    return mw;
	  }
	  
}
