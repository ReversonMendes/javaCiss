package br.com.ciss.trabalho01;

public class TestePessoa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		p1.setNome("Donald");
		p1.setSobreNome("John Trump");
		p1.setIdade(64);
		p1.fazAniversario();
		p1.fazAniversario();
		p1.fazAniversario();
		p1.fazAniversario();
		p1.fazAniversario();
		p1.nomeCompleto();
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Barack");
		p2.setSobreNome("Obama");
		p2.setIdade(56);
		p2.fazAniversario();
		p2.fazAniversario();
		p2.fazAniversario();
		p2.nomeCompleto();
	}

}
