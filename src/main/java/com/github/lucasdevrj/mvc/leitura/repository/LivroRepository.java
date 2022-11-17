package com.github.lucasdevrj.mvc.leitura.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.github.lucasdevrj.mvc.leitura.model.Livro;
import com.github.lucasdevrj.mvc.leitura.model.StatusLivro;

@Repository //Spring criará a dependência toda vez que for necessário
public interface LivroRepository extends JpaRepository<Livro, Integer>{

	List<Livro> findByStatus(StatusLivro status, Pageable sort);

	@Query("SELECT l FROM Livro l JOIN l.user u WHERE u.username = :username")
	List<Livro> findAllByUsuario(@Param("username") String username);

	@Query("SELECT l FROM Livro l JOIN l.user u WHERE u.username = :username AND l.status = :status")
	List<Livro> findByStatusUsuario(@Param("status") StatusLivro status, @Param("username") String username);

}