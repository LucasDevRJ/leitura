package com.github.lucasdevrj.mvc.leitura.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.github.lucasdevrj.mvc.leitura.model.Livro;

@Repository //Spring criará a dependência toda vez que for necessário
public interface LivroRepository {
	
	public List<Livro> findAll();
}
