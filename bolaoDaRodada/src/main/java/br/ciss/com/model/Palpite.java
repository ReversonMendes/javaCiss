package br.ciss.com.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "palpites")
public class Palpite {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idpalpite;
	private Long idrodada;
	private String nome;
	private Long time_casa_palpite;
	private Long time_fora_palpite;
			
	@ManyToOne
	@JoinColumn(name = "idjogo")
	private Jogo jogo;

	public Long getIdpalpite() {
		return idpalpite;
	}

	public void setIdpalpite(Long idpalpite) {
		this.idpalpite = idpalpite;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getTime_casa_palpite() {
		return time_casa_palpite;
	}

	public void setTime_casa_palpite(Long time_casa_palpite) {
		this.time_casa_palpite = time_casa_palpite;
	}

	public Long getTime_fora_palpite() {
		return time_fora_palpite;
	}

	public void setTime_fora_palpite(Long time_fora_palpite) {
		this.time_fora_palpite = time_fora_palpite;
	}

	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

	public Long getIdrodada() {
		return idrodada;
	}

	public void setIdrodada(Long idrodada) {
		this.idrodada = idrodada;
	}
}
