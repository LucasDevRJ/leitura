package com.github.lucasdevrj.mvc.leitura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.lucasdevrj.mvc.leitura.model.Livro;
import com.github.lucasdevrj.mvc.leitura.model.StatusLivro;
import com.github.lucasdevrj.mvc.leitura.repository.LivroRepository;

@Controller //Indica para o Spring que é um controller, para ele gerenciar
@RequestMapping("/home")
public class HomeController {
	
	@Autowired //Para o Spring criar instância
	private LivroRepository livroRepository;
	

	@GetMapping //Action que retorna a view home
	public String home(Model model) {
		
		List<Livro> livros = livroRepository.findAll();
		
		model.addAttribute("livros", livros);
		
		return "/home";
	}
	
	@GetMapping("/{status}") //Action que retorna a view home
	public String status(@PathVariable("status") String status, Model model) {
		
		List<Livro> livros = livroRepository.findByStatus(StatusLivro.valueOf(status.toUpperCase()));
		
		model.addAttribute("livros", livros);
		model.addAttribute("status", status);
		
		return "/home";
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public String onError() {
		return "redirect:/home";
	}
}
