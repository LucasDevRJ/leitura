package com.github.lucasdevrj.mvc.leitura.dto;

import java.time.LocalDate;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.github.lucasdevrj.mvc.leitura.model.Livro;

public class RequisicaoNovoLivro {

	@NotNull
	private String nome;
	
	@NotNull
	@DecimalMin("1.00") 
	private Float preco;
	
	@NotNull 
	@Past
	private LocalDate data;
	
	@NotNull
	private String autor;
	
	@NotNull
	@Min(1)
	private Integer paginas;

	@NotNull
	private String categoria;
	
	@NotNull
	@Size(min=100, max=1000)
	private String descricao;
	
	@NotNull
	private String link;
	
	@NotNull
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

	public Livro toLivro() {
		
		Livro livro = new Livro();
		livro.setNome(nome);
		livro.setPreco(preco);
		livro.setData(data);
		livro.setAutor(autor);
		livro.setPaginas(paginas);
		livro.setCategoria(categoria);
		livro.setLink(link);
		livro.setDescricao(descricao);
		livro.setLinkImagem(linkImagem);
		
		return livro;
	}
}
