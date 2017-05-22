package br.com.ciss.gestaofesta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ciss.gestaofesta.model.Convidado;

public interface ConvidadosRepository extends JpaRepository<Convidado, Long> {
}
