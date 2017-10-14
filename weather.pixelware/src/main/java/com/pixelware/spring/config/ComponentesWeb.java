package com.pixelware.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/*
 *  Indicar que esta clase es para configuraci�n de Spring
 */
@Configuration

/*
 * Por defecto el m�dulo MVC de Spring est� deshabilitado Con esta anotaci�n lo
 * habilitamos
 */
@EnableWebMvc
/*
 * Habilitar el scaneo de componentes de Spring indicando el paquete base de
 * b�squeda.
 * 
 */
@ComponentScan(basePackages = { "com.pixelware.spring" })
public class ComponentesWeb extends WebMvcConfigurerAdapter {

	/*
	 * Por defecto el Servlet de Spring MVC sirve todos los recursos asociados a
	 * las peticiones.
	 * 
	 * Para tener mejor rendimiento indicamos que los recursos est�ticos
	 * (CSS/Scripts, im�genes,...) los sirva el servidor de aplicaciones web
	 * directamente
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("/static/");
	}

	/*
	 * M�todo para devolver un bean/componente gestionado por el contenedor de
	 * Spring donde configuramos el objeto ViewResolver para asociar nombre
	 * l�gico de las vistas con los ficheros f�sicos
	 */
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();

		// Configurar prefijo
		resolver.setPrefix("/WEB-INF/views/");

		// Configurar sufijo (extensi�n fichero)
		resolver.setSuffix(".jsp");

		// Configurar el tipo de vista (Jsp con JSTL)
		resolver.setViewClass(JstlView.class);

		return resolver;
	}
}
