package br.com.ciss.trabalho01;

/*
Classe: Pessoa
Atributos: nome, sobreNome, idade.
Método: void fazAniversario(), String nomeCompleto()

Crie uma pessoa, coloque seu nome, sobre nome e idade iniciais, 
faça alguns aniversários (aumentando a idade) e
imprima seu nome completo (utilize o método nomeCompleto()) e
sua idade.*/

public class Pessoa {
	private String nome;
	private String sobreNome;
	private int idade;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void fazAniversario() {
		this.idade++;
	}

	public void nomeCompleto() {
		System.out.println("Nome Completo:" + this.nome + " " + this.sobreNome + " Idade: " + this.idade);
	}
}
