package com.github.lucasdevrj.mvc.leitura.model;

import java.time.LocalDate;

public class Livro {

	private String nome;
	private Float preco;
	private LocalDate data;
	private String autor;
	private Integer paginas;
	private String categoria;
	private String descricao;
	private String link;
	private String linkImagem;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Float getPreco() {
		return preco;
	}
	
	public void setPreco(Float preco) {
		this.preco = preco;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public Integer getPaginas() {
		return paginas;
	}
	
	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getLink() {
		return link;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	
	public String getLinkImagem() {
		return linkImagem;
	}
	
	public void setLinkImagem(String linkImagem) {
		this.linkImagem = linkImagem;
	}
}
