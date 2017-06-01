package br.com.ciss.gestaofesta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "convidados")
public class Convidado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	private String nome;

	@Column(name = "quantidade_acompanhantes")
	private Integer qtdAcompanhantes;

	@ManyToOne
	@JoinColumn(name = "codigo_contribuicao")
	private Contribuicao contribuicao;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQtdAcompanhantes() {
		return qtdAcompanhantes;
	}

	public void setQtdAcompanhantes(Integer qtdAcompanhantes) {
		this.qtdAcompanhantes = qtdAcompanhantes;
	}

	public Contribuicao getContribuicao() {
		return contribuicao;
	}

	public void setContribuicao(Contribuicao contribuicao) {
		this.contribuicao = contribuicao;
	}

}
