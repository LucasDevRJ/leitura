package com.github.lucasdevrj.mvc.leitura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/disponivel")
public class CompraController {

	@GetMapping
	public String getPaginaLivrosDisponiveisCompras() {
		return "disponivel/home";
	}
}