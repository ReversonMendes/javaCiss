package br.ciss.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "jogos")
public class Jogo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idjogo;
	
	@OneToOne
	@JoinColumn(name = "idrodada")
	private Rodada rodada;
	
	@OneToOne
	@JoinColumn(name = "idtime_casa")
	private Time time_casa;
	
	@OneToOne
	@JoinColumn(name = "idtime_fora")
	private Time time_fora;

	public Long getIdjogo() {
		return idjogo;
	}

	public void setIdjogo(Long idjogo) {
		this.idjogo = idjogo;
	}


	public Time getTime_casa() {
		return time_casa;
	}

	public void setTime_casa(Time time_casa) {
		this.time_casa = time_casa;
	}

	public Time getTime_fora() {
		return time_fora;
	}

	public void setTime_fora(Time time_fora) {
		this.time_fora = time_fora;
	}

	public Rodada getRodada() {
		return rodada;
	}

	public void setRodada(Rodada rodada) {
		this.rodada = rodada;
	}
}
