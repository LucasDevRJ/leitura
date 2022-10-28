package com.github.lucasdevrj.mvc.leitura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.lucasdevrj.mvc.leitura.model.Livro;

@Controller //Indica para o Spring que é um controller, para ele gerenciar
public class HomeController {

	@GetMapping("/home") //Action que retorna a view home
	public String home() {
		Livro livro = new Livro();
		livro.setNome("As coisas que você só vê quando desacelera");
		livro.setPreco(48.00f);
		
		return "/home";
	}
}
