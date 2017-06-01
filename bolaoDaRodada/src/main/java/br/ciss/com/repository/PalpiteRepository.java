package br.ciss.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ciss.com.model.Palpite;

public interface PalpiteRepository extends JpaRepository<Palpite, Long> {

}
