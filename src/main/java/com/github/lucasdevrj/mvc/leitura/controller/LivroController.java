package com.github.lucasdevrj.mvc.leitura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("livro")
public class LivroController {

	@GetMapping("formulario")
	public String formulario() {
		return "livro/formulario";
	}
	
	@PostMapping("novo")
	public String novo(RequisicaoNovoLivro requisicao) {
		return "livro/formulario";
	}
}
