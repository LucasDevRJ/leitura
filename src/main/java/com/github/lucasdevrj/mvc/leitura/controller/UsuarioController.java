package com.github.lucasdevrj.mvc.leitura.controller;

import java.security.Principal;
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

@Controller
@RequestMapping("usuario")
public class UsuarioController {
	
	@Autowired //Para o Spring criar instância
	private LivroRepository livroRepository;

	@GetMapping("livro") //Action que retorna a view home
	public String home(Model model, Principal principal) {
		
		List<Livro> livros = livroRepository.findAllByUsuario(principal.getName());
		
		model.addAttribute("livros", livros);
		
		return "usuario/home";
	}
	
	@GetMapping("livro/{status}") //Action que retorna a view home
	public String status(@PathVariable("status") String status, Model model, Principal principal) {
		
		List<Livro> livros = livroRepository.findByStatusUsuario(StatusLivro.valueOf(status.toUpperCase()), principal.getName());
		
		model.addAttribute("livros", livros);
		model.addAttribute("status", status);
		
		return "usuario/home";
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public String onError() {
		return "redirect:/usuario/home";
	}
}
