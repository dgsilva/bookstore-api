package com.diego.bookstore;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.diego.bookstore.domain.Categoria;
import com.diego.bookstore.domain.Livro;
import com.diego.bookstore.repositories.CategoriaRepository;
import com.diego.bookstore.repositories.LivroRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;
	@Bean
	public void instanciaBaseDeDados() {
		
		Categoria cat1 = new Categoria(null, "Informática", "Livro de TI ");
		Categoria cat2 = new Categoria(null, "Ficção Científica", "Livro de Ficção Científica ");
		Categoria cat3 = new Categoria(null, "Biografia", "Livro de Biografia ");
		
		Livro l1 = new Livro(null, "Clean code", "Robert Martin","lorem ipsum", cat1);
		Livro l2 = new Livro(null, "Engenharia de Software", "Louis V. Gerstner","lorem ipsum", cat1);
		Livro l3 = new Livro(null, "The time Machine", "H.G.Wellls","lorem ipsum", cat2);
		Livro l4 = new Livro(null, "The War of the Worlds", "H.G. Wells","lorem ipsum", cat2);
		Livro l5 = new Livro(null, "I,robot", "Isaac","lorem ipsum", cat2);
		
		cat1.getLivro().addAll(Arrays.asList(l1,l2));
		cat2.getLivro().addAll(Arrays.asList(l3,l4,l5));
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		this.livroRepository.saveAll(Arrays.asList(l1,l2,l3,l4,l5));
	}
	

}
