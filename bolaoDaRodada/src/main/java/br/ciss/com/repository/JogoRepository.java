package br.ciss.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import br.ciss.com.model.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long>{
	
}
