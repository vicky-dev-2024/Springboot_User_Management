package com.vickycode.build_rest_api.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("User Management API")
                        .version("2.0")
                        .description("Spring Boot REST API for User Management with CRUD operations, pagination, search, filter, and sort")
                        .contact(new Contact()
                                .name("Vigneshwaran")
                                .email("vigneshcs2024@gmail.com")));
    }
}
