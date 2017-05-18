package br.com.ciss.restfull.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "saudacao")
public class Saudacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//os nomes é ihual do banco
	private Long id;
	private String saudacao;
	
	//aqui é diferente por isso deve indicar qual campo do banco é a variavel 
	@Column(name = "dia_semana")
	private String diaDaSemana;

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

	public String getDiaDaSemana() {
		return diaDaSemana;
	}


}
