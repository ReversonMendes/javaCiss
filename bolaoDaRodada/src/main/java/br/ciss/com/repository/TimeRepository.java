package br.ciss.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ciss.com.model.Time;




public interface TimeRepository extends JpaRepository<Time, Long>{

}
