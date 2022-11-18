package com.github.lucasdevrj.mvc.leitura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.lucasdevrj.mvc.leitura.model.Livro;
import com.github.lucasdevrj.mvc.leitura.model.StatusLivro;
import com.github.lucasdevrj.mvc.leitura.repository.LivroRepository;

@Controller
@RequestMapping("/disponivel")
public class CompraController {
	
	@Autowired //Para o Spring criar instância
	private LivroRepository livroRepository;

	@GetMapping
	public String getPaginaLivrosDisponiveisCompras(Model model) {
		Sort sort = Sort.by("id").descending();
		
		PageRequest paginacao = PageRequest.of(0, 10, sort);
		
		List<Livro> livros = livroRepository.findByStatus(StatusLivro.APROVADO, paginacao);
		
		model.addAttribute("livros", livros);
		
		return "/disponivel/home";
	}
}
