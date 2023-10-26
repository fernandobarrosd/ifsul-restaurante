package com.ifsul.restaurante.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
    private static final String API_DOC_TITLE = "IFSUL Restaurante";
    private static final String API_DOC_CONTACT_NAME = "Fernando de Barros";

    @Bean
    OpenAPI openAPI() {
        return new OpenAPI()
        .info(new Info()
        .title(API_DOC_TITLE)
        .contact(new Contact()
        .name(API_DOC_CONTACT_NAME)));
    }
}
