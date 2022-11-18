package com.github.lucasdevrj.mvc.leitura.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.lucasdevrj.mvc.leitura.model.Livro;
import com.github.lucasdevrj.mvc.leitura.model.StatusLivro;
import com.github.lucasdevrj.mvc.leitura.repository.LivroRepository;

@RestController
@RequestMapping("/api/livros")
public class LivrosRest {
	
	@Autowired
	private LivroRepository livroRepository;

	@GetMapping("aprovado")
	public List<Livro> getLivros() {
		Sort sort = Sort.by("id").descending();
		PageRequest paginacao = PageRequest.of(0, 10, sort);
		return this.livroRepository.findByStatus(StatusLivro.APROVADO, paginacao);
	}
}
