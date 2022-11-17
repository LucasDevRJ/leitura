package com.github.lucasdevrj.mvc.leitura;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration //Indica para Spring que esta é uma classe de configuração
@EnableWebSecurity
public class ConfiguracaoSegurancaWeb extends WebSecurityConfigurerAdapter { //Classe para configurar login do site

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests()
			.anyRequest().authenticated()
			.and()
			.formLogin((form) -> form
				.loginPage("/login")
				.permitAll()
			);
	}
	
	@Bean
	@Override
	public UserDetailsService userDetailsService() { //método para criar usuário
		UserDetails user =
			 User.withDefaultPasswordEncoder()
				.username("lucas")
				.password("abr33")
				.roles("ADM")
				.build();

		return new InMemoryUserDetailsManager(user);
	}
}
