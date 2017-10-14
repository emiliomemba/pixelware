package com.pixelware.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/*
 *  Indicar que esta clase es para configuraci�n de Spring
 */
@Configuration

/*
 * Por defecto el m�dulo MVC de Spring est� deshabilitado
 * Con esta anotaci�n lo habilitamos
 */
@EnableWebMvc
/*
 * Habilitar el scaneo de componentes de Spring indicando el
 * paquete base de b�squeda.
 * 
 * Excluimos esta clase que lleva la anotaci�n @EnableWebMvc
 */
@ComponentScan(basePackages = {"com.pixelware.spring"},
	excludeFilters={@Filter(type=FilterType.ANNOTATION,
			value=EnableWebMvc.class)})
public class ComponentesNoWeb {

}
