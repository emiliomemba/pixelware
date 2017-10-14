package com.pixelware.spring.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/*
 * Clase de configuraci�n pra componentes web de Spring
 */
@Configuration
/*
 * Habilitar Spring MVC. Equivalente al elemento xml <mvc:annotation-driven />
 */
@EnableWebMvc
/*
 * Habilitar el escaneo de componentes @Component, @Service,
 * 
 * @Repository y @Controller. Equivalente al elemento xml
 * <context:component-scan base-packages=""/>
 */
@ComponentScan(basePackages = { "com.pixelware.spring" })
public class WebConfig extends WebMvcConfigurerAdapter {

	/*
	 * Devoluci�n de un bean (componente) para gestion de vistas
	 */
	@Bean
	public ViewResolver resolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();

		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");

		return resolver;
	}
}
