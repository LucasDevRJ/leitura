package com.github.lucasdevrj.mvc.leitura.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.lucasdevrj.mvc.leitura.model.Livro;
import com.github.lucasdevrj.mvc.leitura.model.StatusLivro;
import com.github.lucasdevrj.mvc.leitura.repository.LivroRepository;
import com.github.lucasdevrj.mvc.leitura.repository.UserRepository;

@Controller //Indica para o Spring que é um controller, para ele gerenciar
@RequestMapping("/home")
public class HomeController {
	
	@Autowired //Para o Spring criar instância
	private LivroRepository livroRepository;

	@GetMapping //Action que retorna a view home
	public String home(Model model, Principal principal) {
		
		Sort sort = Sort.by("data").descending();
		
		PageRequest paginacao = PageRequest.of(0, 10, sort);
		
		List<Livro> livros = livroRepository.findByStatus(StatusLivro.ENTREGUE, paginacao);
		
		model.addAttribute("livros", livros);
		
		return "home";
	}
}
