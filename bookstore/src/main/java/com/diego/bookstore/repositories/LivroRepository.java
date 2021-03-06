package com.diego.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diego.bookstore.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

}
