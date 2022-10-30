package com.github.lucasdevrj.mvc.leitura.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.lucasdevrj.mvc.leitura.model.Livro;

@Controller //Indica para o Spring que é um controller, para ele gerenciar
public class HomeController {
	
	@PersistenceContext
	private EntityManager entityManager;

	@GetMapping("/home") //Action que retorna a view home
	public String home(Model model) {
		
		Query query = entityManager.createQuery("SELECT l FROM Livro l", Livro.class);
		
		List<Livro> livros = query.getResultList();
		
		model.addAttribute("livros", livros);
		
		return "/home";
	}
}
