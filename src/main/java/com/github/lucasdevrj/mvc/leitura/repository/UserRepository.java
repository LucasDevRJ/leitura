package com.github.lucasdevrj.mvc.leitura.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.github.lucasdevrj.mvc.leitura.model.Livro;
import com.github.lucasdevrj.mvc.leitura.model.StatusLivro;
import com.github.lucasdevrj.mvc.leitura.model.User;

@Repository //Spring criará a dependência toda vez que for necessário
public interface UserRepository extends JpaRepository<User, String>{

	User findByUsername(String username);

}