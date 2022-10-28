package com.github.lucasdevrj.mvc.leitura.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.lucasdevrj.mvc.leitura.model.Livro;

@Controller //Indica para o Spring que é um controller, para ele gerenciar
public class HomeController {

	@GetMapping("/home") //Action que retorna a view home
	public String home(Model model) {
		Livro livro = new Livro();
		livro.setNome("As coisas que você só vê quando desacelera");
		livro.setPreco(48.00f);
		livro.setCategoria("AutoAjuda");
		livro.setPaginas(256);
		livro.setDescricao("De tempos em tempos, surge um livro que, com sua maneira original de iluminar importantes temas espirituais, se torna um fenômeno tão grande em seu país de origem que acaba chamando a atenção e encantando leitores de todo o mundo.");
		livro.setAutor("Haemin Sunim");
		livro.setLink("https://www.amazon.com.br/gp/product/8543105293/ref=ppx_yo_dt_b_asin_image_o00_s00?ie=UTF8&psc=1");
		livro.setLinkImagem("https://m.media-amazon.com/images/I/61OEg3V-FTL._SX698_BO1,204,203,200_.jpg");
		
		List<Livro> livros = new ArrayList<Livro>();
		livros.add(livro);
		
		model.addAllAttributes(livros);
		
		return "/home";
	}
}
