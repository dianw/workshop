package org.meruvian.workshop.jaxrs.config;

import org.meruvian.workshop.jaxrs.Main;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;

@Configuration
public class SwaggerConfig {
	@Bean
	public BeanConfig beanConfig() {
		BeanConfig config = new BeanConfig();
		config.setVersion("0.0.1-SNAPSHOT");
		config.setBasePath("/api");
		config.setResourcePackage(Main.class.getPackage().getName());
		config.setScan(true);
		
		return config;
	}

	@Bean
	public ApiListingResource apiListingResource() {
		return new ApiListingResource();
	}
	
	@Bean
	public SwaggerSerializers swaggerSerializers() {
		return new SwaggerSerializers();
	}
}
