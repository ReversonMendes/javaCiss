package br.com.ciss.restfull.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ciss.restfull.model.Saudacao;

public interface SaudacaoRepository extends JpaRepository<Saudacao, Long> {

}
