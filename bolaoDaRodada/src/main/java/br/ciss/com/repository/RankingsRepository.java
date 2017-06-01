package br.ciss.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.ciss.com.model.Rankings;


public interface RankingsRepository extends JpaRepository<Rankings, Long>{

}
