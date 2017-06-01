package br.ciss.com.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "time")
public class Time {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idtime;
	private String nome_time;
	private String escudo_link;

	public Long getIdtime() {
		return idtime;
	}

	public void setIdtime(Long idtime) {
		this.idtime = idtime;
	}

	public String getNome_time() {
		return nome_time;
	}

	public void setNome_time(String nome_time) {
		this.nome_time = nome_time;
	}

	public String getEscudo_link() {
		return escudo_link;
	}

	public void setEscudo_link(String escudo_link) {
		this.escudo_link = escudo_link;
	}
}
