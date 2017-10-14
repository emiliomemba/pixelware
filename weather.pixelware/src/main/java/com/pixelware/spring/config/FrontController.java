package com.pixelware.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*
 * Clase para configuraci�n del ServletDispatcher de Spring MVC y
 * del entorno de la aplicaci�n web (lo que hac�amos en el fichero
 * web.xml del ejemplo anterior) 
 * 
 * A partir de la versi�n 3.1 de Spring MVC tiene que heredar de 
 * AbstractAnnotationConfigDispatcherServletInitializer
 */
public class FrontController extends AbstractAnnotationConfigDispatcherServletInitializer {

	/*
	 * Devoluci�n de todas las clase (una en este caso) de configuraci�n para
	 * componentes NO web de la app
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("\n\nCargada App\n\n");
		return new Class<?>[] { ComponentesNoWeb.class };
	}

	/*
	 * Devoluci�n de todas las clase (una en este caso) de configuraci�n para
	 * componentes web de la app
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { ComponentesWeb.class };
	}

	/*
	 * Devoluci�n de todos los patrones de llamada (uno en este caso) asociados
	 * a DispatcherServlet de Spring MVC. El Front-Controller
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
