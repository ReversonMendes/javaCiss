package br.ciss.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rodada")
public class Rodada {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idrodada;

	public Long getIdrodada() {
		return idrodada;
	}

	public void setIdrodada(Long idrodada) {
		this.idrodada = idrodada;
	}
}
