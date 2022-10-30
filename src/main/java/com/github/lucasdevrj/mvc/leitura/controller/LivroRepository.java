package com.github.lucasdevrj.mvc.leitura.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.github.lucasdevrj.mvc.leitura.model.Livro;

public class LivroRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	public List<Livro> exibeLivros() {
		Query query = entityManager.createQuery("SELECT l FROM Livro l", Livro.class);
		List<Livro> livros = query.getResultList();
		return livros;
	}
}
