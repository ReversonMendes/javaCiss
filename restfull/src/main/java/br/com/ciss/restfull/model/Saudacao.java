package br.com.ciss.restfull.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "saudacao")
public class Saudacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String saudacao;

	public Saudacao(Long id, String saudacao) {
		this.id = id;
		this.saudacao = saudacao;
	}

	public Saudacao() {

	}

	public Long getId() {
		return id;
	}

	public String getSaudacao() {
		return saudacao;
	}

}
