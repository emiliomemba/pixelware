package com.pixelware.spring.conf;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*
 * Inicializador de la aplicaci�n web
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	/*
	 * Clases de configuracion de componentes NO web de la aplicaci�n
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {};
	}

	/*
	 * Clases de configuracion de componentes web de la aplicaci�n
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebConfig.class };
	}

	/*
	 * Patrones de llamada a DispatcherServlet de Spring MVC
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
