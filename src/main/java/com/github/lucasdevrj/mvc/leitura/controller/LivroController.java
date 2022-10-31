package com.github.lucasdevrj.mvc.leitura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.lucasdevrj.mvc.leitura.dto.RequisicaoNovoLivro;
import com.github.lucasdevrj.mvc.leitura.model.Livro;
import com.github.lucasdevrj.mvc.leitura.repository.LivroRepository;

@Controller
@RequestMapping("livro")
public class LivroController {
	
	@Autowired //pedir para o Spring injetar depedência
	private LivroRepository livroRepository;

	@GetMapping("formulario")
	public String formulario() {
		return "livro/formulario";
	}
	
	@PostMapping("novo")
	public String novo(RequisicaoNovoLivro requisicao) {
		
		Livro livro = requisicao.toLivro();
		
		livroRepository.save(livro);
		
		return "livro/formulario";
	}
}
