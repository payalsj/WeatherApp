package com.task.weather.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

	@Bean
	OpenAPI registrationOpenAPI() {
		return new OpenAPI().info(new Info().title("Weather API Application")
				.description("Weather API Application Description").version("1.0"));
	}

}
