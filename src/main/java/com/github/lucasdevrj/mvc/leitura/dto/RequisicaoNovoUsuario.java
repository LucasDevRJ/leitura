package com.github.lucasdevrj.mvc.leitura.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import com.github.lucasdevrj.mvc.leitura.model.Usuario;

public class RequisicaoNovoUsuario {

	@NotBlank(message = "Digite o seu nome, por favor!")
	private String nome;
	
	@NotBlank(message = "Digite o seu sonbrenome, por favor!")
	private String sobrenome;
	
	@NotNull(message = "Digite a sua data de nascimento, por favor!")
	@Past(message = "Digite uma data passada, por favor!")
	private LocalDate dataNascimento;
	
	@NotBlank(message = "Digite o seu e-mail, por favor!")
	private String email;
	
	@NotBlank(message = "Digite a sua senha, por favor!")
	private String senha;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public void setData(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public Usuario toUsuario() {
		
		Usuario usuario = new Usuario();
		usuario.setNome(nome);
		usuario.setSobrenome(sobrenome);
		usuario.setDataNascimento(dataNascimento);
		usuario.setEmail(email);
		usuario.setSenha(senha);
		
		return usuario;
	}
}
