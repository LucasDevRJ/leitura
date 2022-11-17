package com.github.lucasdevrj.mvc.leitura.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.lucasdevrj.mvc.leitura.dto.RequisicaoNovoLivro;
import com.github.lucasdevrj.mvc.leitura.model.Livro;
import com.github.lucasdevrj.mvc.leitura.model.User;
import com.github.lucasdevrj.mvc.leitura.repository.LivroRepository;
import com.github.lucasdevrj.mvc.leitura.repository.UserRepository;

@Controller
@RequestMapping("livro")
public class LivroController {
	
	@Autowired //pedir para o Spring injetar depedência
	private LivroRepository livroRepository;
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping("formulario")
	public String formulario(RequisicaoNovoLivro requisicao) {
		return "livro/formulario";
	}
	
	@PostMapping("novo")
	public String novo(@Valid RequisicaoNovoLivro requisicao, BindingResult resultado) {
		
		if (resultado.hasErrors()) {
			return "livro/formulario";
		} 
		
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		User user = this.userRepository.findByUsername(username);
		
		Livro livro = requisicao.toLivro();
		livro.setUser(user);
		
		livroRepository.save(livro);
		
		return "redirect:/home";
	}
}
