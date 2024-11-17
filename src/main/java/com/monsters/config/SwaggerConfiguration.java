package com.monsters.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "Halloween Challenge API",
                description = "Challenge de Halloween de la comunidad Alumni 2024." +
                        "Tema: ¡Desarrolla una API para la gestión de monstruos en una base de datos de criaturas de Halloween!",
                version = "1.0.0",
                contact = @Contact(
                        name = "Jose Bonilla Sanchez",
                        url = "https://github.com/bonillasanchez98/halloween_challenge",
                        email = "bonillasanchez98@gmail.com"
                )
        ),
        servers = {
                @Server(
                        description = "DEV SERVER",
                        url = "http://localhost:8080/"
                ),
                @Server(
                        description = "PRD SERVER",
                        url = "https://halloween-challenge.onrender.com/"
                )
        }
)
public class SwaggerConfiguration { }
