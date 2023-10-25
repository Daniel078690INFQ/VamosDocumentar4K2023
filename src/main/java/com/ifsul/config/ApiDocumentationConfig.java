package com.ifsul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class ApiDocumentationConfig {

    @Bean
    public OpenAPI apiDocConfig() {
        return new OpenAPI()
                .info(new Info()
                        .title("IFSul Restaurante API")
                        .description("API de Busca de Restaurantes do IFSul")
                        .version("0.0.1") //você sabe como funciona uma versão?
                        .contact(new Contact()
                                .name("Daniel de Oliveira")
                                .email("danieloliveira.ssnfq@academico.ifsul.edu.br")))
                .externalDocs(new ExternalDocumentation()
                        .description("Algum link externo")
                        .url("https:/wiki...."));
    }
}
