package com.github.lucasdevrj.mvc.leitura.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //para indicar que a classe é uma controller para o Spring, assim sendo gerenciado por ele
public class HelloController { //Classe para adicionar Actions

	//Action que serve para requisitar uma transação para 
	//o usuári e retorna uma view (html)
	@GetMapping("/hello") //para o Spring mapear essa Action e executa-la
	public String hello(HttpServletRequest request) { //HttpServletRequest para acessar atributos da view
		request.setAttribute("nome", "World");
		return "Hello";
	}
}
