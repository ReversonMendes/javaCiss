package br.com.ciss.gestaofesta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ciss.gestaofesta.model.Contribuicao;

public interface ContribuicaoRepository extends JpaRepository<Contribuicao, Long> {
}
