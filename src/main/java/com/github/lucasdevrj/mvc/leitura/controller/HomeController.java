package com.github.lucasdevrj.mvc.leitura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.lucasdevrj.mvc.leitura.model.Livro;
import com.github.lucasdevrj.mvc.leitura.repository.LivroRepository;

@Controller //Indica para o Spring que é um controller, para ele gerenciar
public class HomeController {
	
	@Autowired //Para o Spring criar instância
	private LivroRepository livroRepository;
	

	@GetMapping("/home") //Action que retorna a view home
	public String home(Model model) {
		
		List<Livro> livros = livroRepository.exibeLivros();
		
		model.addAttribute("livros", livros);
		
		return "/home";
	}
}
