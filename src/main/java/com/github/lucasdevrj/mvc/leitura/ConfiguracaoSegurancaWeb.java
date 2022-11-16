package com.github.lucasdevrj.mvc.leitura;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration //Indica para Spring que esta é uma classe de configuração
@EnableWebSecurity
public class ConfiguracaoSegurancaWeb extends WebSecurityConfigurerAdapter { //Classe para configurar login do site

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests()
			.anyRequest().authenticated()
			.and()
			.httpBasic();
	}
}
