package com.picpaysimplificado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Swagger OpenAPI", version = "1", description = "API Desenvolvida Desafio do PicPay"))
public class PicpaysimplificadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PicpaysimplificadoApplication.class, args);
	}

}
