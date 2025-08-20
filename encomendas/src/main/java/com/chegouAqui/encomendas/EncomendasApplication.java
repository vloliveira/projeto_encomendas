package com.chegouAqui.encomendas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// ATENÇÃO: Remover "(exclude = {DataSourceAutoConfiguration.class})" para rodar o banco de dados
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EncomendasApplication {

	public static void main(String[] args) {
		SpringApplication.run(EncomendasApplication.class, args);
	}

}
