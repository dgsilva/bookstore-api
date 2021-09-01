package com.diego.bookstore;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.diego.bookstore.domain.Categoria;
import com.diego.bookstore.domain.Livro;
import com.diego.bookstore.repositories.CategoriaRepository;
import com.diego.bookstore.repositories.LivroRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}



}
