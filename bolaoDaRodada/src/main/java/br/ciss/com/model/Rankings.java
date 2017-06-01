package br.ciss.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rankings")
public class Rankings {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idrankings;
	private String nome;
	private Long qtdacerto;
	private Double pontuacao;

	public Long getIdrankings() {
		return idrankings;
	}

	public void setIdrankings(Long idrankings) {
		this.idrankings = idrankings;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getQtdacerto() {
		return qtdacerto;
	}

	public void setQtdacerto(Long qtdacerto) {
		this.qtdacerto = qtdacerto;
	}

	public Double getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(Double pontuacao) {
		this.pontuacao = pontuacao;
	}

}
