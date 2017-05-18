package br.com.ciss.restfull.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ciss.restfull.model.Livro;

public interface LivroRepository  extends JpaRepository<Livro, Long>{

}
