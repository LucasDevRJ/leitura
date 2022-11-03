package com.github.lucasdevrj.mvc.leitura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/aguardando") //Action que retorna a view home
	public String aguardando(Model model) {
		
		List<Livro> livros = livroRepository.findByStatus(StatusLivro.AGUARDANDO);
		
		model.addAttribute("livros", livros);
		
		return "/home";
	}
	
	@GetMapping("/aprovado") //Action que retorna a view home
	public String aprovado(Model model) {
		
		List<Livro> livros = livroRepository.findByStatus(StatusLivro.APROVADO);
		
		model.addAttribute("livros", livros);
		
		return "/home";
	}
	
	@GetMapping("/entregue") //Action que retorna a view home
	public String entregue(Model model) {
		
		List<Livro> livros = livroRepository.findByStatus(StatusLivro.ENTREGUE);
		
		model.addAttribute("livros", livros);
		
		return "/home";
	}
}
