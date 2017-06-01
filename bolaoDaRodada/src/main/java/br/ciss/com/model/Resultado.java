package br.ciss.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "resultados")
public class Resultado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idresultado;
	private Long idrodada;
	private Long idjogo;
	private Long time_casa_placar;
	private Long time_fora_placar;

	public Long getIdresultado() {
		return idresultado;
	}

	public void setIdresultado(Long idresultado) {
		this.idresultado = idresultado;
	}

	public Long getIdrodada() {
		return idrodada;
	}

	public void setIdrodada(Long idrodada) {
		this.idrodada = idrodada;
	}

	public Long getIdjogo() {
		return idjogo;
	}

	public void setIdjogo(Long idjogo) {
		this.idjogo = idjogo;
	}

	public Long getTime_casa_placar() {
		return time_casa_placar;
	}

	public void setTime_casa_placar(Long time_casa_placar) {
		this.time_casa_placar = time_casa_placar;
	}

	public Long getTime_fora_placar() {
		return time_fora_placar;
	}

	public void setTime_fora_placar(Long time_fora_placar) {
		this.time_fora_placar = time_fora_placar;
	}

}
