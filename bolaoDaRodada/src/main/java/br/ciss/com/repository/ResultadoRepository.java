package br.ciss.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ciss.com.model.Resultado;

public interface ResultadoRepository extends JpaRepository<Resultado, Long> {

}
