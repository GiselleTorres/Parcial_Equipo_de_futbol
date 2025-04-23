package com.example.Parcial_Equipo_de_futbol.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {
    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("Api Equipo de futbol")
                        .version("1.0")
                        .description("Documentacion de la API para gestionar la BD de un equipo de futbol en supabase")
                        .contact(new Contact()
                                .name("Soporte API")
                                .email("ygtorres@ucundinamarca.edu.co")));
    }
}
