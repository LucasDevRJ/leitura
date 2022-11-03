package com.github.lucasdevrj.mvc.leitura.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.lucasdevrj.mvc.leitura.model.Livro;
import com.github.lucasdevrj.mvc.leitura.model.StatusLivro;

@Repository //Spring criará a dependência toda vez que for necessário
public interface LivroRepository extends JpaRepository<Livro, Integer>{

	List<Livro> findByStatus(StatusLivro status);

}