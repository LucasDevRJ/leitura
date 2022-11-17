package com.github.lucasdevrj.mvc.leitura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class LeituraApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeituraApplication.class, args);
	}

}
